/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author natha
 */
public class Slot_Parkir{
    private Parkir parkir;
    private String kode;
    private double harga;
    
    public Slot_Parkir() {
        this.parkir = new Parkir();
        this.kode = "";
        this.harga = 0.0;
    }

    public Slot_Parkir(Parkir parkir, String kode, double harga) {
        this.parkir = parkir;
        this.kode = kode;
        this.harga = harga;
    }
        
    public Parkir getParkir() {
        return parkir;
    }

    public void setParkir(Parkir parkir) {
        this.parkir = parkir;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }            
    public static Slot_Parkir findByKodeIdParkir(int parkir_id, String kode) {
        Koneksi a = new Koneksi();
        try {
            String query = "SELECT * FROM slot_parkir WHERE parkir_id = ? and kode = ?";
            a.setStatement(Koneksi.getConn().prepareStatement(query));
            PreparedStatement sql = (PreparedStatement) a.getStatement();
            sql.setInt(1, parkir_id);
            sql.setString(2, kode);
            a.setResult(sql.executeQuery());
            if (a.getResult().next()) {
                int parkirId = a.getResult().getInt("parkir_id");                
                Parkir p = Parkir.findById(parkirId);
                
                Slot_Parkir slotParkir = new Slot_Parkir(p,a.getResult().getString("kode"),a.getResult().getDouble("harga"));
                return slotParkir;
            }
        } catch (SQLException ex) {
            System.out.println("Failed because: " + ex.getMessage());
        }
        return null;
    }
    
    public static boolean CekKetersediaan(Slot_Parkir slot_parkir, Jam_Parkir jam_parkir, Date tanggal_booking){
        Koneksi a = new Koneksi();
        try {
            String query = "SELECT * FROM nota_parkir WHERE slot_parkir_parkir_id = ? and slot_parkir_kode = ? and  jam_parkir_id = ? and tanggal_booking = ?";
            a.setStatement(Koneksi.getConn().prepareStatement(query));
            PreparedStatement sql = (PreparedStatement) a.getStatement();
            sql.setInt(1, slot_parkir.getParkir().getId());
            sql.setString(2, slot_parkir.getKode());
            sql.setInt(3, jam_parkir.getId());
            sql.setDate(4, tanggal_booking);
            a.setResult(sql.executeQuery());            
            if (a.getResult().next()) {                
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Failed because: " + ex.getMessage());
        }
        return true;
    }
}
