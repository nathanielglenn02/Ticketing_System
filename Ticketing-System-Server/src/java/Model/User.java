/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author natha
 */
public class User {

    private int id;
    private String username;
    private String password;
    private double saldo;
    private String noTelp;
    private String email;    
        
    public User(int id, String username, String password, double saldo, String noTelp, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.saldo = saldo;
        this.noTelp = noTelp;
        this.email = email;        
    }

    public User(int id, String username, String password, String noTelp, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.saldo = 0;
        this.noTelp = noTelp;
        this.email = email;        
    }
    
    public User(){
        this.id = 0;
        this.username = "";
        this.password = "";
        this.saldo = 0.0;
        this.noTelp = "";
        this.email = "";        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        String[] temp = new String[]{
            String.valueOf(this.id),
            this.username,
            String.valueOf(this.saldo),
            this.noTelp,
            this.email
        };
        return String.join("~", temp);
    }
    
    public static User CekLogin(String username, String password){
        Koneksi k = new Koneksi();
        try
        {                        
            k.setStatement(Koneksi.getConn().prepareStatement("SELECT * FROM users where username = ? and password = md5(?)"));
            PreparedStatement sql = (PreparedStatement)k.getStatement() ;
            sql.setString(1, username);
            sql.setString(2, password);
            k.setResult(sql.executeQuery());
            if (k.getResult().next())
            {
                User temp = new User(k.getResult().getInt("id"), 
                        k.getResult().getString("username"), 
                        "", 
                        k.getResult().getDouble("saldo"),
                        k.getResult().getString("no_telp"),
                        k.getResult().getString("email"));                
                return temp;
            }                                  
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public boolean insertData() {
        try{
            Koneksi a = new Koneksi();
            if (!Koneksi.getConn().isClosed()){                
                PreparedStatement sql = (PreparedStatement)Koneksi.getConn().prepareStatement("Insert into users(username, password, saldo, no_telp, email) values (?,md5(?),?,?, ?)");
                sql.setString(1, this.getUsername());
                sql.setString(2, this.getPassword());
                sql.setDouble(3, 0.0);
                sql.setString(4, this.getNoTelp());
                sql.setString(5, this.getEmail());
                int rowAffected = sql.executeUpdate();
                sql.close();
                return rowAffected > 0;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public boolean updateData() {
        try{
            Koneksi k = new Koneksi();
            if (!Koneksi.getConn().isClosed()){ 
                k.setStatement(Koneksi.getConn().prepareStatement("UPDATE users SET username = ?, no_telp = ?, email = ? WHERE id = ?;"));
                PreparedStatement sql = (PreparedStatement) k.getStatement();
                sql.setString(1, getUsername());                
                sql.setString(2, getNoTelp());
                sql.setString(3, getEmail());
                sql.setInt(4, getId());
                int rowAffacted = sql.executeUpdate();
                return rowAffacted > 0;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }    

    public static User findById(int id) {
        Koneksi k = new Koneksi();
        try {
            k.setStatement(Koneksi.getConn().prepareStatement("SELECT * FROM users WHERE id = ?"));
            PreparedStatement sql = (PreparedStatement)k.getStatement();
            sql.setInt(1, id);
            k.setResult(sql.executeQuery());
            if (k.getResult().next()) {
                User user = new User(k.getResult().getInt("id"), k.getResult().getString("username"), k.getResult().getString("password"), k.getResult().getDouble("saldo"), k.getResult().getString("no_telp"), k.getResult().getString("email"));
                return user;
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   

//    public static ArrayList<History_Transaksi> DataHistoryTransaksi(int userId) {
//    ArrayList<History_Transaksi> collections = new ArrayList<>();
//    Koneksi k = new Koneksi();
//    try {
//        k.setStatement(Koneksi.getConn().prepareStatement("SELECT id, jumlah from history_transaksi where users_id = ?"));
//        PreparedStatement sql = (PreparedStatement)k.getStatement();
//        sql.setInt(1, userId);
//        k.setResult(sql.executeQuery());
//        while (k.getResult().next()) {
//            int id = k.getResult().getInt("id");
//            double jumlah = k.getResult().getDouble("jumlah");
//            
//            History_Transaksi tampung = new History_Transaksi(id, jumlah);
//            collections.add(tampung);
//        }
//        return collections;
//    } catch (SQLException ex) {
//        System.out.println("Failed because : " + ex.getSQLState());
//    }
//    return null;
//    }
//blm ada insert history_transaksi  
//    public boolean TopUp(double topUpAmount) {
//        Koneksi a = new Koneksi();
//        try {
//            String query = "UPDATE users SET saldo = saldo + ? WHERE id = ?";
//            a.setStatement(Koneksi.getConn().prepareStatement(query));
//            PreparedStatement sql = (PreparedStatement)a.getStatement();
//            sql.setDouble(1, topUpAmount);
//            sql.setInt(2, this.id);
//            int rowAffected = sql.executeUpdate();
//            sql.close();
//            return rowAffected != 0;
//        } catch (SQLException ex) {
//            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    }
}
