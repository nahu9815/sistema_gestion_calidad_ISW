
package view;

import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Nahuel
 */
public class VisualizarDatos extends javax.swing.JFrame {

    DefaultTableModel t1;
    public VisualizarDatos() {
        initComponents();
    }

    public void setController(ControladorRegitrarInspeccion control){
        
    }
    public void ejecutar(){
        this.setVisible(true);
        this.setLocation(600, 50);
    }
    
    public void setOP(String op){
        this.lblVOP.setText(op);
    }
    public void setModelo(String modelo){
        this.lblVModelo.setText(modelo);
    }
    public void setLinea (String linea){
        this.lblVLINEA.setText(linea);
    }
    public void setColor(String color){
        this.lblVColor.setText(color);
    }
    public void setHoraInicio(String hora){
        this.lblVHoraInicio.setText(hora);
    }
    public void setObjetivoHora(String obj){
        this.lblObjHora.setText(obj);
    }
    
    public void setTOTPRimera(int total){
        this.lblTOTPrimera.setText(""+total);
    }
    public void setDefectosEncontrados(String defecto){
        txtDefectosEncontrados.setText(defecto);
    }
    
    public void cargarTabla(String fila[]){
        
        t1 = (DefaultTableModel) tbtProdRealHora.getModel();
        t1.setNumRows(0);
        t1.addRow(fila);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblDef1 = new javax.swing.JLabel();
        lblDef2 = new javax.swing.JLabel();
        lblDef3 = new javax.swing.JLabel();
        lblCantDef1 = new javax.swing.JLabel();
        lblCantDef2 = new javax.swing.JLabel();
        lblCantDef3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblVOP = new javax.swing.JLabel();
        lblVHoraInicio = new javax.swing.JLabel();
        lblVLINEA = new javax.swing.JLabel();
        lblVModelo = new javax.swing.JLabel();
        lblVColor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblObjHora = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTOTPrimera = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtProdRealHora = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDefectosEncontrados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(576, 720));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DEFECTOS MAS ENCONTRADOS ULTIMAS 4 HS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 11))); // NOI18N

        lblDef1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblDef1.setText("- - -");

        lblDef2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblDef2.setText("- - -");

        lblDef3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblDef3.setText("- - -");

        lblCantDef1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblCantDef1.setForeground(new java.awt.Color(102, 102, 102));
        lblCantDef1.setText("- - -");

        lblCantDef2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblCantDef2.setForeground(new java.awt.Color(102, 102, 102));
        lblCantDef2.setText("- - -");

        lblCantDef3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblCantDef3.setForeground(new java.awt.Color(102, 102, 102));
        lblCantDef3.setText("- - -");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDef3)
                        .addGap(76, 76, 76)
                        .addComponent(lblCantDef3))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblDef2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCantDef2))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblDef1)
                            .addGap(76, 76, 76)
                            .addComponent(lblCantDef1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDef1)
                    .addComponent(lblCantDef1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDef2)
                    .addComponent(lblCantDef2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDef3)
                    .addComponent(lblCantDef3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS OP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 11))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel7.setText("OP:");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel8.setText("LINEA:");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel9.setText("HORA INICIO:");

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel10.setText("MODELO:");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel11.setText("COLOR:");

        lblVOP.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblVOP.setForeground(new java.awt.Color(102, 102, 102));
        lblVOP.setText("- - -");

        lblVHoraInicio.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblVHoraInicio.setForeground(new java.awt.Color(102, 102, 102));
        lblVHoraInicio.setText("- - -");

        lblVLINEA.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblVLINEA.setForeground(new java.awt.Color(102, 102, 102));
        lblVLINEA.setText("- - -");

        lblVModelo.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblVModelo.setForeground(new java.awt.Color(102, 102, 102));
        lblVModelo.setText("- - -");

        lblVColor.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblVColor.setForeground(new java.awt.Color(102, 102, 102));
        lblVColor.setText("- - -");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVHoraInicio)
                            .addComponent(lblVOP)
                            .addComponent(lblVLINEA))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVColor)
                    .addComponent(lblVModelo))
                .addGap(106, 106, 106))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(lblVOP)
                    .addComponent(lblVModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(lblVLINEA)
                    .addComponent(lblVColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblVHoraInicio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel12.setText("OBJETIVO/HORA");

        lblObjHora.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblObjHora.setForeground(new java.awt.Color(102, 102, 102));
        lblObjHora.setText("- - -");

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel14.setText("TOTAL PRMERA");

        lblTOTPrimera.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lblTOTPrimera.setForeground(new java.awt.Color(102, 102, 102));
        lblTOTPrimera.setText("- - -");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCCION REAL/HORA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 11))); // NOI18N

        tbtProdRealHora.setBackground(new java.awt.Color(204, 255, 204));
        tbtProdRealHora.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tbtProdRealHora.setForeground(new java.awt.Color(51, 51, 51));
        tbtProdRealHora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "HORA 1", "HORA 2", "HORA 3", "HORA 4"
            }
        ));
        tbtProdRealHora.setGridColor(new java.awt.Color(0, 0, 0));
        tbtProdRealHora.setRowHeight(40);
        tbtProdRealHora.setSelectionBackground(new java.awt.Color(102, 255, 153));
        jScrollPane1.setViewportView(tbtProdRealHora);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DEFECTOS ENCONTRADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 11))); // NOI18N

        txtDefectosEncontrados.setColumns(20);
        txtDefectosEncontrados.setRows(5);
        jScrollPane2.setViewportView(txtDefectosEncontrados);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblObjHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(32, 32, 32)
                        .addComponent(lblTOTPrimera)
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblObjHora)
                    .addComponent(jLabel14)
                    .addComponent(lblTOTPrimera))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(VisualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblCantDef1;
    public javax.swing.JLabel lblCantDef2;
    public javax.swing.JLabel lblCantDef3;
    public javax.swing.JLabel lblDef1;
    public javax.swing.JLabel lblDef2;
    public javax.swing.JLabel lblDef3;
    private javax.swing.JLabel lblObjHora;
    private javax.swing.JLabel lblTOTPrimera;
    private javax.swing.JLabel lblVColor;
    private javax.swing.JLabel lblVHoraInicio;
    private javax.swing.JLabel lblVLINEA;
    private javax.swing.JLabel lblVModelo;
    private javax.swing.JLabel lblVOP;
    private javax.swing.JTable tbtProdRealHora;
    public javax.swing.JTextArea txtDefectosEncontrados;
    // End of variables declaration//GEN-END:variables

    void action(String REGISTRAR_DEFECTOS, ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
