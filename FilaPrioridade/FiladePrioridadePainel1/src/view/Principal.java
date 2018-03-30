
package view;

import Classes.Data;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.EventQueue;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {
    private static final DateFormat FORMATO = new SimpleDateFormat("HH:mm:ss");
    int senhaCaixa = 0;
    int senhaGerencialPF = 0;
    int senhaGerencialPJ = 0;
    int tipoAtendimento=0;
    int contador = 0;
    String agencia;
    DataOutputStream o;
    OutputStream out;
    PrintWriter pw;
    DataInputStream is;
    BufferedReader in;
    private Socket painel;
     
    
               
   

 

   
    public Principal() {
        
        try {
            initComponents();
            this.setExtendedState(MAXIMIZED_BOTH);
            LabelData.setText(Data.getDataAtual());
            jLCaixaSenha.setText(String.valueOf(senhaCaixa));
            jLGerencialPFSenha.setText(String.valueOf(senhaGerencialPF));
            jLGerencialPJSenha.setText(String.valueOf(senhaGerencialPJ));
            painel = new Socket("localhost", 4444);
            add(jBProximo);
            out = painel.getOutputStream();
            o = new DataOutputStream(out);
            pw = new PrintWriter(o);
            is = new DataInputStream(painel.getInputStream());
            in = new BufferedReader(new InputStreamReader(is));
            agencia = in.readLine();
            jLAgencia1.setText("Agencia : " + agencia);
            
            add(jBProximo);
            jBProximo.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                play("audio");
            }
            });
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

     public void play(String nomeDoAudio){
    
        URL url = getClass().getResource(nomeDoAudio +".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();



    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        LabelData = new javax.swing.JLabel();
        jLAgencia1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLGerencialPF = new javax.swing.JLabel();
        jLCaixa = new javax.swing.JLabel();
        jLGerencialPJ = new javax.swing.JLabel();
        jLGerencialPJSenha = new javax.swing.JLabel();
        jLCaixaSenha = new javax.swing.JLabel();
        jLGerencialPFSenha = new javax.swing.JLabel();
        jPTipoAtendimento1 = new javax.swing.JPanel();
        jLTipoAtendimento = new javax.swing.JLabel();
        jCAtendimento1 = new javax.swing.JComboBox<>();
        jBProximo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(404, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fila.png"))); // NOI18N

        LabelHora.setFont(new java.awt.Font("Verdana", 0, 70)); // NOI18N
        LabelHora.setForeground(new java.awt.Color(255, 255, 255));

        LabelData.setFont(new java.awt.Font("Verdana", 0, 70)); // NOI18N
        LabelData.setForeground(new java.awt.Color(255, 255, 255));

        jLAgencia1.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        jLAgencia1.setForeground(new java.awt.Color(255, 255, 255));
        jLAgencia1.setText("Agência 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLAgencia1)
                .addGap(18, 18, 18)
                .addComponent(LabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLAgencia1)
                    .addComponent(LabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 153), 2));

        jLGerencialPF.setFont(new java.awt.Font("Verdana", 0, 60)); // NOI18N
        jLGerencialPF.setForeground(new java.awt.Color(255, 255, 255));
        jLGerencialPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLGerencialPF.setText("Pessoa Física");

        jLCaixa.setFont(new java.awt.Font("Verdana", 0, 60)); // NOI18N
        jLCaixa.setForeground(new java.awt.Color(255, 255, 255));
        jLCaixa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLCaixa.setText("Caixa");

        jLGerencialPJ.setFont(new java.awt.Font("Verdana", 0, 60)); // NOI18N
        jLGerencialPJ.setForeground(new java.awt.Color(255, 255, 255));
        jLGerencialPJ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLGerencialPJ.setText("Pessoa Jurídica");

        jLGerencialPJSenha.setFont(new java.awt.Font("Verdana", 0, 60)); // NOI18N
        jLGerencialPJSenha.setForeground(new java.awt.Color(255, 255, 255));

        jLCaixaSenha.setFont(new java.awt.Font("Verdana", 0, 60)); // NOI18N
        jLCaixaSenha.setForeground(new java.awt.Color(255, 255, 255));

        jLGerencialPFSenha.setFont(new java.awt.Font("Verdana", 0, 60)); // NOI18N
        jLGerencialPFSenha.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLGerencialPF)
                    .addComponent(jLGerencialPJ))
                .addGap(151, 151, 151)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLGerencialPFSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addComponent(jLCaixaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLGerencialPJSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLGerencialPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLCaixaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLGerencialPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLGerencialPJ)
                    .addComponent(jLGerencialPJSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPTipoAtendimento1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 153), 2));
        jPTipoAtendimento1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        jLTipoAtendimento.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLTipoAtendimento.setForeground(new java.awt.Color(51, 102, 153));
        jLTipoAtendimento.setText("Tipo de Atendimento: ");

        jCAtendimento1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jCAtendimento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Caixa", "Gerencial Pessoa Física", "Gerencial Pessoa Jurídica" }));
        jCAtendimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAtendimento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPTipoAtendimento1Layout = new javax.swing.GroupLayout(jPTipoAtendimento1);
        jPTipoAtendimento1.setLayout(jPTipoAtendimento1Layout);
        jPTipoAtendimento1Layout.setHorizontalGroup(
            jPTipoAtendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTipoAtendimento1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTipoAtendimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        jPTipoAtendimento1Layout.setVerticalGroup(
            jPTipoAtendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTipoAtendimento1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPTipoAtendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipoAtendimento)
                    .addComponent(jCAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jBProximo.setBackground(new java.awt.Color(255, 255, 255));
        jBProximo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jBProximo.setForeground(new java.awt.Color(51, 102, 153));
        jBProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proximo.png"))); // NOI18N
        jBProximo.setText(" Próximo");
        jBProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBProximo.setPreferredSize(new java.awt.Dimension(260, 80));
        jBProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPTipoAtendimento1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPTipoAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCAtendimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAtendimento1ActionPerformed
        int escolha;
        escolha = jCAtendimento1.getSelectedIndex();
        if(escolha == 0){
            tipoAtendimento = 0;

        }else if(escolha == 1){
            tipoAtendimento = 1;

        }else if(escolha == 2){
            tipoAtendimento = 2;

        }else if(escolha == 3){
            tipoAtendimento = 3;

        }else if(escolha == 4){
            tipoAtendimento = 4;

        }

    }//GEN-LAST:event_jCAtendimento1ActionPerformed

    private void jBProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProximoActionPerformed
        try {
            String str;
            switch (tipoAtendimento){
                case 1:
                    pw.println("caixa");
                    pw.flush();
                    str = in.readLine();
                    play("campainha");
                    jLCaixaSenha.setText(str.split(":")[0]);
                    JOptionPane.showMessageDialog(null, str);
                    break;
                case 2:
                    pw.println("fisica");
                    pw.flush();
                    str = in.readLine();
                    play("campainha");
                    jLGerencialPFSenha.setText(str.split(":")[0]);
                    JOptionPane.showMessageDialog(null, str);
                    
                    break;
                case 3:
                    pw.println("juridica");
                    pw.flush();
                    str = in.readLine();
                    play("campainha");
                    jLGerencialPJSenha.setText(str.split(":")[0]);
                    JOptionPane.showMessageDialog(null, str);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Selecione um tipo de atendimento");
                    break;
                    
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_jBProximoActionPerformed
 
    public static void main(String args[]) {
        new Principal().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JButton jBProximo;
    private javax.swing.JComboBox<String> jCAtendimento1;
    private javax.swing.JLabel jLAgencia1;
    private javax.swing.JLabel jLCaixa;
    private javax.swing.JLabel jLCaixaSenha;
    private javax.swing.JLabel jLGerencialPF;
    private javax.swing.JLabel jLGerencialPFSenha;
    private javax.swing.JLabel jLGerencialPJ;
    private javax.swing.JLabel jLGerencialPJSenha;
    private javax.swing.JLabel jLTipoAtendimento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPTipoAtendimento1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
