/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class Comida {
    protected String tipo;
    protected String nombre;

    public Comida(String nombre, String tipo) {
        this.tipo = tipo;
        this.nombre = nombre;
    }


    public String getTipo() {
        return tipo;
    }

    
    public String getNombre() {
        return nombre;
    }
    
    
    
}
