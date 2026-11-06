package com.mycompany.sistemagestionfinanciera;

public class Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());


    public Principal() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(30,41,59));
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnGastos = new javax.swing.JButton();
        BtnPresupuestos = new javax.swing.JButton();
        BtnIngresos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(15, 23, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(167, 243, 208));
        jLabel1.setText("GESTION FINANCIERA PERSONAL");

        BtnGastos.setBackground(new java.awt.Color(51, 65, 85));
        BtnGastos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnGastos.setForeground(new java.awt.Color(16, 185, 129));
        BtnGastos.setText("Gestion de Gastos");
        BtnGastos.addActionListener(this::BtnGastosActionPerformed);

        BtnPresupuestos.setBackground(new java.awt.Color(51, 65, 85));
        BtnPresupuestos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnPresupuestos.setForeground(new java.awt.Color(16, 185, 129));
        BtnPresupuestos.setText("Gestion de Presupuestos");
        BtnPresupuestos.addActionListener(this::BtnPresupuestosActionPerformed);

        BtnIngresos.setBackground(new java.awt.Color(51, 65, 85));
        BtnIngresos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnIngresos.setForeground(new java.awt.Color(16, 185, 129));
        BtnIngresos.setText("Gestion de Ingresos");
        BtnIngresos.addActionListener(this::BtnIngresosActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(BtnGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(BtnPresupuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(BtnPresupuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPresupuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPresupuestosActionPerformed
        GestionPresupuesto presupuesto = new GestionPresupuesto();
        presupuesto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnPresupuestosActionPerformed

    private void BtnIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresosActionPerformed
        GestionIngreso ingreso = new GestionIngreso();
        ingreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnIngresosActionPerformed

    private void BtnGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGastosActionPerformed
        GestionGastos gasto = new GestionGastos();
        gasto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnGastosActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGastos;
    private javax.swing.JButton BtnIngresos;
    private javax.swing.JButton BtnPresupuestos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
