
package Conexão;

import Entidades.Normal;
import Entidades.Prioridade;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;
public class Agencia implements Runnable{
    
    private Queue<Normal> normalCaixa = new ArrayDeque<Normal>();
    private Queue<Normal> normalPessoaFisica = new ArrayDeque<Normal>();
    private Queue<Normal> normalPessoaJuridica = new ArrayDeque<Normal>();
    private Queue<Prioridade> prioCaixa = new ArrayDeque<Prioridade>();
    private Queue<Prioridade> prioPessoaFisica = new ArrayDeque<Prioridade>();
    private Queue<Prioridade> prioPessoaJuridica = new ArrayDeque<Prioridade>();
    DataOutputStream o;
    OutputStream out;
    PrintWriter pw;
    public int total = 0;
    public static int clientes;
    
    private Socket cliente;
    
    public Agencia(Socket cliente){
    
        try {
            this.cliente = cliente;
            out = cliente.getOutputStream();
            o = new DataOutputStream(out);
            pw = new PrintWriter(o);
        } catch (IOException ex) {
            Logger.getLogger(Agencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        clientes++;
        pw.println(clientes);
        pw.flush();
        System.out.println(clientes + " JSONClient(s) connected on port: " + cliente.getPort());
        JSONObject jsonObject;
        while (cliente.isConnected()){
            try {
                // For JSON Protocol
                jsonObject = receiveJSON();
            } catch (IOException | JSONException e) {
                Logger.getLogger(RecebeJson.class.getName()).log(Level.SEVERE, null, e);
            } 
        }
        try {
            cliente.close();
        } catch (IOException ex) {
            Logger.getLogger(Agencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public JSONObject receiveJSON() throws IOException, JSONException {
            DataInputStream is = new DataInputStream(cliente.getInputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line = in.readLine();
            System.out.println(line);
            JSONObject jobj = new JSONObject(line);
            String senha = jobj.getString("senha");
               String token = jobj.getString("token");
               boolean prioridade = jobj.getBoolean("prioridade");
                   
               if (prioridade){
                   final Prioridade p = new Prioridade();
               
                   p.setSenha(senha);
                   p.setToken(token);
                   if (senha.charAt(1) == 'C' )
                      prioCaixa.add(p);
                   else if (senha.contains("PF"))
                       prioPessoaFisica.add(p);
                   else if (senha.contains("PJ"))
                       prioPessoaJuridica.add(p);
               }
                   
               else{
                   final Normal n = new Normal();
                   n.setSenha(senha);
                   n.setToken(token);
                   
                   if (senha.charAt(1) == 'C')
                       normalCaixa.add(n);
                   else if (senha.contains("PF"))
                       normalPessoaFisica.add(n);
                   else if (senha.contains("PJ"))
                       normalPessoaJuridica.add(n);
               }
            System.out.println("Got from client on port " + cliente.getPort() + " " + jobj.toString());
            return jobj;
        }
    
    public String nextCaixa(){
        if (!prioCaixa.isEmpty()){
            Prioridade p = prioCaixa.poll();
            total++;
            return p.getSenha() + ":" + p.getToken();
        }
        if (!normalCaixa.isEmpty()){
            Normal n = normalCaixa.poll();
            total++;
           return n.getSenha() + ":" +n.getToken();
        }
        return null;
    }
    
    public String nextFisica(){
        if (!prioPessoaFisica.isEmpty()){
            Prioridade p = prioPessoaFisica.poll();
            total++;
            return p.getSenha() + ":" + p.getToken();
        }
        if (!normalPessoaFisica.isEmpty()){
            Normal n = normalPessoaFisica.poll();
            total++;
           return n.getSenha() + ":" +n.getToken();
        }
        return null;
    }
    
    public String nextJuridica(){
        if (!prioPessoaJuridica.isEmpty()){
            Prioridade p = prioPessoaJuridica.poll();
            total++;
            return p.getSenha() + ":" + p.getToken();
        }
        if (!normalPessoaJuridica.isEmpty()){
            Normal n = normalPessoaJuridica.poll();
            total++;
           return n.getSenha() + ":" +n.getToken();
        }
        return null;
    }
    
    public String nextCaixa2(){
        if (!prioCaixa.isEmpty()){
            Prioridade p = prioCaixa.peek();
            return p.getSenha();
        }
        if (!normalCaixa.isEmpty()){
            Normal n = normalCaixa.peek();
           return n.getSenha();
        }
        return null;
    }
    
    public String nextFisica2(){
        if (!prioPessoaFisica.isEmpty()){
            Prioridade p = prioPessoaFisica.peek();
            return p.getSenha();
        }
        if (!normalPessoaFisica.isEmpty()){
            Normal n = normalPessoaFisica.peek();
           return n.getSenha();
        }
        return null;
    }
    
    public String nextJuridica2(){
        if (!prioPessoaJuridica.isEmpty()){
            Prioridade p = prioPessoaJuridica.peek();
            return p.getSenha();
        }
        if (!normalPessoaJuridica.isEmpty()){
            Normal n = normalPessoaJuridica.peek();
           return n.getSenha();
        }
        return null;
    }
    
    public String getAllCaixa(){
        String res = "";
        Iterator<Prioridade> pc = prioCaixa.iterator();
        Iterator<Normal> nc = normalCaixa.iterator();
        while(pc.hasNext()){
            Prioridade p = pc.next();
            res += "Senha : " + p.getSenha()+ " Token: " + p.getToken() + "\n";
        }
        while(nc.hasNext()){
            Normal n = nc.next();
            res += "Senha : " + n.getSenha()+ " Token: " + n.getToken() + "\n";
        }
        
        return res;
    }
    public String getAllFisica(){
        String res = "";
        Iterator<Prioridade> pf = prioPessoaFisica.iterator();
        Iterator<Normal> nf = normalPessoaFisica.iterator();
        while(pf.hasNext()){
            Prioridade p = pf.next();
            res += "Senha : " + p.getSenha()+ " Token: " + p.getToken() + "\n";
        }
        while(nf.hasNext()){
            Normal n = nf.next();
            res += "Senha : " + n.getSenha()+ " Token: " + n.getToken() + "\n";
        }
        
        return res;
    }
    
    public String getAllJuridica(){
        String res = "";
        Iterator<Prioridade> pj = prioPessoaJuridica.iterator();
        Iterator<Normal> nj = normalPessoaJuridica.iterator();
        while(pj.hasNext()){
            Prioridade p = pj.next();
            res += "Senha : " + p.getSenha()+ " Token: " + p.getToken() + "\n";
        }
        while(nj.hasNext()){
            Normal n = nj.next();
            res += "Senha : " + n.getSenha()+ " Token: " + n.getToken() + "\n";
        }
        
        return res;
    }
    
    public int totalCaixa(){
        return prioCaixa.size() + normalCaixa.size();
    }
    
    public int totalFisica(){
        return prioPessoaFisica.size() + normalPessoaFisica.size();
    }
    
    public int totalJuridica(){
        return prioPessoaJuridica.size() + normalPessoaJuridica.size();
    }
    
}
