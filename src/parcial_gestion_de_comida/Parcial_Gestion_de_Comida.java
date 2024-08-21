/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_gestion_de_comida;

import Controlador.Gestion;
import Modelo.BaseDeDatos;
import Vista.Menu;

/**
 *
 * @author Lenovo
 */
public class Parcial_Gestion_de_Comida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseDeDatos.login();
        Menu nm = new Menu();
        
        Gestion g = new Gestion( nm);
        g.iniciar();
        nm.setVisible(true);
        
        
       
        
        
    }
    
}
