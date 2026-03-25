
package telagenio;

import java.awt.Font;

/**
 *
 * @author kruiv
 */
public class TelaGenio extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaGenio.class.getName());

    public TelaGenio() {
        initComponents();
        lblFrase.setText("<html>Vou Pensar em um valor entre <strong>1 e 5</strong>. Tente adivinhar</html>");
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblFrase = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JSpinner();
        btnPalpite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFrase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFrase.setText("Frase");
        lblFrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 200, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pngtree-speech-bubble-transparent-hd-png-image_10535699.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 343, 212));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aladdin-genio-clipart-004.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        JLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLabel3.setText("Valor");
        getContentPane().add(JLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 40, 30));

        txtValor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        btnPalpite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPalpite.setText("Palpite");
        btnPalpite.addActionListener(this::btnPalpiteActionPerformed);
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        pack();
    }

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
       double r = 1 + Math.random() * (6-1);
       int valor = (int) r;
       int num = Integer.parseInt(txtValor.getValue().toString());
       String f1 = "Acertou!!";
       String f2 = "<html>Errou! Eu pensei no valor " + valor + "</html>";
       String a = (valor == num) ? f1:f2;
       lblFrase.setText(a);
    }
    
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new TelaGenio().setVisible(true));
    }

    private javax.swing.JLabel JLabel3;
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtValor;
}
