/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarraMenu;

import CatalogoProveedores.Proveedores;
import MenuPrincipal.principal;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author auval
 */
public class barMenu extends JMenuBar{

    private JMenuItem It_Salir,prueba;
    private JMenu M_Archivo;
    
    public void barra(){
        
        setBackground(principal.BarraM2);
        
        M_Archivo = new JMenu();
        It_Salir = new JMenuItem();
        prueba = new JMenuItem();
        
        M_Archivo.setText("Archivo");
        M_Archivo.setFont(principal.ArialB14);
        
        It_Salir.setText("Salir");
        It_Salir.setFont(principal.ArialP12);
        It_Salir.addActionListener((e) -> {
            
            new principal().cerrarPrograma();
            
        });
        
        prueba.setText("prueba");
        prueba.addActionListener((e) -> {
            
            Proveedores CP = new Proveedores();
            CP.Proveedores();
        });
        
        M_Archivo.add(It_Salir);
        M_Archivo.add(prueba);
        
        
        add(M_Archivo);
        
    }
    
}
