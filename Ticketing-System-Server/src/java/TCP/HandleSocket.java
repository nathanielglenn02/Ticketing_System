/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP;

import Model.User;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Salman Alfarizi
 */
public class HandleSocket extends Thread{
    Socket client;
    DataOutputStream out;
    BufferedReader in;
    User user;
    public static ArrayList<HandleSocket> clients = new ArrayList<HandleSocket>();
    public HandleSocket( Socket client) {
        try {
            this.client = client;
            this.in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            this.out = new DataOutputStream(this.client.getOutputStream());
            this.user = null;            
        } catch (IOException ex) {
            Logger.getLogger(HandleSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void SendChat(String tmp){
        try {
            out.writeBytes( tmp + "\n");
        } catch (IOException ex) {
            Logger.getLogger(HandleSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Aksi(String msg){
        String msgSplit[] = msg.split("~");
        if(msgSplit[0].contains("LOG")){
            user = User.CekLogin(msgSplit[1], msgSplit[2]);
            if(user == null){
                SendChat("404");
            }
            else{
                SendChat("200~" + user.toString());
            }
        }
        else if(msgSplit[0].contains("REGIST")){
            String username = msgSplit[1];
            String password = msgSplit[2];
            String no_ktp = msgSplit[3];
            String email = msgSplit[4];
            
            user = new User(0,username, password, 0,no_ktp, email);
            user.insertData();
            SendChat("200");
        }
    }
    @Override
    public void run() {
        while(true){
            try {
                String tmp = in.readLine();
                System.out.println(tmp);
                Aksi(tmp);
            } catch (IOException ex) {
                Logger.getLogger(HandleSocket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
