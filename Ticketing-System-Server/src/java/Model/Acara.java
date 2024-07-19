/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author natha
 */
public class Acara{

    private int id;
    private String nama;    
    private String lokasi;
    private String tanggalAcara;
    private String deskripsi;
    private double harga;
    
    public Acara(int id, String nama, String lokasi, String tanggalAcara, String deskripsi, double harga) {
        this.id = id;
        this.nama = nama;        
        this.lokasi = lokasi;
        this.tanggalAcara = tanggalAcara;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }  
    public Acara() {
        this.id = 0;
        this.nama = "";        
        this.lokasi = "";
        this.tanggalAcara = "";
        this.deskripsi = "";
        this.harga = 0.0;
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

    public String getTanggalAcara() {
        return tanggalAcara;
    }

    public void setTanggalAcara(String tanggalAcara) {
        this.tanggalAcara = tanggalAcara;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public static ArrayList<Acara> viewListData() {
        ArrayList<Acara> collections = new ArrayList<Acara>();
        Koneksi k = new Koneksi();
        try {
            k.setStatement((Statement)Koneksi.getConn().createStatement());
            k.setResult(k.getStatement().executeQuery("SELECT * FROM Acara where tanggal_acara > now()"));
            while (k.getResult().next()) {
                Acara tampung = new Acara(k.getResult().getInt("id"),
                        k.getResult().getString("nama"),                        
                        k.getResult().getString("lokasi"),
                        k.getResult().getTimestamp("tanggal_acara").toString(),
                        k.getResult().getString("deskripsi"),
                        k.getResult().getDouble("harga"));
                collections.add(tampung);
            }
            return collections;            
        } catch (SQLException ex) {
            System.out.println("Failed because : " + ex.getSQLState());
        }
        return null;
    }
     
     public static Acara findById(int id) {
        Koneksi a = new Koneksi();
        try {
            a.setStatement(Koneksi.getConn().prepareStatement("SELECT * FROM Acara WHERE id=?;"));
            PreparedStatement sql = (PreparedStatement)a.getStatement();
            sql.setInt(1, id);
            a.setResult(sql.executeQuery());
            if (a.getResult().next()) {
                Acara acara = new Acara(a.getResult().getInt("id"),
                        a.getResult().getString("nama"),
                        a.getResult().getString("lokasi"),
                        a.getResult().getTimestamp("tanggal_acara").toString(),
                        a.getResult().getString("deskripsi"),
                        a.getResult().getDouble("harga"));
                return acara;
            }
        } catch (SQLException ex) {
            System.out.println("Failed because : " + ex.getMessage());
        }
        return null;
    }
     
     public static Acara findByDate(Timestamp tgl) {
        Koneksi a = new Koneksi();
        try {
            a.setStatement(Koneksi.getConn().prepareStatement("SELECT * FROM Acara WHERE tanggal_acara = ?;"));
            PreparedStatement sql = (PreparedStatement)a.getStatement();
            sql.setTimestamp(1, tgl);
            a.setResult(sql.executeQuery());
            if (a.getResult().next()) {
                Acara acara = new Acara(a.getResult().getInt("id"), a.getResult().getString("nama"), a.getResult().getString("lokasi"), a.getResult().getTimestamp("tanggal_acara").toString(), a.getResult().getString("deskripsi"), a.getResult().getDouble("harga"));
                return acara;
            }
        } catch (SQLException ex) {
            System.out.println("Failed because : " + ex.getMessage());
        }
        return null;
    }
     
     public static Acara findByName(String nama) {
        Koneksi a = new Koneksi();
        try {
            a.setStatement(Koneksi.getConn().prepareStatement("SELECT * FROM Acara WHERE nama = ? and tanggal_acara > now();"));
            PreparedStatement sql = (PreparedStatement)a.getStatement();
            sql.setString(1, nama);
            a.setResult(sql.executeQuery());
            if (a.getResult().next()) {
                Acara acara = new Acara(a.getResult().getInt("id"), 
                        a.getResult().getString("nama"),  
                        a.getResult().getString("lokasi"), 
                        a.getResult().getTimestamp("tanggal_acara").toString(),
                        a.getResult().getString("deskripsi"), 
                        a.getResult().getDouble("harga"));
                return acara;
            }
        } catch (SQLException ex) {
            System.out.println("Failed because : " + ex.getMessage());
        }
        return null;
    }
    
}
