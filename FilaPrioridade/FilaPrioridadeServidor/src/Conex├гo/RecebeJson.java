
package Conexão;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class RecebeJson{
    
    private ServerSocket serverSocket, serverPainel;
    private int port;
    private List<Agencia> agencias = new ArrayList<Agencia>();
    
    public void establish(int port, int portPainel) throws IOException {
        this.port = port;
        serverSocket = new ServerSocket(port);
        serverPainel = new ServerSocket(portPainel);
        System.out.println("JSONServer has been established on port " + port);
       

    }

    public String getFilaStatus(){
        String res = "";
        int ag = 0;
        for (Agencia a: agencias){
            int t = 0;
            ag++;
            res += "----------- Agencia " + ag + " --------------\n";
            t = a.totalCaixa();
            res+= "Total fila Caixa da agência "+ ag +" : "+ t + "\n"
                + "---------------------------------\n";
            t = a.totalFisica();
            res+= "Total fila Gerencial Pessoa Fisica da agência "+ ag +" : "+ t + "\n"
                + "-------------------------------\n";
            t = a.totalJuridica();
            res+= "Total fila Gerencial Pessoa Juridica da agência "+ ag +" : "+ t + "\n"
                        + "-------------------------------\n";
        }
        return res;
    }
    
    public String getProx(){
        String res = "";
        int ag = 0;
        for (Agencia a: agencias){
            ag++;
            String s = a.nextCaixa2();
            if (s != null)
                res += "Proxima Senha Caixa da agência " + ag + " : " + s + "\n"
                    + "--------------------------------------\n";
            s = a.nextFisica2();
            
            if (s != null)
                res += "Proxima Senha Pessoa Fisica da agência " + ag + " : " + s + "\n"
                    + "--------------------------------------\n";
            s = a.nextJuridica2();
            if (s != null)
                res += "Proxima Senha Pessoa Juridica da agência " + ag + " : " + s + ""
                    + "---------------------------------------\n";
            
        }
        return res;
    }
    
    public String getTotalAtendidas(){
        String res = "";
        int ag = 0;
        for (Agencia a: agencias){
            ag++;
            res += "Total atendidas pela Agencia: " +ag + ": " + a.total +"\n";
            
        }
        return res;
    }
    
    public String getRelatClientes(int tipo){
        String res = "";
        int ag = 0;
        for (Agencia a: agencias){
            ag++;
            res += "----------Agencia: " +ag + "------------\n";
            switch (tipo){
                case 1:
                    res += a.getAllCaixa();
                    break;
                case 2:
                    res += a.getAllFisica();
                    break;
                case 3:
                    res += a.getAllJuridica();
                    break;
                default:
                    break;
            }
            
        }
        return res;
    }
    
    public void accept() throws IOException {
        while (true) {
            Socket socket = serverSocket.accept();
            Socket ss = serverPainel.accept();
            
            Agencia a = new Agencia(socket);
            Painel p = new Painel(ss, a);
            Thread t = new Thread(a);
            Thread t2 = new Thread(p);
            agencias.add(a);
            t.start();
            System.out.println("Conectou");
            t2.start();
        }
    }

    public void start(int port, int portPainel) throws IOException{
        establish(port,portPainel);
        accept();
    }

    public static void main(String[] args) {
        RecebeJson server = new RecebeJson();

        try {
            server.start(7777, 4444);

        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.err.println(e);
        }
    }
    
    
}
