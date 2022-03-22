
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Nahuel
 */
public class MenuOP extends javax.swing.JFrame {

    
    public MenuOP() {
        initComponents();
    }

 
    public static final String IniciarOP = "iniciarOP";
    public static final String PauarOp = "pausarOp";
    public static final String ReaundarOP = "reanudarOP";
    public static final String FinalizarOP = "finOP";
    public static final String VOLVER = "volvee ahre";
    
    public void setController(ControladorINICIAROP control){
        btnMenuInicarOP.setActionCommand(IniciarOP);
        btnPausarOP.setActionCommand(PauarOp);
       
        btnVOLVER.setActionCommand(VOLVER);
        
        btnVOLVER.addActionListener(control);
        btnMenuInicarOP.addActionListener(control);
        btnPausarOP.addActionListener(control);
        btnReanudarOP.addActionListener(control);
        
    }
    public void setControllerPausarOP(ControladorPausarOP control){
        btnPausarOP.setActionCommand(PauarOp);
        btnPausarOP.addActionListener(control);
    }
    public void setControllerFinalizarOP(ControladorFinalizarOP control){
         btnFinalizarOP.setActionCommand(FinalizarOP);
         btnFinalizarOP.addActionListener(control);
    }
    public void setControllerReanudarOP(ControladorReanudarOP control){
        btnReanudarOP.setActionCommand(ReaundarOP);
        btnReanudarOP.addActionListener(control);
    }
    public void setNroOP(int nro){
        this.lblnroOP.setText(""+nro);
    }
    public void setLinea(int nroLinea){
        this.lblLinea.setText(""+nroLinea);
    }
    public void setSupLinea(String dni){
        this.lblSupLinea.setText(dni);
    }
    public void setEstado(String estado){
        this.lblEstadoOp.setText(estado);
    }
    public void ejecutar(){
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPausarOP = new javax.swing.JButton();
        btnReanudarOP = new javax.swing.JButton();
        btnFinalizarOP = new javax.swing.JButton();
        btnMenuInicarOP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblnroOP = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEstadoOp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLinea = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSupLinea = new javax.swing.JLabel();
        btnVOLVER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        btnPausarOP.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnPausarOP.setText("PAUSAR");
        btnPausarOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarOPActionPerformed(evt);
            }
        });

        btnReanudarOP.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnReanudarOP.setText("REANUNDAR");

        btnFinalizarOP.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnFinalizarOP.setText("FINALIZAR");
        btnFinalizarOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarOPActionPerformed(evt);
            }
        });

        btnMenuInicarOP.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnMenuInicarOP.setText("INICIAR OP");

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel1.setText("N° OP");

        lblnroOP.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        lblnroOP.setText("- - -");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel3.setText("ESTADO OP:");

        lblEstadoOp.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        lblEstadoOp.setText(" - - -");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel5.setText("LINEA:");

        lblLinea.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        lblLinea.setText("- - -");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel7.setText("SUPLINEA");

        lblSupLinea.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        lblSupLinea.setText(" - - -");

        btnVOLVER.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        btnVOLVER.setText("<");
        btnVOLVER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblnroOP)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstadoOp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSupLinea)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lblLinea))
                    .addComponent(btnMenuInicarOP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReanudarOP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinalizarOP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnPausarOP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnVOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(lblSupLinea))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblnroOP)
                        .addComponent(jLabel3)
                        .addComponent(lblEstadoOp)
                        .addComponent(jLabel5)
                        .addComponent(lblLinea)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnMenuInicarOP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPausarOP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReanudarOP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizarOP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btnFinalizarOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarOPActionPerformed
        
    }//GEN-LAST:event_btnFinalizarOPActionPerformed

    private void btnPausarOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarOPActionPerformed

    }//GEN-LAST:event_btnPausarOPActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnFinalizarOP;
    public javax.swing.JButton btnMenuInicarOP;
    public javax.swing.JButton btnPausarOP;
    public javax.swing.JButton btnReanudarOP;
    private javax.swing.JButton btnVOLVER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblEstadoOp;
    private javax.swing.JLabel lblLinea;
    private javax.swing.JLabel lblSupLinea;
    private javax.swing.JLabel lblnroOP;
    // End of variables declaration//GEN-END:variables
}
