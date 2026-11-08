package com.mycompany.sistemagestionfinanciera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Gasto {
    private int codigo;
    private String descripcion;
    private double monto;
    private String fecha;
    private Categoria categoria;
    
    //Constructor de Editar
    public Gasto(int codigo, String descripcion, double monto, String fecha, Categoria categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
        this.categoria = categoria;
    }
    
    //Constructor Agregar

    public Gasto(String descripcion, double monto, String fecha, Categoria categoria) {
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
        this.categoria = categoria;
    }
    
    //Constructor Eliminar
    public Gasto(int codigo) {
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
        modelo.addColumn("CATEGORIA");
        String fila[] = new String[5];

        try {
            PreparedStatement ps = conexionSQL.conectarSQL().prepareStatement(
                    "SELECT * FROM gastos;");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                fila[0] = rs.getString("codigo");
                fila[1] = rs.getString("descripcion");
                fila[2] = rs.getString("monto");
                fila[3] = rs.getString("fecha");
                fila[4] = rs.getString("categoria");
                modelo.addRow(fila);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "No se pudo cargar los gastos.");
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

        String sql = "INSERT INTO gastos (descripcion, monto, fecha, categoria)"
                + "VALUES (?, ?, ?,?);";

        try {
            PreparedStatement ps = conexionSQL.conectarSQL()
                    .prepareStatement(sql);
            
            ps.setString(1, this.descripcion);
            ps.setDouble(2, this.monto);
            ps.setString(3, this.fecha); //(YYYY,MM,DD)
            ps.setString(4, this.categoria.toString());
            
            ps.executeUpdate();
            return "Gasto agregado con exito.";
        } catch (SQLException ex) {
            System.out.println("Exception Agregar: " + ex.getMessage());
            return "No se pudo agregar el gasto.";
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
                     UPDATE gastos SET
                     descripcion = ?,
                     monto = ?,
                     fecha = ?,
                     categoria = ?
                     WHERE codigo = ?;""";

        try {
            PreparedStatement ps = conexionSQL.conectarSQL()
                    .prepareStatement(sql);
            
            ps.setString(1, this.descripcion);
            ps.setDouble(2, this.monto);
            ps.setString(3, this.fecha);
            ps.setString(4, this.categoria.toString());
            ps.setInt(5, this.codigo);
            
            ps.executeUpdate();
            return "Gasto modificado con exito.";
        } catch (SQLException ex) {
            System.out.println("Exception Editar: " + ex.getMessage());
            return "No se pudo modificar el gasto.";
        } catch (Exception ex) {
            return "No se pudo establacer conexion con la base de datos.";
        } finally {
            conexionSQL.desconectarSQL();
        }
    }
    
    // Eliminar:
    public String eliminar() {
        ConexionSQL conexionSQL = new ConexionSQL();

        String sql = "DELETE FROM gastos WHERE codigo = ?;";

        try {
            PreparedStatement ps = conexionSQL.conectarSQL()
                    .prepareStatement(sql);

            ps.setInt(1, this.codigo);
            
            ps.executeUpdate();
            return "Gasto eliminado con exito.";
        } catch (SQLException ex) {
            System.out.println("Exception Eliminar: " + ex.getMessage());
            return "No se pudo eliminar el gasto.";
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
