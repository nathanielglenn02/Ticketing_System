/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author natha
 */
public class NotaParkir{
    private int id;
    private String tanggal_transaksi;
    private User user;
    private String tanggal_booking;
    private Slot_Parkir slot_parkir;
    private Jam_Parkir jam_parkir;
    private Double harga;

    public NotaParkir() {
        this.id = 0;
        this.tanggal_transaksi = "";
        this.user = new User();
        this.tanggal_booking = "";
        this.slot_parkir = new Slot_Parkir();
        this.jam_parkir = new Jam_Parkir();
        this.harga = 0.0;
    } 
     
    public NotaParkir(int id, String tanggal_transaksi, User user, String tanggal_booking, Slot_Parkir slot_parkir, Jam_Parkir jam_parkir,Double harga) {
        this.id = id;
        this.tanggal_transaksi = tanggal_transaksi;
        this.user = user;
        this.tanggal_booking = tanggal_booking;
        this.slot_parkir = slot_parkir;
        this.jam_parkir = jam_parkir;
        this.harga = harga;
    }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanggal_transaksi() {
        return tanggal_transaksi;
    }

    public void setTanggal_transaksi(String tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTanggal_booking() {
        return tanggal_booking;
    }

    public void setTanggal_booking(String tanggal_booking) {
        this.tanggal_booking = tanggal_booking;
    }

    public Slot_Parkir getSlot_parkir() {
        return slot_parkir;
    }

    public void setSlot_parkir(Slot_Parkir slot_parkir) {
        this.slot_parkir = slot_parkir;
    }

    public Jam_Parkir getJam_parkir() {
        return jam_parkir;
    }

    public void setJam_parkir(Jam_Parkir jam_parkir) {
        this.jam_parkir = jam_parkir;
    }
    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }
    
//    public static NotaParkir findById(int id) {
//    Koneksi a = new Koneksi();
//    try {
//        String query = "SELECT nota_parkir.id, nota_parkir.tgl_reservasi, nota_parkir.tgl_finish, nota_parkir.harga, " +
//                       "slot_parkir.id AS posisiId, slot_parkir.kode, slot_parkir.harga AS posisiHarga, " +
//                       "users.id AS userId, users.username, users.password, users.saldo, users.no_telp, users.email " +
//                       "FROM nota_parkir " +
//                       "INNER JOIN slot_parkir ON nota_parkir.slot_parkir_id = slot_parkir.id " +
//                       "INNER JOIN users ON nota_parkir.users_id = users.id " +
//                       "WHERE nota_parkir.id = ?";
//        a.setStatement(Koneksi.getConn().prepareStatement(query));
//        PreparedStatement sql = (PreparedStatement) a.getStatement();
//        sql.setInt(1, id);
//        a.setResult(sql.executeQuery());
//        
//        if (a.getResult().next()) {
//            int posisiId = a.getResult().getInt("posisiId");
//            String kode = a.getResult().getString("kode");
//            double posisiHarga = a.getResult().getDouble("posisiHarga");
//            Parkir p = Parkir.findById(posisiId);
//            Slot_Parkir posisi = new Slot_Parkir(p, kode, posisiHarga);
//
//            User user = new User(
//                a.getResult().getInt("userId"),
//                a.getResult().getString("username"),
//                a.getResult().getString("password"),
//                a.getResult().getDouble("saldo"),
//                a.getResult().getString("no_telp"),
//                a.getResult().getString("email")
//            );
//
//            NotaParkir notaParkir = new NotaParkir(
//                a.getResult().getInt("id"),
//                posisi,
//                user,
//                a.getResult().getTimestamp("tgl_reservasi"),
//                a.getResult().getTimestamp("tgl_finish"),
//                a.getResult().getDouble("harga")
//            );
//
//            return notaParkir;
//        }
//    } catch (SQLException ex) {
//        System.out.println("Failed because: " + ex.getMessage());
//    }
//    return null;
//} 
    
//    
    public boolean insertData() {
        try{
            Koneksi a = new Koneksi();
            if (!Koneksi.getConn().isClosed()){
                if(this.user.getSaldo() >= this.slot_parkir.getHarga()){
                    a.setStatement(Koneksi.getConn().prepareStatement("UPDATE users SET saldo = saldo - ? WHERE id = ?"));
                    PreparedStatement sqlUpdateSaldo = (PreparedStatement)a.getStatement();
                    sqlUpdateSaldo.setDouble(1, this.slot_parkir.getHarga());
                    sqlUpdateSaldo.setInt(2, this.user.getId());
                    if(sqlUpdateSaldo.executeUpdate() != 0){
                        sqlUpdateSaldo.close();
                        
                        a.setStatement(Koneksi.getConn().prepareStatement(
                        "Insert ignore into nota_parkir(tanggal_transaksi,users_id,tanggal_booking,slot_parkir_parkir_id,slot_parkir_kode,jam_parkir_id,harga) values (now(),?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS));
                        PreparedStatement sql = (PreparedStatement)a.getStatement() ;
                        sql.setInt(1, this.user.getId());
                        sql.setDate(2, Date.valueOf(this.tanggal_booking));
                        sql.setInt(3, this.slot_parkir.getParkir().getId());
                        sql.setString(4, this.slot_parkir.getKode());
                        sql.setInt(5, this.jam_parkir.getId());
                        sql.setDouble(6, this.slot_parkir.getHarga());
                        if(sql.executeUpdate() != 0){
                            ResultSet rs = sql.getGeneratedKeys();
                            if(rs.next()){                                                                                                                                
                                this.id = rs.getInt(1);        
                                
                                a.setStatement(Koneksi.getConn().prepareStatement("INSERT INTO history_transaksi(jumlah, users_id, is_topup, nota_parkir_id) VALUES (?, ?, 0, ?)"));
                                PreparedStatement tambahNota = (PreparedStatement)a.getStatement();
                                tambahNota.setDouble(1, this.slot_parkir.getHarga());
                                tambahNota.setInt(2, this.user.getId());
                                tambahNota.setInt(3, this.id);
                                int rowAffected = tambahNota.executeUpdate();
                                tambahNota.close();

                                return rowAffected != 0;
                            }
                        }
                        
                    }
                    
                }
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public static NotaParkir findById(int id) {
        Koneksi k = new Koneksi();
        try {
            k.setStatement(Koneksi.getConn().prepareStatement("SELECT * FROM nota_parkir WHERE id = ?"));
            PreparedStatement sql = (PreparedStatement)k.getStatement();
            sql.setInt(1, id);
            k.setResult(sql.executeQuery());
            if (k.getResult().next()) {
                NotaParkir np = new NotaParkir();
                np.setId(k.getResult().getInt("id"));
                np.setTanggal_transaksi(k.getResult().getTimestamp("tanggal_transaksi").toString());
                np.setUser(User.findById(k.getResult().getInt("users_id")));
                np.setTanggal_booking(k.getResult().getDate("tanggal_booking").toString());
                np.setSlot_parkir(Slot_Parkir.findByKodeIdParkir(k.getResult().getInt("slot_parkir_parkir_id"), k.getResult().getString("slot_parkir_kode")));
                np.setJam_parkir(Jam_Parkir.findById(k.getResult().getInt("jam_parkir_id")));
                np.setHarga(k.getResult().getDouble("harga"));
                
                return np;
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


        
}
