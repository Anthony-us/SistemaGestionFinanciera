package com.mycompany.sistemagestionfinanciera;

import javax.swing.JOptionPane;

public class GestionGastos extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GestionGastos.class.getName());

    public GestionGastos() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTablaGastos();

    }

    public void cargarTablaGastos() {
        TablaGastos.setModel(Gasto.consultar(this));
    }

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtMonto.setText("");
        txtFecha.setText("");

        if (cbxCategoria.getItemCount() > 0) {
            cbxCategoria.setSelectedIndex(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        cbxCategoria = new javax.swing.JComboBox<>();
        txtDescripcion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaGastos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(16, 185, 129)), "Datos del Gasto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 3, 14), new java.awt.Color(51, 65, 85))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(51, 65, 85));
        jLabel1.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 65, 85));
        jLabel1.setText("Codigo:");

        jLabel2.setBackground(new java.awt.Color(16, 185, 129));
        jLabel2.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel2.setText("Descripción:");

        jLabel6.setBackground(new java.awt.Color(51, 65, 85));
        jLabel6.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 65, 85));
        jLabel6.setText("Monto:");

        jLabel7.setBackground(new java.awt.Color(51, 65, 85));
        jLabel7.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 65, 85));
        jLabel7.setText("Fecha:");

        jLabel8.setBackground(new java.awt.Color(51, 65, 85));
        jLabel8.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 65, 85));
        jLabel8.setText("Categoria:");

        txtMonto.addActionListener(this::txtMontoActionPerformed);

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(this::txtCodigoActionPerformed);

        btnRegistrar.setBackground(new java.awt.Color(16, 185, 129));
        btnRegistrar.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnEliminar.setBackground(new java.awt.Color(16, 185, 129));
        btnEliminar.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnEditar.setBackground(new java.awt.Color(16, 185, 129));
        btnEditar.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnVolver.setBackground(new java.awt.Color(16, 185, 129));
        btnVolver.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        cbxCategoria.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentación", "Transporte", "Vivienda", "Salud", "Entrenamiento", "Educación" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescripcion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMonto)
                                    .addComponent(txtCodigo))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFecha)
                                    .addComponent(cbxCategoria, 0, 200, Short.MAX_VALUE))))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(16, 185, 129)), "Gastos Registrados ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 3, 14))); // NOI18N

        TablaGastos.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        TablaGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Monto", "Fecha", "Categoria", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaGastosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaGastos);
        if (TablaGastos.getColumnModel().getColumnCount() > 0) {
            TablaGastos.getColumnModel().getColumn(0).setPreferredWidth(70);
            TablaGastos.getColumnModel().getColumn(1).setPreferredWidth(70);
            TablaGastos.getColumnModel().getColumn(2).setPreferredWidth(70);
            TablaGastos.getColumnModel().getColumn(3).setPreferredWidth(70);
            TablaGastos.getColumnModel().getColumn(4).setPreferredWidth(170);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            String descripcion = txtDescripcion.getText().trim();
            double monto = Double.parseDouble(txtMonto.getText().trim());
            String fecha = txtFecha.getText().trim();

            String nombreCategoria = cbxCategoria.getSelectedItem().toString();
            Categoria categoria = Categoria.valueOf(nombreCategoria);

            Gasto nuevoGasto = new Gasto(descripcion, monto, fecha, categoria);

            String resultado = nuevoGasto.agregar();

            JOptionPane.showMessageDialog(null, resultado);
            limpiarCampos();
            cargarTablaGastos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El monto debe ser un "
                    + "número válido.", "Error de formato",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        try {
            if (txtCodigo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese o seleccione "
                        + "el código del gasto a eliminar.");
                return;
            }

            int codigo = Integer.parseInt(txtCodigo.getText().trim());

            int confirmacion = javax.swing.JOptionPane.showConfirmDialog(null,
                    "¿Está seguro de eliminar este gasto?", "Confirmar",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
                Gasto gastoAEliminar = new Gasto(codigo);

                String resultado = gastoAEliminar.eliminar();

                JOptionPane.showMessageDialog(null, resultado);
                limpiarCampos();
                cargarTablaGastos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        try {
            if (txtCodigo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione un "
                        + "gasto de la tabla para modificar.");
                return;
            }

            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            String descripcion = txtDescripcion.getText().trim();
            double monto = Double.parseDouble(txtMonto.getText().trim());
            String fecha = txtFecha.getText().trim();

            String nombreCategoria = cbxCategoria.getSelectedItem().toString();
            Categoria categoria = Categoria.valueOf(nombreCategoria);

            Gasto gastoAModificar = new Gasto(codigo, descripcion, monto, fecha, categoria);
            String resultado = gastoAModificar.editar();

            JOptionPane.showMessageDialog(null, resultado);
            limpiarCampos();
            cargarTablaGastos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El monto debe ser un número "
                    + "válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + e.getMessage());
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void TablaGastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaGastosMouseClicked

        int fila = TablaGastos.getSelectedRow();
        if (fila >= 0) {
            txtCodigo.setText(TablaGastos.getValueAt(fila, 0).toString());
            txtDescripcion.setText(TablaGastos.getValueAt(fila, 1).toString());
            txtMonto.setText(TablaGastos.getValueAt(fila, 2).toString());
            txtFecha.setText(TablaGastos.getValueAt(fila, 3).toString());
            cbxCategoria.setSelectedItem(TablaGastos.getValueAt(fila, 4).toString());
        }
    }//GEN-LAST:event_TablaGastosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaGastos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
