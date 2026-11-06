
package com.mycompany.sistemagestionfinanciera;

public class Ingreso {
    private int codigo;
    private String descripcion;
    private double monto;
    private String fecha;
    private Tipo  tipo;

    public Ingreso(int codigo, String descripcion, double monto, String fecha, Tipo tipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
        this.tipo = tipo;
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
