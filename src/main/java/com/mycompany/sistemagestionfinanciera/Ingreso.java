
package com.mycompany.sistemagestionfinanciera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ingreso {
    private int codigo;
    private String descripcion;
    private double monto;
    private String fecha;
    private Tipo  tipo;

    
    //Constructor Agregar
    public Ingreso( String descripcion, double monto, String fecha, Tipo tipo) {
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
        this.tipo = tipo;
    }
    
    //Constructor Editar
    public Ingreso(int codigo, String descripcion, double monto, String fecha, Tipo tipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
        this.tipo = tipo;
    }
    
    //Constructor Eliminar 
    public Ingreso(int codigo) {
        this.codigo = codigo;
    }
    
    // METODOS CRUD
    // Consultar:
    public static DefaultTableModel consultar(JFrame frame) {
        ConexionSQL conexionSQL = new ConexionSQL();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("CODIGO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("MONTO");
        modelo.addColumn("FECHA");
        modelo.addColumn("TIPO");
        String fila[] = new String[5];

        try {
            PreparedStatement ps = conexionSQL.conectarSQL().prepareStatement(
                    "SELECT * FROM ingresos;");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                fila[0] = rs.getString("codigo");
                fila[1] = rs.getString("descripcion");
                fila[2] = rs.getString("monto");
                fila[3] = rs.getString("fecha");
                fila[4] = rs.getString("tipo");
                modelo.addRow(fila);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "No se pudo cargar los ingresos.");
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

        String sql = "INSERT INTO ingresos (descripcion, monto, fecha, tipo)"
                + "VALUES (?, ?, ?,?);";

        try {
            PreparedStatement ps = conexionSQL.conectarSQL()
                    .prepareStatement(sql);
            
            ps.setString(1, this.descripcion);
            ps.setDouble(2, this.monto);
            ps.setString(3, this.fecha); //(YYYY,MM,DD)
            ps.setString(4, this.tipo.toString());
            
            ps.executeUpdate();
            return "Ingreso agregado con exito.";
        } catch (SQLException ex) {
            System.out.println("Exception Agregar: " + ex.getMessage());
            return "No se pudo agregar el ingreso.";
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
                     UPDATE ingresos SET
                     descripcion = ?,
                     monto = ?,
                     fecha = ?,
                     tipo = ?
                     WHERE codigo = ?;""";

        try {
            PreparedStatement ps = conexionSQL.conectarSQL()
                    .prepareStatement(sql);
            
            ps.setString(1, this.descripcion);
            ps.setDouble(2, this.monto);
            ps.setString(3, this.fecha);
            ps.setString(4, this.tipo.toString());
            ps.setInt(5, this.codigo);
            
            ps.executeUpdate();
            return "Ingreso modificado con exito.";
        } catch (SQLException ex) {
            System.out.println("Exception Editar: " + ex.getMessage());
            return "No se pudo modificar el ingreso.";
        } catch (Exception ex) {
            return "No se pudo establacer conexion con la base de datos.";
        } finally {
            conexionSQL.desconectarSQL();
        }
    }
    
    // Eliminar:
    public String eliminar() {
        ConexionSQL conexionSQL = new ConexionSQL();

        String sql = "DELETE FROM ingresos WHERE codigo = ?;";

        try {
            PreparedStatement ps = conexionSQL.conectarSQL()
                    .prepareStatement(sql);

            ps.setInt(1, this.codigo);
            
            ps.executeUpdate();
            return "Ingreso eliminado con exito.";
        } catch (SQLException ex) {
            System.out.println("Exception Eliminar: " + ex.getMessage());
            return "No se pudo eliminar el ingreso.";
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
}
