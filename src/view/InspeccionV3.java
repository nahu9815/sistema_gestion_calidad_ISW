

package view;

import datos.Repositorio;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import servAplicacion.GestorRegistrarInspeccion;

/**
 *
 * @author Nahuel
 */
public class InspeccionV3 extends javax.swing.JFrame {
    Repositorio rep;
    DefaultTableModel t1;
    DefaultTableModel t2;
    public InspeccionV3() {
        
       
        initComponents();
        
       
   }
    
    public static final String VOLVER = "volve pibe";
    public static final String AGREGAR_DEFECTO = "agreg";
    public static final String QUITAR_DEFECTO = "quit";
    public static final String A_PRIMERA = "primera pa";
    public static final String SIGUIENTE = "skip";
    public static final String FINALIZAR = "fin";
    public static final String QUITAR_PRIMERA = "quitarPri";
    GestorRegistrarInspeccion gestor = new GestorRegistrarInspeccion();
    ControladorRegitrarInspeccion controlador = new ControladorRegitrarInspeccion();
   public void setController(ControladorRegitrarInspeccion control){
       this.btnAPrimera.setActionCommand(A_PRIMERA);
       this.btnAgregarDefecto.setActionCommand(AGREGAR_DEFECTO);
       this.btnFinalizarReg.setActionCommand(FINALIZAR);
       this.btnQuitarDefecto.setActionCommand(QUITAR_DEFECTO);
       this.btnVOLVER.setActionCommand(VOLVER);
       this.btnQuitarPrimera.setActionCommand(QUITAR_PRIMERA);
       
       this.btnAPrimera.addActionListener(control);
       this.btnAgregarDefecto.addActionListener(control);
       this.btnFinalizarReg.addActionListener(control);
       this.btnQuitarDefecto.addActionListener(control);
       this.btnVOLVER.addActionListener(control);
       this.btnQuitarPrimera.addActionListener(control);
   }
   
   
   public void ejecutar(){
       this.setVisible(true);
       this.setLocation(200, 50);
       
   }
   public String pieIzq(){
       return rbPieIzq.getText();
   }
   public String pieDer(){
       return rbPieDer.getText();
   }
   
  public void llenarTablaOBS(String fila[]){
      t1 = (DefaultTableModel) tbtDefectosOBS.getModel();
      t1.addRow(fila);
  }
  public void llenarTablaREP(String fila[]){
      t2 = (DefaultTableModel) tbtDefectosREP.getModel();
      t2.addRow(fila);
  }
  
   //LLENADO DE TABLA
   /*public void prepararTablaOBS(){
       modelo1.setNumRows(0);
       modelo1.setColumnCount(0);
       modelo1.addColumn("DEFECTOS OBS");
       for (Defecto def : gestor.getDefObs()) {
           String []fila = {def.getNombre()};
           modelo1.addRow(fila);
       }
       tbtDefectosOBS.setModel(modelo1);
   }*/
   
   //LLENADO DE TABLA
   /*public void prepararTablaREP(){
       modelo2.setNumRows(0);
       modelo2.setColumnCount(0);
       modelo2.addColumn("DEFECTOS REP");
       for (Defecto defecto : rep.getDefectoREP()) {
           String []fila ={defecto.getNombre()};
           modelo2.addRow(fila);
       }
       tbtDefectosREP.setModel(modelo2);
   }*/
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregarDefecto = new javax.swing.JButton();
        btnQuitarDefecto = new javax.swing.JButton();
        rbPieIzq = new javax.swing.JRadioButton();
        rbPieDer = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtDefectosOBS = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbtDefectosREP = new javax.swing.JTable();
        btnFinalizarReg = new javax.swing.JButton();
        btnAPrimera = new javax.swing.JButton();
        btnVOLVER = new javax.swing.JButton();
        btnQuitarPrimera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 11))); // NOI18N

        btnAgregarDefecto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAgregarDefecto.setText("+");
        btnAgregarDefecto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDefectoActionPerformed(evt);
            }
        });

        btnQuitarDefecto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnQuitarDefecto.setText("-");
        btnQuitarDefecto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuitarDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarDefectoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbPieIzq);
        rbPieIzq.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        rbPieIzq.setText("IZQUIERDO");
        rbPieIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPieIzqActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbPieDer);
        rbPieDer.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        rbPieDer.setText("DERECHO");

        tbtDefectosOBS.setBackground(new java.awt.Color(204, 204, 204));
        tbtDefectosOBS.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        tbtDefectosOBS.setForeground(new java.awt.Color(0, 0, 0));
        tbtDefectosOBS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DEFECTOS OBS"
            }
        ));
        tbtDefectosOBS.setRowHeight(45);
        tbtDefectosOBS.setSelectionBackground(new java.awt.Color(153, 204, 255));
        tbtDefectosOBS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtDefectosOBSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtDefectosOBS);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbtDefectosREP.setBackground(new java.awt.Color(204, 204, 204));
        tbtDefectosREP.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        tbtDefectosREP.setForeground(new java.awt.Color(0, 0, 0));
        tbtDefectosREP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DEFECTOS REP"
            }
        ));
        tbtDefectosREP.setRowHeight(45);
        tbtDefectosREP.setSelectionBackground(new java.awt.Color(153, 204, 255));
        tbtDefectosREP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtDefectosREPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbtDefectosREP);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbPieIzq)
                            .addComponent(rbPieDer))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarDefecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuitarDefecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarDefecto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbPieIzq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuitarDefecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbPieDer)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnFinalizarReg.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnFinalizarReg.setText("FINALIZAR");
        btnFinalizarReg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAPrimera.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnAPrimera.setText("PRIMERA");
        btnAPrimera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAPrimera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAPrimeraActionPerformed(evt);
            }
        });

        btnVOLVER.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        btnVOLVER.setText("<");
        btnVOLVER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnQuitarPrimera.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnQuitarPrimera.setText("-");
        btnQuitarPrimera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuitarPrimera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarPrimeraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinalizarReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnQuitarPrimera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAPrimera, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAPrimera, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuitarPrimera, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizarReg, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void btnAgregarDefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDefectoActionPerformed
      
    }//GEN-LAST:event_btnAgregarDefectoActionPerformed

    private void rbPieIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPieIzqActionPerformed
        
    }//GEN-LAST:event_rbPieIzqActionPerformed

    private void tbtDefectosOBSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtDefectosOBSMouseClicked
        int fila = tbtDefectosOBS.getSelectedRow();
        String nombre = tbtDefectosOBS.getValueAt(fila,0).toString();
        this.tbtDefectosREP.clearSelection();
    }//GEN-LAST:event_tbtDefectosOBSMouseClicked

    private void tbtDefectosREPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtDefectosREPMouseClicked
        int fila = tbtDefectosREP.getSelectedRow();
        String nombre = tbtDefectosREP.getValueAt(fila,0).toString();
        this.tbtDefectosOBS.clearSelection();
    }//GEN-LAST:event_tbtDefectosREPMouseClicked

    private void btnQuitarDefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarDefectoActionPerformed
        
    }//GEN-LAST:event_btnQuitarDefectoActionPerformed

    private void btnAPrimeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAPrimeraActionPerformed
        
    }//GEN-LAST:event_btnAPrimeraActionPerformed

    private void btnQuitarPrimeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarPrimeraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuitarPrimeraActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAPrimera;
    private javax.swing.JButton btnAgregarDefecto;
    private javax.swing.JButton btnFinalizarReg;
    private javax.swing.JButton btnQuitarDefecto;
    private javax.swing.JButton btnQuitarPrimera;
    private javax.swing.JButton btnVOLVER;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JRadioButton rbPieDer;
    public javax.swing.JRadioButton rbPieIzq;
    public javax.swing.JTable tbtDefectosOBS;
    public javax.swing.JTable tbtDefectosREP;
    // End of variables declaration//GEN-END:variables

}
