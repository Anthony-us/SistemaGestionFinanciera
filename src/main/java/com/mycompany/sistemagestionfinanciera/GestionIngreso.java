package com.mycompany.sistemagestionfinanciera;

public class GestionIngreso extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GestionIngreso.class.getName());

    public GestionIngreso() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(30, 41, 59));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFecha = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();
        lblLista = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngresos = new javax.swing.JTable();
        lblMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        lblDatos = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(16, 185, 129));
        lblFecha.setText("Fecha (AAAA-MM-DD):");

        btnLimpiar.setBackground(new java.awt.Color(16, 185, 129));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(15, 23, 42));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        txtFecha.setBackground(new java.awt.Color(15, 23, 42));
        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(226, 232, 240));
        txtFecha.setCaretColor(new java.awt.Color(16, 185, 129));

        btnVolver.setBackground(new java.awt.Color(51, 65, 85));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(16, 185, 129));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(16, 185, 129));
        lblDescripcion.setText("Descripción:");

        lblLista.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblLista.setForeground(new java.awt.Color(167, 243, 208));
        lblLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLista.setText("Lista de Ingresos");

        txtDescripcion.setBackground(new java.awt.Color(15, 23, 42));
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(226, 232, 240));
        txtDescripcion.setCaretColor(new java.awt.Color(16, 185, 129));

        tblIngresos.setBackground(new java.awt.Color(15, 23, 42));
        tblIngresos.setForeground(new java.awt.Color(226, 232, 240));
        tblIngresos.setFillsViewportHeight(true);
        tblIngresos.setGridColor(new java.awt.Color(51, 65, 85));
        tblIngresos.setRowHeight(28);
        tblIngresos.setSelectionBackground(new java.awt.Color(6, 95, 70));
        tblIngresos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblIngresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIngresosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIngresos);

        lblMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMonto.setForeground(new java.awt.Color(16, 185, 129));
        lblMonto.setText("Monto:");

        txtMonto.setBackground(new java.awt.Color(15, 23, 42));
        txtMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(226, 232, 240));
        txtMonto.setCaretColor(new java.awt.Color(16, 185, 129));

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(16, 185, 129));
        lblTipo.setText("Tipo:");

        lblTitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(167, 243, 208));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("GESTION DE INGRESOS");

        cmbTipo.setBackground(new java.awt.Color(15, 23, 42));
        cmbTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTipo.setForeground(new java.awt.Color(226, 232, 240));
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salario", "Venta", "Comision", "Inversion", "otro" }));

        lblDatos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblDatos.setForeground(new java.awt.Color(167, 243, 208));
        lblDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatos.setText("Datos del Ingreso");

        btnAgregar.setBackground(new java.awt.Color(16, 185, 129));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(15, 23, 42));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(16, 185, 129));
        lblCodigo.setText("Código:");

        btnEditar.setBackground(new java.awt.Color(51, 65, 85));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(16, 185, 129));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(22, 33, 52));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(226, 232, 240));
        txtCodigo.setCaretColor(new java.awt.Color(16, 185, 129));

        btnEliminar.setBackground(new java.awt.Color(51, 65, 85));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(248, 113, 113));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblDescripcion)
                            .addComponent(lblTipo))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(cmbTipo, 0, 295, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addComponent(lblMonto))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addComponent(lblLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblDatos)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonto)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lblLista)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tblIngresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIngresosMouseClicked

    }//GEN-LAST:event_tblIngresosMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
   
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
   
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblIngresos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables

}
