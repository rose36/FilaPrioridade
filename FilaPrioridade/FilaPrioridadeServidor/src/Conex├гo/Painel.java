/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexão;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roseli Rocha
 */
public class Painel implements Runnable{

    private Agencia a;
    private Socket painel;
    DataOutputStream o;
    OutputStream out;
    PrintWriter pw;
    DataInputStream is;
    BufferedReader in;
    
    public Painel(Socket painel, Agencia a){
        this.painel = painel;
        this.a = a;
        try {
            out = painel.getOutputStream();
            o = new DataOutputStream(out);
            pw = new PrintWriter(o);
            is = new DataInputStream(painel.getInputStream());
            in = new BufferedReader(new InputStreamReader(is));
        } catch (IOException ex) {
            Logger.getLogger(Painel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void run() {
        pw.println(a.clientes+"");
        pw.flush();
        while(painel.isConnected()){
            String s;
            try {
                String str = in.readLine();
                switch (str){
                        case "caixa":
                            s = a.nextCaixa();
                            if (s != null ){
                                pw.println(s);
                                pw.flush();
                            }
                            else{
                                pw.println("Fila Vazia");
                                pw.flush();
                            }
                            break;
                        case "fisica":
                            s = a.nextFisica();
                            if (s != null ){
                                pw.println(s);
                                pw.flush();
                            }
                            else{
                                pw.println("Fila Vazia");
                                pw.flush();
                            }
                            break;
                        case "juridica":
                            s = a.nextJuridica();
                            if (s != null ){
                                pw.println(s);
                                pw.flush();
                            }
                            else{
                                pw.println("Fila Vazia");
                                pw.flush();
                            }
                            break;
                        default:
                            break;
                            
                }   } catch (IOException ex) {
                Logger.getLogger(Painel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
