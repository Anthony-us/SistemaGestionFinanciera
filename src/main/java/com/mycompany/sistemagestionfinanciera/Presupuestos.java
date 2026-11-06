
package com.mycompany.sistemagestionfinanciera;

public class Presupuestos {
    int codigo;
    String nombre;
    double montoAsignado;
    String mes;
    Estado estado;

    public Presupuestos(int codigo, String nombre, double montoAsignado, String mes, Estado estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.montoAsignado = montoAsignado;
        this.mes = mes;
        this.estado = estado;
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
