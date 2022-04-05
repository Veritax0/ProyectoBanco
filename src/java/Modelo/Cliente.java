/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author MY_PC
 */
public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private int nroCuenta;
    private int valorPrestamo;
    private int nroCuotas;
    private float cobroMensual;
    
    public Cliente(){   
    }

    public Cliente(int id, String nombre, String apellido, int nroCuenta, int valorPrestamo, int nroCuotas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroCuenta = nroCuenta;
        this.valorPrestamo = valorPrestamo;
        this.nroCuotas = nroCuotas;
        this.cobroMensual = (int) (valorPrestamo*(Math.pow(2.1, nroCuotas))) ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public int getValorPrestamo() {
        return valorPrestamo;
    }

    public void setValorPrestamo(int valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

    public int getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(int nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    public float getCobroMensual() {
        return cobroMensual;
    }

    public void setCobroMensual() {
        this.cobroMensual = (int) (valorPrestamo*(Math.pow(2.1, nroCuotas))) ;
    }
    
    
    
    
}
