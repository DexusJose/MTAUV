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
import javax.swing.JOptionPane;
import manager.hojacosto.RegistroCosto;
import manager.nuevaMDB.Nuevamdb;
import manager.nuevaMDB.PanelNMDB;

/**
 *
 * @author auval
 */
public class barMenu extends JMenuBar{

    // ******* Declaración de items *******
    
    private JMenuItem It_Salir,prueba;
    private JMenuItem It_Seguridad;
    private JMenuItem It_hojaCosto,It_NMDB;
    
    private JMenu M_Archivo,M_Opciones;
    
    
    // ******* Variables de la barra de menu ******
    
    private String MnArchivo = "Archivo";
    private String MnOpciones= "Opciones";
    
    //******** Variables de los submenus ***********
    
    //-------- Submenu Archivo --------------
    private String itmSalir = "Salir";
    private String itmHojaregistro = "Registro costo $";
    private String itmNMDB = "Nuevo MDB";
    
    
    //--------- Submenu Opciones ---------
    private String itmCrearUsuario = "Proteger";
    
    
    public void barra(){
        
        setBackground(principal.BarraM2);
        
        M_Archivo = new JMenu();
        M_Opciones = new JMenu();
        
        It_Salir = new JMenuItem();
        It_hojaCosto = new JMenuItem();
        It_NMDB= new JMenuItem();
        prueba = new JMenuItem();
        
        It_Seguridad = new JMenuItem();
        
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
            
            //Proveedores CP = new Proveedores();
            //CP.Proveedores();
            //JOptionPane.showMessageDialog(this,PanelNMDB.doc.getAbsolutePath());
            
        });
        
        
        M_Archivo.add(It_hojaCosto);
        M_Archivo.add(It_NMDB);
        M_Archivo.add(It_Salir);
        M_Archivo.add(prueba);
        
        
        M_Opciones.setText(MnOpciones);
        M_Opciones.setFont(principal.ArialB14);
        
        It_Seguridad.setText(itmCrearUsuario);
        It_Seguridad.setFont(principal.ArialB12);
        
        
        M_Opciones.add(It_Seguridad);
        
        
        add(M_Archivo);
        add(M_Opciones);
        
    }
    
}
