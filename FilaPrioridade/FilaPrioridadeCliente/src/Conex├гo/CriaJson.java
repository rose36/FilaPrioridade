
package Conexão;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.Socket;
import java.net.UnknownHostException;
import org.json.JSONException;
import org.json.JSONObject;


public class CriaJson{
    
    private String host;
    private int port;
    private Socket socket;
    private final String DEFAULT_HOST = "localhost";
    private String senha;
    private boolean prioridade;
    private String token;
    private int tipoAgencia;
    public String agencia;
    DataInputStream is;
    BufferedReader in;

    public CriaJson(String host, int port) throws IOException{
        this.host = host;
        this.port = port;
        socket = new Socket(host, port);
        is = new DataInputStream(socket.getInputStream());
        in = new BufferedReader(new InputStreamReader(is));
        agencia = in.readLine();
        System.out.println("Client has been connected..");
        
        
    }
    
    public void connect(String senha, boolean prioridade, String token, int tipoAgencia) throws JSONException, IOException {
   
       
        this.prioridade = prioridade;
        this.senha = senha;
        this.token = token;
        this.tipoAgencia = tipoAgencia;
        sendJSON();
    }

    public void sendJSON() throws IOException, JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("senha", senha);
        jsonObject.put("prioridade", prioridade);
        jsonObject.put("token", token);
        jsonObject.put("agencia", tipoAgencia);
        
        OutputStream out = socket.getOutputStream();
        DataOutputStream o = new DataOutputStream(out);
        PrintWriter pw = new PrintWriter(o);
        pw.println(jsonObject.toString());
        pw.flush();
        System.out.println("Sent to server: " + " " + jsonObject.toString());
    }

    public void connect(String senha, boolean b, String token) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}