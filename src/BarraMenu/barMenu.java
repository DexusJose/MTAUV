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
import manager.hojacosto.RegistroCosto;
import manager.nuevaMDB.Nuevamdb;

/**
 *
 * @author auval
 */
public class barMenu extends JMenuBar{

    // ******* Declaración de items *******
    
    private JMenuItem It_Salir,prueba;
    private JMenu M_Archivo;
    private JMenuItem It_hojaCosto,It_NMDB;
    
    // ******* Nombres de los items ******
    
    private String MnArchivo = "Archivo";
    private String itmSalir = "Salir";
    private String itmHojaregistro = "Registro costo $";
    private String itmNMDB = "Nuevo MDB";
    
    
    public void barra(){
        
        setBackground(principal.BarraM2);
        
        M_Archivo = new JMenu();
        It_Salir = new JMenuItem();
        It_hojaCosto = new JMenuItem();
        It_NMDB= new JMenuItem();
        prueba = new JMenuItem();
        
        M_Archivo.setText(MnArchivo);
        M_Archivo.setFont(principal.ArialB14);
        
        It_Salir.setText(itmSalir);
        It_Salir.setFont(principal.ArialB12);
        It_Salir.addActionListener((e) -> {
            
            new principal().cerrarPrograma();
            
        });
        
        It_hojaCosto.setText(itmHojaregistro);
        It_hojaCosto.setFont(principal.ArialB12);
        It_hojaCosto.addActionListener((e)->{
        
            System.out.println("Actividad iniciada");
            new RegistroCosto().Registroindividual();
            System.out.println(System.getProperty("user.home"));
            
        });
        
        It_NMDB.setText(itmNMDB);
        It_NMDB.setFont(principal.ArialB12);
        It_NMDB.addActionListener((e)->{
            new Nuevamdb().NuevaMDB();
        });
        
        prueba.setText("prueba");
        prueba.addActionListener((e) -> {
            
            Proveedores CP = new Proveedores();
            CP.Proveedores();
        });
        
        M_Archivo.add(It_hojaCosto);
        M_Archivo.add(It_NMDB);
        M_Archivo.add(It_Salir);
        M_Archivo.add(prueba);
        
        
        add(M_Archivo);
        
    }
    
}
