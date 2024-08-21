/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDeDatos;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Lenovo
 */
public class Gestion implements ActionListener{

    private final Menu menu;

    public Gestion(Menu menu) {
   
        this.menu = menu;
        this.menu.generarOrdenButton.addActionListener(this);
        
        ComboBoxModel cbm = new DefaultComboBoxModel(BaseDeDatos.getNameFrutas("frutas"));
        this.menu.frutasComboBox.setModel(cbm);
    }
       
    public void iniciar(){
        menu.setTitle("Menu Selección de Frutas");
        menu.setLocationRelativeTo(null);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == menu.generarOrdenButton){
            
        }
    
    
    }    
            
}
