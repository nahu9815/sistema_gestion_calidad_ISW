package view;

/**
 *
 * @author Nahuel
 */
public class MenuCALIDAD extends javax.swing.JFrame {

    public MenuCALIDAD() {
        initComponents();
    }

    public static final String REGISTRAR_DEFECTOS = "reg";
    public static final String CARGAR_HERMANADO = "hermanao";
    public static final String ABANDONAR_OP = "riber";

    public void setController(ControladorRegitrarInspeccion control) {
        this.btnRegistrarDefectos.setActionCommand(REGISTRAR_DEFECTOS);
        this.btnCargarHermanado.setActionCommand(CARGAR_HERMANADO);

        this.btnRegistrarDefectos.addActionListener(control);
        this.btnCargarHermanado.addActionListener(control);
    }

    public void setControllerAbandonarOP(ControladorAbandonarOP control) {
        this.btnAbandonar.setActionCommand(ABANDONAR_OP);
        this.btnAbandonar.addActionListener(control);
    }

    public void ejecutar() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void setNroOP(String nro) {
        this.lblOP.setText(nro);
    }

    public void setModelo(String modelo) {
        this.lblModelo.setText(modelo);
    }

    public void setColor(String color) {
        this.lblColor.setText(color);
    }

    public void setLinea(String linea) {
        this.lblLinea.setText(linea);
    }

    public void setEstadoOP(String estado) {
        this.lblEstado.setText(estado);
    }

    public int getLinea() {
        return Integer.parseInt(lblLinea.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarDefectos = new javax.swing.JButton();
        btnCargarHermanado = new javax.swing.JButton();
        btnAbandonar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLinea = new javax.swing.JLabel();
        lblOP = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        btnVOLVER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        btnRegistrarDefectos.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnRegistrarDefectos.setText("REGISTRAR DEFECTO");
        btnRegistrarDefectos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCargarHermanado.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnCargarHermanado.setText("CARGAR HERMANADO");
        btnCargarHermanado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarHermanado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarHermanadoActionPerformed(evt);
            }
        });

        btnAbandonar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnAbandonar.setText("ABANDONAR");
        btnAbandonar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setText("OP:");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setText("LINEA:");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setText("MODELO:");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel5.setText("COLOR:");

        lblLinea.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblLinea.setForeground(new java.awt.Color(102, 102, 102));
        lblLinea.setText("- - -");

        lblOP.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblOP.setForeground(new java.awt.Color(102, 102, 102));
        lblOP.setText("- - -");

        lblModelo.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(102, 102, 102));
        lblModelo.setText("- - -");

        lblColor.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblColor.setForeground(new java.awt.Color(102, 102, 102));
        lblColor.setText("- - -");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel9.setText("ESTADO:");

        lblEstado.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(102, 102, 102));
        lblEstado.setText("EN PROCESO");

        btnVOLVER.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        btnVOLVER.setText("<");
        btnVOLVER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lblLinea)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegistrarDefectos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCargarHermanado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAbandonar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblOP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblColor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstado)
                            .addComponent(lblModelo))
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblLinea))))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(lblEstado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblOP))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblColor)
                            .addComponent(jLabel4)
                            .addComponent(lblModelo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnRegistrarDefectos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnCargarHermanado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnAbandonar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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

    private void btnCargarHermanadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarHermanadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarHermanadoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCALIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCALIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCALIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCALIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCALIDAD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbandonar;
    private javax.swing.JButton btnCargarHermanado;
    private javax.swing.JButton btnRegistrarDefectos;
    private javax.swing.JButton btnVOLVER;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblLinea;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblOP;
    // End of variables declaration//GEN-END:variables
}
