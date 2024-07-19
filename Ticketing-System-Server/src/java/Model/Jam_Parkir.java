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
 * @author Lenovo
 */
public class Jam_Parkir {
    private int id;
    private String jam_mulai;
    private String jam_selesai;

    public Jam_Parkir() {
        this.id = 0;
        this.jam_mulai = "";
        this.jam_selesai = "";
    }

    public Jam_Parkir(int id, String jam_mulai, String jam_selesai) {
        this.id = id;
        this.jam_mulai = jam_mulai;
        this.jam_selesai = jam_selesai;
    }

    public String getJam_selesai() {
        return jam_selesai;
    }

    public void setJam_selesai(String jam_selesai) {
        this.jam_selesai = jam_selesai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJam_mulai() {
        return jam_mulai;
    }

    public void setJam_mulai(String jam_mulai) {
        this.jam_mulai = jam_mulai;
    }
    
    public static ArrayList<Jam_Parkir> viewListData() {
        ArrayList<Jam_Parkir> collections = new ArrayList<>();
        Koneksi k = new Koneksi();
        try
        {
            k.setStatement((Statement)Koneksi.getConn().createStatement());
            k.setResult(k.getStatement().executeQuery("SELECT * FROM jam_parkir"));
            while (k.getResult().next())
            {
                Jam_Parkir temp = new Jam_Parkir(k.getResult().getInt("id"), 
                        k.getResult().getTime("jam_mulai").toString(), 
                        k.getResult().getTime("jam_selesai").toString());
                collections.add(temp);
            }
            return collections;          
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    public static Jam_Parkir findById(int id){
        Koneksi a = new Koneksi();
        try {
            String query = "SELECT * FROM jam_parkir WHERE id = ?";
            a.setStatement(Koneksi.getConn().prepareStatement(query));
            PreparedStatement sql = (PreparedStatement) a.getStatement();
            sql.setInt(1, id);            
            a.setResult(sql.executeQuery());
            if (a.getResult().next()) {
                Jam_Parkir jp = new Jam_Parkir(id, a.getResult().getTime("jam_mulai").toString(), a.getResult().getTime("jam_selesai").toString());
                return jp;
            }
        } catch (SQLException ex) {
            System.out.println("Failed because: " + ex.getMessage());
        }
        return null;
    }
}
