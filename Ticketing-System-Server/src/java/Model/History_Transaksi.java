/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author natha
 */
public class History_Transaksi {
    private int id;
    private double jumlah;
    private User user;
    private Boolean is_topup;
    private NotaAcara notaAcara;
    private NotaParkir notaParkir;
    private String tanggal_topup;
    

    public History_Transaksi(int id, double jumlah) {
        this.id = id;
        this.jumlah = jumlah;
        this.tanggal_topup = "";
    }
    
    public History_Transaksi(int id, double jumlah, User user, Boolean is_topup, NotaAcara notaAcara, NotaParkir notaParkir) {
        this.id = id;
        this.jumlah = jumlah;
        this.user = user;
        this.is_topup = is_topup;
        this.notaAcara = notaAcara;
        this.notaParkir = notaParkir;
        this.tanggal_topup = "";
    }
    
    public History_Transaksi(double jumlah, User user) {
        this.jumlah = jumlah;
        this.user = user;        
        this.is_topup = true;
        this.tanggal_topup = "";
    }

    public History_Transaksi(int id,double jumlah, User user, String keterangan, NotaAcara notaAcara) {
        this.id = id;
        this.jumlah = jumlah;
        this.user = user;
        this.is_topup = false;
        this.notaAcara = notaAcara;     
        this.notaParkir = null;  
        this.tanggal_topup = "";
    }
    
    public History_Transaksi(int id,double jumlah, User user, String keterangan, NotaParkir notaParkir) {
        this.id = id;
        this.jumlah = jumlah;
        this.user = user;
        this.is_topup = true;
        this.notaAcara = null;   
        this.notaParkir = notaParkir;        
    }
    
     public History_Transaksi() {
        this.id = 0;
        this.jumlah = 0.0;
        this.user = new User();
        this.is_topup = false;
        this.notaAcara = new NotaAcara();
        this.notaParkir = new NotaParkir(); 
        this.tanggal_topup = "";
    }
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
   
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public Boolean Is_topup() {
        return is_topup;
    }

    public void set_topup(Boolean is_topup) {
        this.is_topup = is_topup;
    }

    public NotaAcara getNotaAcara() {
        return notaAcara;
    }

    public void setNotaAcara(NotaAcara notaAcara) {
        this.notaAcara = notaAcara;
    }

    public NotaParkir getNotaParkir() {
        return notaParkir;
    }

    public void setNotaParkir(NotaParkir notaParkir) {
        this.notaParkir = notaParkir;
    }
    public String getTanggal_topup() {
        return tanggal_topup;
    }

    public void setTanggal_topup(String tanggal_topup) {
        this.tanggal_topup = tanggal_topup;
    }
    public Boolean getIs_topup() {
        return is_topup;
    }

    public void setIs_topup(Boolean is_topup) {
        this.is_topup = is_topup;
    }
    
    
    public boolean topUpSaldo() {
        try {
            Koneksi a = new Koneksi();
            if (!Koneksi.getConn().isClosed()) {
                PreparedStatement sql = Koneksi.getConn().prepareStatement("INSERT INTO history_transaksi(jumlah, users_id, is_topup, topup_date) VALUES (?, ?, ?,now())");
                sql.setDouble(1, this.jumlah);
                sql.setInt(2, this.user.getId());          
                sql.setBoolean(3, this.is_topup);
            
                int rowAffected = sql.executeUpdate();                
                sql.close();
                
                PreparedStatement updateSaldo = Koneksi.getConn().prepareStatement("UPDATE users SET saldo = saldo + ? WHERE (id = ?);");
                updateSaldo.setDouble(1, this.jumlah);
                updateSaldo.setInt(2, this.user.getId()); 
            
                rowAffected = updateSaldo.executeUpdate();                
                updateSaldo.close();
                
                return rowAffected > 0;
            }
        } catch (Exception ex) {
            System.out.println("failed because : " + ex.getMessage());
        }
        return false;
    }
    
    public static ArrayList<History_Transaksi> DataHistoryTransaksi(int userId) {
        ArrayList<History_Transaksi> collections = new ArrayList<>();
        Koneksi k = new Koneksi();
        try {       
            if (!Koneksi.getConn().isClosed()) {
                k.setStatement(Koneksi.getConn().prepareStatement("SELECT * FROM history_transaksi WHERE users_id = ?"));
                PreparedStatement sql = (PreparedStatement) k.getStatement();
                sql.setInt(1, userId); 
                k.setResult(sql.executeQuery());            

                while (k.getResult().next()) {                                        
                    History_Transaksi tampung = new History_Transaksi();
                    tampung.setId(k.getResult().getInt("id"));
                    tampung.setJumlah(k.getResult().getDouble("jumlah"));
                    tampung.setUser(User.findById(k.getResult().getInt("users_id")));
                    tampung.set_topup(k.getResult().getInt("is_topup") == 1);
                    tampung.getNotaAcara().setId(k.getResult().getInt("nota_acara_id"));
                    tampung.getNotaParkir().setId(k.getResult().getInt("nota_parkir_id"));
                    Timestamp tm = k.getResult().getTimestamp("topup_date");
                    if(tm != null){
                        tampung.setTanggal_topup(tm.toString());                        
                    }
                    else{
                        tampung.setTanggal_topup(null);                        
                        tampung.setNotaAcara(NotaAcara.findById(tampung.getNotaAcara().getId()));                        
                        tampung.setNotaParkir(NotaParkir.findById(tampung.getNotaParkir().getId()));                                        
                    }                                                            
                    collections.add(tampung);
                }                
                return collections;            
            }
        } catch (SQLException ex) {
            System.out.println("Failed because: " + ex.getMessage());
            ex.printStackTrace();
        }
        return null;
}



}
