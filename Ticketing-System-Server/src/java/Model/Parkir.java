/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author natha
 */
public class Parkir{
    private int id;
    private String nama;
    private String lokasi;      
    
    public Parkir(int id, String nama, String lokasi ) {
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;                
    }
    
    public Parkir() {
        this.id = 0;
        this.nama = "";
        this.lokasi = "";                
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    public static Parkir findById(int id) {
        Koneksi a = new Koneksi();
        try {
            String query = "SELECT id, nama, lokasi FROM parkir WHERE id = ?";
            a.setStatement(Koneksi.getConn().prepareStatement(query));
            PreparedStatement sql = (PreparedStatement) a.getStatement();
            sql.setInt(1, id);
            a.setResult(sql.executeQuery());
            if (a.getResult().next()) {
                Parkir parkir = new Parkir(
                    a.getResult().getInt("id"),
                    a.getResult().getString("nama"),
                    a.getResult().getString("lokasi")                    
                );
                return parkir;
            }
        } catch (SQLException ex) {
            System.out.println("Failed because: " + ex.getMessage());
        }
        return null;
    }

    public static ArrayList<Parkir> viewListData() {
        ArrayList<Parkir> collections = new ArrayList<>();
        Koneksi k = new Koneksi();
        try
        {
            k.setStatement((Statement)Koneksi.getConn().createStatement());
            k.setResult(k.getStatement().executeQuery("SELECT * FROM Parkir"));
            while (k.getResult().next())
            {
                Parkir tampung = new Parkir(k.getResult().getInt("id"), 
                        k.getResult().getString("nama"), 
                        k.getResult().getString("lokasi"));
                collections.add(tampung);
            }
            return collections;
          
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return null;
    }            
    
    public void getParkir(){        
        Koneksi k = new Koneksi();
        try
        {                  
            k.setStatement(Koneksi.getConn().prepareStatement("SELECT * FROM parkir WHERE id = ?"));
            PreparedStatement sql = (PreparedStatement)k.getStatement();
            sql.setInt(1, this.id);
            k.setResult(sql.executeQuery());
            if (k.getResult().next()) {
                this.setNama(k.getResult().getString("nama"));                
                this.setLokasi(k.getResult().getString("lokasi"));                
            }                          
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }        
    }
    
    public ArrayList<Slot_Parkir> getDataSlotParkir(){
        Koneksi k = new Koneksi();
        try
        {   
            this.getParkir();
            ArrayList<Slot_Parkir> listSlotParkir = new ArrayList<>();
            k.setStatement(Koneksi.getConn().prepareStatement("SELECT * FROM slot_parkir WHERE parkir_id = ?"));
            PreparedStatement sql = (PreparedStatement)k.getStatement();
            sql.setInt(1, this.id);
            k.setResult(sql.executeQuery());
            while (k.getResult().next()) {
                Slot_Parkir temp = new Slot_Parkir(this, k.getResult().getString("kode"), k.getResult().getDouble("harga"));  
                listSlotParkir.add(temp);
            }     
            return listSlotParkir;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return null;
    }



}
