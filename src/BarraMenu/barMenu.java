/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarraMenu;

import MenuPrincipal.principal;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author auval
 */
public class barMenu extends JMenuBar{
    
    public void barra(){
        
        setBackground(principal.BarraM2);
        
        JMenu M_Archivo = new JMenu();
        JMenuItem It_Salir = new JMenuItem();
        
        M_Archivo.setText("Archivo");
        
        It_Salir.setText("Salir");
        
        M_Archivo.add(It_Salir);
        
        add(M_Archivo);
        
    }
    
}
