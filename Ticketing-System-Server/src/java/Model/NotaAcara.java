/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author natha
 */
public class NotaAcara{
    private int id;
    private User user;
    private Acara acara;
    private int jumlah;
    private double harga;    
    private String tanggal_Transaksi;
    private Boolean status;

    public NotaAcara(int id, User user, Acara acara, int jumlah, double harga, String tanggal_Transaksi, Boolean status) {
        this.id = id;
        this.user = user;
        this.acara = acara;
        this.jumlah = jumlah;
        this.harga = harga;
        this.tanggal_Transaksi = tanggal_Transaksi;
        this.status = status;
    }
    
    
    public NotaAcara(int id, User user, Acara acara, int jumlah, double harga, Timestamp tanggal_transaksi) {
        this.id = id;
        this.user = user;
        this.acara = acara;
        this.jumlah = jumlah;
        this.harga = harga;    
        setTanggal_Transaksi(tanggal_transaksi.toString());
    }
    
    public NotaAcara() {
        this.id = 0;
        this.user = new User();
        this.acara = new Acara();
        this.jumlah = 0;
        this.harga = 0.0;     
        this.tanggal_Transaksi = "";
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Acara getAcara() {
        return acara;
    }

    public void setAcara(Acara acara) {
        this.acara = acara;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public String getTanggal_Transaksi(){
        return tanggal_Transaksi;
    }
    
    public void setTanggal_Transaksi(String tanggal_Transaksi){
        this.tanggal_Transaksi = tanggal_Transaksi;
    }
        
    
    public boolean insertData() {
        try {
            Koneksi a = new Koneksi();
            if (!Koneksi.getConn().isClosed()) {
                User u = User.findById(user.getId());
                if(u.getSaldo()>=harga)
                {
                    a.setStatement(Koneksi.getConn().prepareStatement("UPDATE users SET saldo = saldo - ? WHERE id = ?"));
                    PreparedStatement sqlUpdateSaldo = (PreparedStatement)a.getStatement();
                    sqlUpdateSaldo.setDouble(1, harga);
                    sqlUpdateSaldo.setInt(2, user.getId());
                    int rowAffected = sqlUpdateSaldo.executeUpdate();
                    sqlUpdateSaldo.close();

                    a.setStatement(Koneksi.getConn().prepareStatement("INSERT INTO nota_acara(users_id, Acara_id, jumlah, harga,tanggal_transaksi,status) VALUES (?, ?, ?, ?,now(),0)"));
                    PreparedStatement sql = (PreparedStatement)a.getStatement();
                    sql.setInt(1, user.getId());
                    sql.setInt(2, acara.getId());
                    sql.setInt(3, jumlah);
                    sql.setDouble(4, harga);
                    sql.executeUpdate();
                    sql.close();
                    
                    String query = "SELECT * FROM nota_acara where id=(select last_insert_id())";
                    a.setStatement(Koneksi.getConn().prepareStatement(query));
                    PreparedStatement idNota = (PreparedStatement)a.getStatement();
                    a.setResult(idNota.executeQuery());
                    if (a.getResult().next()) {
                        this.setId(a.getResult().getInt("id"));
                    }
                    
                    a.setStatement(Koneksi.getConn().prepareStatement("INSERT INTO history_transaksi(jumlah, users_id, is_topup, nota_acara_id) VALUES (?, ?, 0, ?)"));
                    PreparedStatement tambahNota = (PreparedStatement)a.getStatement();
                    tambahNota.setDouble(1, harga);
                    tambahNota.setInt(2, user.getId());
                    tambahNota.setInt(3, id);
                    tambahNota.executeUpdate();
                    tambahNota.close();

                    return rowAffected != 0;
                }
                return false;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static NotaAcara findById(int id) {
        Koneksi a = new Koneksi();
        try {
            String query = "SELECT nota_acara.id, nota_acara.jumlah, nota_acara.harga, users.id AS userId, users.username, users.password, users.saldo, users.no_telp, users.email, " +
                           "acara.id AS acaraId, acara.nama, acara.kuota, acara.lokasi, acara.tanggal_acara, acara.deskripsi, acara.harga AS acaraHarga " +
                           "FROM nota_acara " +
                           "INNER JOIN users ON nota_acara.users_id = users.id " +
                           "INNER JOIN acara ON nota_acara.Acara_id = acara.id " +
                           "WHERE nota_acara.id = ?";
            a.setStatement(Koneksi.getConn().prepareStatement(query));
            PreparedStatement sql = (PreparedStatement)a.getStatement();
            sql.setInt(1, id);
            a.setResult(sql.executeQuery());
            if (a.getResult().next()) {
                User user = new User(a.getResult().getInt("user_id"), a.getResult().getString("username"), a.getResult().getString("password"), a.getResult().getDouble("saldo"), a.getResult().getString("no_telp"), a.getResult().getString("email"));
                Acara acara = new Acara(a.getResult().getInt("acaraId"), a.getResult().getString("nama"), a.getResult().getString("lokasi"), a.getResult().getDate("tanggal_acara").toString(), a.getResult().getString("deskripsi"), a.getResult().getDouble("acaraHarga"));
                NotaAcara notaAcara = new NotaAcara(a.getResult().getInt("id"), user, acara, a.getResult().getInt("jumlah"), a.getResult().getDouble("harga"),a.getResult().getTimestamp("tanggal_transaksi"));
                return notaAcara;
            }
        } catch (SQLException ex) {
            System.out.println("Failed because : " + ex.getMessage());
        }
        return null;
    }         
    public static Boolean ClaimTicketAcara(int acaraId){
        try {
            Koneksi a = new Koneksi();
            if (!Koneksi.getConn().isClosed()) {
                PreparedStatement sql = Koneksi.getConn().prepareStatement("SELECT a.tanggal_acara FROM nota_acara as na inner join acara as a on na.acara_id = a.id WHERE na.id = ? and na.status ='0'");
                sql.setInt(1, acaraId);
                ResultSet rs = sql.executeQuery();

                if (rs.next()) {
                    Timestamp timestamp = rs.getTimestamp("tanggal_acara");
                    if (timestamp != null) {
                        LocalDate transactionDate = timestamp.toLocalDateTime().toLocalDate();
                        LocalDate currentDate = LocalDate.now();

                        if (transactionDate.equals(currentDate)) {
                            rs.close();
                            sql.close();

                            PreparedStatement updateStatus = Koneksi.getConn().prepareStatement(
                                "UPDATE nota_acara SET status = '1' WHERE id = ?"
                            );                            
                            updateStatus.setInt(1, acaraId);
                            updateStatus.executeUpdate();
                            updateStatus.close();

                            return true;
                        }
                    }
                }

                rs.close();
                sql.close();
            }
        } catch (SQLException ex) {
            System.out.println("failed because: " + ex.getMessage());
            ex.printStackTrace();
        }
        return false;
    }
    public static ArrayList<NotaAcara> viewListNotaAcara(int idUser) {
        ArrayList<NotaAcara> collections = new ArrayList<NotaAcara>();
        Koneksi k = new Koneksi();
        try {
            k.setStatement(Koneksi.getConn().prepareStatement("SELECT * FROM nota_acara where users_id = ? "));            
            PreparedStatement sql = (PreparedStatement) k.getStatement();
            sql.setInt(1, idUser); 
            k.setResult(sql.executeQuery());
            while (k.getResult().next()) {
                int id = k.getResult().getInt("id");
                int userId = k.getResult().getInt("users_id");
                int acaraId = k.getResult().getInt("Acara_id");
                int jumlah = k.getResult().getInt("jumlah");
                double harga = k.getResult().getDouble("harga");
                Timestamp tgl = k.getResult().getTimestamp("tanggal_transaksi");
                boolean status = k.getResult().getBoolean("status");
                
                Acara a = Acara.findById(acaraId);
                User u = User.findById(userId);
                
                NotaAcara tampung = new NotaAcara(id, u,a,jumlah,harga,tgl.toString(),status);
                collections.add(tampung);
            }
            return collections;
        } catch (SQLException ex) {
            System.out.println("Failed because : " + ex.getSQLState());
        }
        return null;
    }
     public static ArrayList<NotaAcara> BacaDataNotaAcaraBelumClaim(int idUser) {
        ArrayList<NotaAcara> collections = new ArrayList<NotaAcara>();
        Koneksi k = new Koneksi();
        try {
            k.setStatement(Koneksi.getConn().prepareStatement("SELECT * FROM nota_acara where users_id = ? and status = '0'"));            
            PreparedStatement sql = (PreparedStatement) k.getStatement();
            sql.setInt(1, idUser); 
            k.setResult(sql.executeQuery());
            while (k.getResult().next()) {
                int id = k.getResult().getInt("id");
                int userId = k.getResult().getInt("users_id");
                int acaraId = k.getResult().getInt("Acara_id");
                int jumlah = k.getResult().getInt("jumlah");
                double harga = k.getResult().getDouble("harga");
                Timestamp tgl = k.getResult().getTimestamp("tanggal_transaksi");
                boolean status = k.getResult().getBoolean("status");
                
                Acara a = Acara.findById(acaraId);
                User u = User.findById(userId);
                
                NotaAcara tampung = new NotaAcara(id, u,a,jumlah,harga,tgl.toString(),status);
                collections.add(tampung);
            }
            return collections;
        } catch (SQLException ex) {
            System.out.println("Failed because : " + ex.getSQLState());
        }
        return null;
    }

}
