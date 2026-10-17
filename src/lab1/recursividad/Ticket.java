/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1.recursividad;

/**
 *
 * @author USUARIO
 */
public class Ticket {
    private String nombre;
    private double montoOriginal;
    private double montoPagado;
    private boolean esPalindromo;

    public Ticket(String nombre, double montoOriginal, double montoPagado, boolean esPalindromo) {
        this.nombre = nombre;
        this.montoOriginal = montoOriginal;
        this.montoPagado = montoPagado;
        this.esPalindromo = esPalindromo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoOriginal() {
        return montoOriginal;
    }

    public void setMontoOriginal(double montoOriginal) {
        this.montoOriginal = montoOriginal;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public boolean isEsPalindromo() {
        return esPalindromo;
    }

    public void setEsPalindromo(boolean esPalindromo) {
        this.esPalindromo = esPalindromo;
    }

  
    
    
}
