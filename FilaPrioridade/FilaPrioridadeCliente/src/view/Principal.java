
package view;

import Classes.Data;
import Classes.GeradorDePalavras;
import Conexão.CriaJson;
import java.awt.EventQueue;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;


public class Principal extends javax.swing.JFrame {
    private static final DateFormat FORMATO = new SimpleDateFormat("HH:mm:ss");
    private int tipoAtendimento = 0;
    int tipoAgencia = 1;
    private int tipoPrioridade = 0;
    int escolhaPrioridade = 0;
    int senhaCaixa = 0;
    int senhaGerencialPF = 0;
    int senhaGerencialPJ = 0;
    int cont[] = new int[3];
    GeradorDePalavras gp;
    CriaJson cj;
   
    public Principal() throws IOException {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        LabelData.setText(Data.getDataAtual());
        Thread clockThread = new Thread(new ClockRunnable(), "Clock thread");
        clockThread.setDaemon(true);
        jBNormal.setEnabled(true);
        jBGestante.setEnabled(false);
        jBCriança.setEnabled(false);
        jBDeficiente.setEnabled(false);
        jBIdoso.setEnabled(false);
        clockThread.start();
       // jLCaixaSenha.setText("Caixa:" + String.valueOf(senhaCaixa));
        //jLGerencialPF.setText("Gerencial Pessoa Física: "+String.valueOf(senhaGerencialPF));
        //jLGerencialPJ.setText("Gerencial Pessoa Jurídica: "+String.valueOf(senhaGerencialPJ));
        cont[0] = 0;
        cont[1] = 0;
        cont[2] = 0;
        gp = new GeradorDePalavras();
        cj = new CriaJson("localhost", 7777);
        jLAgencia1.setText("Agencia : " + cj.agencia);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPainelAzul = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelData = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        jLGerencialPF = new javax.swing.JLabel();
        jLGerencialPJ = new javax.swing.JLabel();
        jLPFisica = new javax.swing.JLabel();
        jLPJuridica = new javax.swing.JLabel();
        jLCaixaSenha = new javax.swing.JLabel();
        jLCaixa = new javax.swing.JLabel();
        jLAgencia1 = new javax.swing.JLabel();
        jPPrioridade = new javax.swing.JPanel();
        jBGestante = new javax.swing.JButton();
        jBIdoso = new javax.swing.JButton();
        jBNormal = new javax.swing.JButton();
        jBCriança = new javax.swing.JButton();
        jBDeficiente = new javax.swing.JButton();
        jPTipoAtendimento1 = new javax.swing.JPanel();
        jLTipoAtendimento1 = new javax.swing.JLabel();
        jCAtendimento1 = new javax.swing.JComboBox<>();
        jPTipoAtendimento = new javax.swing.JPanel();
        jLPrioridade = new javax.swing.JLabel();
        jCPrioridade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPPainelAzul.setBackground(new java.awt.Color(51, 102, 153));
        jPPainelAzul.setPreferredSize(new java.awt.Dimension(404, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fila.png"))); // NOI18N

        LabelData.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        LabelData.setForeground(new java.awt.Color(255, 255, 255));
        LabelData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LabelHora.setFont(new java.awt.Font("Verdana", 0, 70)); // NOI18N
        LabelHora.setForeground(new java.awt.Color(255, 255, 255));
        LabelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLGerencialPF.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        jLGerencialPF.setForeground(new java.awt.Color(255, 255, 255));
        jLGerencialPF.setText("Pessoa Física");

        jLGerencialPJ.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        jLGerencialPJ.setForeground(new java.awt.Color(255, 255, 255));
        jLGerencialPJ.setText("Pessoa Jurídica");

        jLPFisica.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        jLPFisica.setForeground(new java.awt.Color(255, 255, 255));

        jLPJuridica.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        jLPJuridica.setForeground(new java.awt.Color(255, 255, 255));

        jLCaixaSenha.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        jLCaixaSenha.setForeground(new java.awt.Color(255, 255, 255));

        jLCaixa.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        jLCaixa.setForeground(new java.awt.Color(255, 255, 255));
        jLCaixa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLCaixa.setText("Caixa");

        jLAgencia1.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        jLAgencia1.setForeground(new java.awt.Color(255, 255, 255));
        jLAgencia1.setText("Agência 1");

        javax.swing.GroupLayout jPPainelAzulLayout = new javax.swing.GroupLayout(jPPainelAzul);
        jPPainelAzul.setLayout(jPPainelAzulLayout);
        jPPainelAzulLayout.setHorizontalGroup(
            jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPainelAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPPainelAzulLayout.createSequentialGroup()
                        .addComponent(jLAgencia1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLGerencialPJ)
                    .addComponent(jLCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLGerencialPF))
                .addGap(58, 58, 58)
                .addGroup(jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLPJuridica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jLPFisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLCaixaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPPainelAzulLayout.createSequentialGroup()
                    .addGap(735, 735, 735)
                    .addComponent(jLabel4)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );
        jPPainelAzulLayout.setVerticalGroup(
            jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPainelAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLAgencia1)
                        .addComponent(jLabel2))
                    .addGroup(jPPainelAzulLayout.createSequentialGroup()
                        .addGroup(jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPPainelAzulLayout.createSequentialGroup()
                                    .addComponent(jLCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(jLGerencialPF))
                                .addGroup(jPPainelAzulLayout.createSequentialGroup()
                                    .addComponent(jLCaixaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLPFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPPainelAzulLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLGerencialPJ)
                                    .addComponent(jLPJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPPainelAzulLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(LabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPPainelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPPainelAzulLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        jPPrioridade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 153), 2));

        jBGestante.setBackground(new java.awt.Color(255, 255, 255));
        jBGestante.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jBGestante.setForeground(new java.awt.Color(51, 102, 153));
        jBGestante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gestante.png"))); // NOI18N
        jBGestante.setText("  Gestante");
        jBGestante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBGestante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGestanteActionPerformed(evt);
            }
        });

        jBIdoso.setBackground(new java.awt.Color(255, 255, 255));
        jBIdoso.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jBIdoso.setForeground(new java.awt.Color(51, 102, 153));
        jBIdoso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/idoso.png"))); // NOI18N
        jBIdoso.setText("  Idoso");
        jBIdoso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBIdoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIdosoActionPerformed(evt);
            }
        });

        jBNormal.setBackground(new java.awt.Color(255, 255, 255));
        jBNormal.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jBNormal.setForeground(new java.awt.Color(51, 102, 153));
        jBNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/normal.png"))); // NOI18N
        jBNormal.setText("Normal");
        jBNormal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNormal.setPreferredSize(new java.awt.Dimension(260, 95));
        jBNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNormalActionPerformed(evt);
            }
        });

        jBCriança.setBackground(new java.awt.Color(255, 255, 255));
        jBCriança.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jBCriança.setForeground(new java.awt.Color(51, 102, 153));
        jBCriança.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Crianca.png"))); // NOI18N
        jBCriança.setText("Com Criança");
        jBCriança.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCriança.setPreferredSize(new java.awt.Dimension(260, 95));
        jBCriança.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCriançaActionPerformed(evt);
            }
        });

        jBDeficiente.setBackground(new java.awt.Color(255, 255, 255));
        jBDeficiente.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jBDeficiente.setForeground(new java.awt.Color(51, 102, 153));
        jBDeficiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/deficiente.png"))); // NOI18N
        jBDeficiente.setText("Deficiente ");
        jBDeficiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBDeficiente.setPreferredSize(new java.awt.Dimension(260, 95));
        jBDeficiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeficienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPPrioridadeLayout = new javax.swing.GroupLayout(jPPrioridade);
        jPPrioridade.setLayout(jPPrioridadeLayout);
        jPPrioridadeLayout.setHorizontalGroup(
            jPPrioridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrioridadeLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jBGestante, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBIdoso, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCriança, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBDeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPPrioridadeLayout.setVerticalGroup(
            jPPrioridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrioridadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrioridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGestante, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBIdoso, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCriança, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPTipoAtendimento1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 153), 2));
        jPTipoAtendimento1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        jLTipoAtendimento1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLTipoAtendimento1.setForeground(new java.awt.Color(51, 102, 153));
        jLTipoAtendimento1.setText("Tipo de Atendimento: ");

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
                .addComponent(jLTipoAtendimento1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(446, 446, 446))
        );
        jPTipoAtendimento1Layout.setVerticalGroup(
            jPTipoAtendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTipoAtendimento1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPTipoAtendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipoAtendimento1)
                    .addComponent(jCAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPTipoAtendimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 153), 2));
        jPTipoAtendimento.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        jLPrioridade.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLPrioridade.setForeground(new java.awt.Color(51, 102, 153));
        jLPrioridade.setText("Prioridade:");

        jCPrioridade.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jCPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jCPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPrioridadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPTipoAtendimentoLayout = new javax.swing.GroupLayout(jPTipoAtendimento);
        jPTipoAtendimento.setLayout(jPTipoAtendimentoLayout);
        jPTipoAtendimentoLayout.setHorizontalGroup(
            jPTipoAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTipoAtendimentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLPrioridade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(446, 446, 446))
        );
        jPTipoAtendimentoLayout.setVerticalGroup(
            jPTipoAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTipoAtendimentoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPTipoAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPrioridade)
                    .addComponent(jCPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPainelAzul, javax.swing.GroupLayout.DEFAULT_SIZE, 1634, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPTipoAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPPrioridade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPTipoAtendimento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPPainelAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addComponent(jPTipoAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(178, 178, 178)
                    .addComponent(jPTipoAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(612, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPrioridadeActionPerformed
        int escolha;
        escolha = jCPrioridade.getSelectedIndex();
        if (escolha == 0){
            tipoPrioridade = 0;
            jBGestante.setEnabled(false);
            jBCriança.setEnabled(false);
            jBDeficiente.setEnabled(false);
            jBIdoso.setEnabled(false);
            jBNormal.setEnabled(true);
            
            escolhaPrioridade = 0;
            jPPrioridade.setVisible(true);
        }else if(escolha == 1){
            tipoPrioridade = 1;
            jBNormal.setEnabled(false);
            jBGestante.setEnabled(true);
            jBCriança.setEnabled(true);
            jBDeficiente.setEnabled(true);
            jBIdoso.setEnabled(true);
           
           
        }
    }//GEN-LAST:event_jCPrioridadeActionPerformed

    private void jBGestanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGestanteActionPerformed
      escolhaPrioridade = 1;
      
      String senha;
      String token = gp.geraPalavra();
      switch (tipoAtendimento) {
      
          case 1:
              cont[0]++;
              senha = "G" + "C" + cont[0];
              jLCaixaSenha.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso como Gestante" +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token+"\n"
                      + "Agência: " + tipoAgencia);
                {
          try {
              cj.connect(senha, true, token, tipoAgencia);
          } catch (IOException ex) {
              Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
          } catch (JSONException ex) {
              Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
          }
                }
              break;
          case 2:
              cont[1]++;
              senha = "G" + "PF"+ cont[1];
              jLPFisica.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso como Gestante" +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token +"\n"
                      + "Agência: " + tipoAgencia);
                {
          try {
              cj.connect(senha, true, token, tipoAgencia);
          } catch (IOException ex) {
              Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
          } catch (JSONException ex) {
              Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
          }
                }              
              break;
          case 3:
              cont[2]++;
              senha = "G" + "PJ" + cont[2];
              jLPJuridica.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso como Gestante" +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token + "\n"
                      + "Agência: " + tipoAgencia);
                {
          try {
              cj.connect( senha, true, token, tipoAgencia);
          } catch (IOException ex) {
              Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
          } catch (JSONException ex) {
              Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
          }
                }
            break;
          default:
              JOptionPane.showMessageDialog(null, "Selecione um tipo de atendimento");
              break;
          
      }
      
      
      
    }//GEN-LAST:event_jBGestanteActionPerformed

    private void jBIdosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIdosoActionPerformed
       escolhaPrioridade = 2;
       
       String token = gp.geraPalavra();
       
        String senha;
      switch (tipoAtendimento) {
      
          case 1:
              cont[0]++;
              senha = "I" + "C" + cont[0];
              jLCaixaSenha.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso como Idoso" +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token+"\n"
                      + "Agência: " + tipoAgencia);
                {
           try {
               cj.connect(senha, true, token, tipoAgencia);
           } catch (IOException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           } catch (JSONException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           }
                }
              break;
          case 2:
              cont[1]++;
              senha = "I" + "PF"+ cont[1];
              jLPFisica.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso como Idoso" +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token + "\n"
                      + "Agência: " + tipoAgencia);
                {
           try {
               cj.connect( senha, true, token, tipoAgencia);
           } catch (IOException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           } catch (JSONException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           }
                }
              break;
              
          case 3:
              cont[2]++;
              senha = "I" + "PJ" + cont[2];
              jLPJuridica.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso como Idoso" +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token+ "\n"
                      + "Agência: " + tipoAgencia);
                {
           try {
               cj.connect( senha, true, token, tipoAgencia);
           } catch (IOException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           } catch (JSONException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           }
                }
              break;
          default:
              JOptionPane.showMessageDialog(null, "Selecione um tipo de atendimento");
              break;
          
      }
    }//GEN-LAST:event_jBIdosoActionPerformed

    private void jBNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNormalActionPerformed
       escolhaPrioridade = 3;
       
       String token = gp.geraPalavra();
        String senha;
      switch (tipoAtendimento) {
      
          case 1:
              cont[0]++;
              senha = "N" + "C" +cont[0];
              jLCaixaSenha.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso" +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token+"\n"
                      + "Agência: " + tipoAgencia);
                {
           try {
               cj.connect( senha, false, token, tipoAgencia);
           } catch (IOException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           } catch (JSONException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           }
                }
              break;
          case 2:
              cont[1]++;
              senha = "N" + "PF"+ cont[1];
              jLPFisica.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso" +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token + "\n"
                      + "Agência: " + tipoAgencia);
                {
           try {
               cj.connect( senha, false, token, tipoAgencia);
           } catch (IOException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           } catch (JSONException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           }
                }              
              break;
          case 3:
              cont[2]++;
              senha = "N" + "PJ"+ cont[2];
              jLPJuridica.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso" +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token+ "\n"
                      + "Agência: " + tipoAgencia);
                {
           try {
               cj.connect( senha, false, token, tipoAgencia);
           } catch (IOException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           } catch (JSONException ex) {
               Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
           }
                }
              break;
          default:
              JOptionPane.showMessageDialog(null, "Selecione um tipo de atendimento");
              break;
          
      }
    }//GEN-LAST:event_jBNormalActionPerformed

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

    private void jBCriançaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCriançaActionPerformed
        String senha;
        
        String token = gp.geraPalavra();
      switch (tipoAtendimento) {
      
          case 1:
              cont[0]++;
              senha = "C" + "C" +cont[0];
              jLCaixaSenha.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso com a prioridade de criança de colo." +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token+"\n"
                      + "Agência: " + tipoAgencia);
                {
            try {
                cj.connect(senha, true, token, tipoAgencia);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
              break;
          case 2:
              cont[1]++;
              senha = "C" + "PF" +cont[1];
              jLPFisica.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso com a prioridade de criança de colo." +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token+ "\n"
                      + "Agência: " + tipoAgencia);
                {
            try {
                cj.connect( senha, true, token, tipoAgencia);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
              break;
          case 3:
              cont[2]++;
              senha = "C" + "PJ"+ cont[2];
              jLPJuridica.setText(senha);
              
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso com a prioridade de criança de colo." +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token + "\n"
                      + "Agência: " + tipoAgencia);
                {
            try {
                cj.connect( senha, true, token, tipoAgencia);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
              break;
          default:
              JOptionPane.showMessageDialog(null, "Selecione um tipo de atendimento");
              break;
          
      }
    }//GEN-LAST:event_jBCriançaActionPerformed

    private void jBDeficienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeficienteActionPerformed
        escolhaPrioridade = 4;
        
        String token = gp.geraPalavra();
        String senha;
      switch (tipoAtendimento) {
      
          case 1:
              cont[0]++;
              senha = "D" + "C"+ cont[0];
              jLCaixaSenha.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso com a prioridade de deficiente." +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token+ "\n"
                      + "Agência: " + tipoAgencia);
                {
            try {
                cj.connect( senha, true, token, tipoAgencia);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
              break;
          case 2:
              cont[1]++;
              senha = "D" + "PF"+cont[1];
              jLPFisica.setText(senha);
              
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso com a prioridade de deficiente." +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token+ "\n"
                      + "Agência: " + tipoAgencia);
                {
            try {
                cj.connect( senha, true, token, tipoAgencia);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
              break;
          case 3:
              cont[2]++;
              senha = "D" + "PJ" +cont[2];
              jLPJuridica.setText(senha);
              JOptionPane.showMessageDialog(null, "O seu atendimento foi reservado com sucesso com a prioridade de deficiente." +"\n"
                      + "Sua senha gerada é: "+senha + "\n"
                      + "Sua senha de segurança é: " +token+ "\n"
                      + "Agência: " + tipoAgencia);
                  {
            try {
                cj.connect( senha, true, token, tipoAgencia);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
              break;
              
          default:
              JOptionPane.showMessageDialog(null, "Selecione um tipo de atendimento");
              break;
          
      }
    }//GEN-LAST:event_jBDeficienteActionPerformed
    
    
    
    
    private void enviar(){
        
    }
    public String empacota(String senha) throws JSONException{
        JSONObject pacote = new JSONObject();
        pacote.put("Prioridade", tipoPrioridade);
        pacote.put("Atendimento", tipoAtendimento );
        pacote.put("Senha", senha);
        pacote.put("Agencia", tipoAgencia);
       
        System.out.println(pacote.toString());
        return pacote.toString();
    }
        
    private boolean verificaTipo(){
    boolean result = false;
    if(tipoAtendimento == 0){
        result = false;
    }else{
        result = true;
    }
    return result;
    }

    public int getTipoAtendimento() {
        return tipoAtendimento;
    }

    public int getTipoPrioridade() {
        return tipoPrioridade;
    }
    
    
     private class ClockRunnable implements Runnable {
    public void run() {
        try {
            while (true) {
                // Aqui chamamos o setHora através da EventQueue da AWT.
                // Conforme dito, isso garante Thread safety para o Swing.
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        // Só podemos chamar setHora diretamente dessa
                        // forma, pois esse Runnable é uma InnerClass não
                        // estática.
                        LabelHora.setText(FORMATO.format(new Date()));
                    }
                });
                // Fazemos nossa thread dormir por um segundo, liberando o
                // processador para outras threads processarem.
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
        }
    }
}
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JButton jBCriança;
    private javax.swing.JButton jBDeficiente;
    private javax.swing.JButton jBGestante;
    private javax.swing.JButton jBIdoso;
    private javax.swing.JButton jBNormal;
    private javax.swing.JComboBox<String> jCAtendimento1;
    private javax.swing.JComboBox<String> jCPrioridade;
    private javax.swing.JLabel jLAgencia1;
    private javax.swing.JLabel jLCaixa;
    private javax.swing.JLabel jLCaixaSenha;
    private javax.swing.JLabel jLGerencialPF;
    private javax.swing.JLabel jLGerencialPJ;
    private javax.swing.JLabel jLPFisica;
    private javax.swing.JLabel jLPJuridica;
    private javax.swing.JLabel jLPrioridade;
    private javax.swing.JLabel jLTipoAtendimento1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPPainelAzul;
    private javax.swing.JPanel jPPrioridade;
    private javax.swing.JPanel jPTipoAtendimento;
    private javax.swing.JPanel jPTipoAtendimento1;
    // End of variables declaration//GEN-END:variables
}
