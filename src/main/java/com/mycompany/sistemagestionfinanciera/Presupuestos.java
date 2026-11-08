
package com.mycompany.sistemagestionfinanciera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Presupuestos {
    private int codigo;
    private String nombre;
    private double montoAsignado;
    private String mes;
    private Estado estado;
    
    //Constructor de Editar
    public Presupuestos(int codigo, String nombre, double montoAsignado, String mes, Estado estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.montoAsignado = montoAsignado;
        this.mes = mes;
        this.estado = estado;
    }
    
    //Constructor de Agregar
    public Presupuestos(String nombre, double montoAsignado, String mes, Estado estado) {
        this.nombre = nombre;
        this.montoAsignado = montoAsignado;
        this.mes = mes;
        this.estado = estado;
    }
    
    //Constructor Eliminar

    public Presupuestos(int codigo) {
        this.codigo = codigo;
    }
    
    // METODOS CRUD
    // Consultar:
    public static DefaultTableModel consultar(JFrame frame) {
        ConexionSQL conexionSQL = new ConexionSQL();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("MONTOASIGNADO");
        modelo.addColumn("MES");
        modelo.addColumn("ESTADO");
        String fila[] = new String[5];

        try {
            PreparedStatement ps = conexionSQL.conectarSQL().prepareStatement(
                    "SELECT * FROM presupuesto;");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                fila[0] = rs.getString("codigo");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("montoAsignado");
                fila[3] = rs.getString("mes");
                fila[4] = rs.getString("estado");
                modelo.addRow(fila);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "No se pudo cargar los presupuestos.");
            System.out.println("Exception Consultar: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame,
                    "No se pudo establacer conexion con la base de datos.");
        } finally {
            conexionSQL.desconectarSQL();
        }

        return modelo;
    }

    // Agregar:
    public String agregar() {
        ConexionSQL conexionSQL = new ConexionSQL();

        String sql = "INSERT INTO presupuesto (nombre, montoAsignado, mes, estado)"
                + "VALUES (?, ?, ?,?);";

        try {
            PreparedStatement ps = conexionSQL.conectarSQL()
                    .prepareStatement(sql);
            
            ps.setString(1, this.nombre);
            ps.setDouble(2, this.montoAsignado);
            ps.setString(3, this.mes); //Enero, Febrero...
            ps.setString(4, this.estado.toString());
            
            ps.executeUpdate();
            return "Presupuesto agregado con exito.";
        } catch (SQLException ex) {
            System.out.println("Exception Agregar: " + ex.getMessage());
            return "No se pudo agregar el presupuesto.";
        } catch (Exception ex) {
            return "No se pudo establacer conexion con la base de datos.";
        } finally {
            conexionSQL.desconectarSQL();
        }
    }

    // Modificar:
    public String editar() {
        ConexionSQL conexionSQL = new ConexionSQL();

        String sql = """
                     UPDATE presupuesto SET
                     nombre = ?,
                     montoAsignado = ?,
                     mes = ?,
                     estado = ?
                     WHERE codigo = ?;""";

        try {
            PreparedStatement ps = conexionSQL.conectarSQL()
                    .prepareStatement(sql);
            
            ps.setString(1, this.nombre);
            ps.setDouble(2, this.montoAsignado);
            ps.setString(3, this.mes);
            ps.setString(4, this.estado.toString());
            ps.setInt(5, this.codigo);
            
            ps.executeUpdate();
            return "presupuesto modificado con exito.";
        } catch (SQLException ex) {
            System.out.println("Exception Editar: " + ex.getMessage());
            return "No se pudo modificar el presupuesto.";
        } catch (Exception ex) {
            return "No se pudo establacer conexion con la base de datos.";
        } finally {
            conexionSQL.desconectarSQL();
        }
    }
    
    // Eliminar:
    public String eliminar() {
        ConexionSQL conexionSQL = new ConexionSQL();

        String sql = "DELETE FROM presupuesto WHERE codigo = ?;";

        try {
            PreparedStatement ps = conexionSQL.conectarSQL()
                    .prepareStatement(sql);

            ps.setInt(1, this.codigo);
            
            ps.executeUpdate();
            return "presupuesto eliminado con exito.";
        } catch (SQLException ex) {
            System.out.println("Exception Eliminar: " + ex.getMessage());
            return "No se pudo eliminar el presupuesto.";
        } catch (Exception ex) {
            return "No se pudo establacer conexion con la base de datos.";
        } finally {
            conexionSQL.desconectarSQL();
        }
    }
    

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoAsignado() {
        return montoAsignado;
    }

    public void setMontoAsignado(double montoAsignado) {
        this.montoAsignado = montoAsignado;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
}
