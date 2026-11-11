package com.mycompany.sistemagestionfinanciera;

import javax.swing.JOptionPane;

public class GestionPresupuesto extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GestionPresupuesto.class.getName());

    // Prepara la ventana y muestra los presupuestos guardados.
    public GestionPresupuesto() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(30, 41, 59));
        cargarTablaPresupuestos();
    }

    // Consulta los presupuestos y coloca los resultados en la tabla.
    public void cargarTablaPresupuestos() {
        tblPresupuestos.setModel(Presupuestos.consultar(this));
    }

    // Comprueba que el nombre y el monto ingresados sean válidos.
    private boolean validarFormulario() {
        // El nombre es obligatorio.
        if (txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Ingrese el nombre del presupuesto.", "Dato requerido",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        // El monto también es obligatorio y debe poder convertirse a número.
        String montoTexto = txtMonto.getText().trim();
        if (montoTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Ingrese el monto asignado.", "Dato requerido",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        try {
            double monto = Double.parseDouble(montoTexto);
            // Solo se aceptan montos mayores que cero.
            if (monto > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this,
                        "El monto debe ser un número mayor que cero.", "Monto inválido",
                        JOptionPane.WARNING_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "El monto debe ser un número válido.", "Error de formato",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Vacía el formulario y restablece las opciones.
    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtMonto.setText("");
        cmbMes.setSelectedIndex(0);
        cmbEstado.setSelectedIndex(0);
        tblPresupuestos.clearSelection();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbMes = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblLista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPresupuestos = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        lblDatos = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        lblMes = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbMes.setBackground(new java.awt.Color(15, 23, 42));
        cmbMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbMes.setForeground(new java.awt.Color(226, 232, 240));
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        btnVolver.setBackground(new java.awt.Color(51, 65, 85));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(16, 185, 129));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(16, 185, 129));
        lblNombre.setText("Nombre:");

        lblLista.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblLista.setForeground(new java.awt.Color(167, 243, 208));
        lblLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLista.setText("Lista de Presupuestos");

        tblPresupuestos.setBackground(new java.awt.Color(15, 23, 42));
        tblPresupuestos.setForeground(new java.awt.Color(226, 232, 240));
        tblPresupuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPresupuestos.setFillsViewportHeight(true);
        tblPresupuestos.setGridColor(new java.awt.Color(51, 65, 85));
        tblPresupuestos.setRowHeight(28);
        tblPresupuestos.setSelectionBackground(new java.awt.Color(6, 95, 70));
        tblPresupuestos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblPresupuestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPresupuestosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPresupuestos);

        txtNombre.setBackground(new java.awt.Color(15, 23, 42));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(226, 232, 240));
        txtNombre.setCaretColor(new java.awt.Color(16, 185, 129));

        lblMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMonto.setForeground(new java.awt.Color(16, 185, 129));
        lblMonto.setText("Monto asignado:");

        txtMonto.setBackground(new java.awt.Color(15, 23, 42));
        txtMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(226, 232, 240));
        txtMonto.setCaretColor(new java.awt.Color(16, 185, 129));

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(16, 185, 129));
        lblEstado.setText("Estado:");

        lblTitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(167, 243, 208));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("GESTION DE PRESUPUESTOS");

        cmbEstado.setBackground(new java.awt.Color(15, 23, 42));
        cmbEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbEstado.setForeground(new java.awt.Color(226, 232, 240));
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Finalizado", "Suspendido" }));

        lblDatos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblDatos.setForeground(new java.awt.Color(167, 243, 208));
        lblDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatos.setText("Datos del Presupuesto");

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

        lblMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMes.setForeground(new java.awt.Color(16, 185, 129));
        lblMes.setText("Mes:");

        btnLimpiar.setBackground(new java.awt.Color(16, 185, 129));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(15, 23, 42));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

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
                            .addComponent(lblNombre)
                            .addComponent(lblEstado))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(cmbEstado, 0, 348, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMes)
                            .addComponent(lblMonto))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbMes, 0, 349, Short.MAX_VALUE)
                            .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
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
                    .addComponent(lblMes)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonto)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // Regresa al menú principal y cierra esta ventana.
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tblPresupuestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPresupuestosMouseClicked
        // Copia la fila seleccionada al formulario para consultarla o modificarla.
        int fila = tblPresupuestos.getSelectedRow();
        if (fila >= 0) {
            txtCodigo.setText(tblPresupuestos.getValueAt(fila, 0).toString());
            txtNombre.setText(tblPresupuestos.getValueAt(fila, 1).toString());
            txtMonto.setText(tblPresupuestos.getValueAt(fila, 2).toString());
            cmbMes.setSelectedItem(tblPresupuestos.getValueAt(fila, 3).toString());
            cmbEstado.setSelectedItem(tblPresupuestos.getValueAt(fila, 4).toString());
        }
    }//GEN-LAST:event_tblPresupuestosMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Detiene el registro si los datos no pasan la validación.
        if (!validarFormulario()) {
            return;
        }

        // Obtiene los valores del formulario y crea el nuevo presupuesto.
        String nombre = txtNombre.getText().trim();
        double monto = Double.parseDouble(txtMonto.getText().trim());
        String mes = cmbMes.getSelectedItem().toString();
        Estado estado = Estado.valueOf(cmbEstado.getSelectedItem().toString());

        Presupuestos nuevoPresupuesto = new Presupuestos(nombre, monto, mes, estado);
        String resultado = nuevoPresupuesto.agregar();

        // Informa el resultado, actualiza la tabla y limpia el formulario.
        JOptionPane.showMessageDialog(this, resultado);
        cargarTablaPresupuestos();
        limpiarCampos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // El código se obtiene al seleccionar una fila de la tabla.
        if (txtCodigo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione un presupuesto de la tabla para modificar.");
            return;
        }
        if (!validarFormulario()) {
            return;
        }

        // Construye el presupuesto con su código para actualizar el registro existente.
        try {
            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            String nombre = txtNombre.getText().trim();
            double monto = Double.parseDouble(txtMonto.getText().trim());
            String mes = cmbMes.getSelectedItem().toString();
            Estado estado = Estado.valueOf(cmbEstado.getSelectedItem().toString());

            Presupuestos presupuestoEditado = new Presupuestos(codigo, nombre,
                    monto, mes, estado);
            String resultado = presupuestoEditado.editar();

            // Muestra el resultado y vuelve a cargar la tabla desde la base de datos.
            JOptionPane.showMessageDialog(this, resultado);
            cargarTablaPresupuestos();
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione un presupuesto válido de la tabla.", "Código inválido",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Se requiere seleccionar primero el presupuesto que se eliminará.
        if (txtCodigo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione un presupuesto de la tabla para eliminar.");
            return;
        }

        // Solicita confirmación antes de borrar el registro.
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Desea eliminar este presupuesto?", "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);
        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }

        // Elimina el presupuesto seleccionado y actualiza la tabla.
        try {
            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            Presupuestos presupuestoAEliminar = new Presupuestos(codigo);
            String resultado = presupuestoAEliminar.eliminar();

            JOptionPane.showMessageDialog(this, resultado);
            cargarTablaPresupuestos();
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione un presupuesto válido de la tabla.", "Código inválido",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Limpia el formulario
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblPresupuestos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
