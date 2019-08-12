/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtauv;

import MenuPrincipal.login.verificacion;
import MenuPrincipal.pathVerificacion;
import MenuPrincipal.principal;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class MTAUV {

    public static String path;
    public static String os = System.getProperty("os.name");
    
    public static void main(String[] args){
        
        
        
        
        principal win = new principal();
        win.VentanaPrincipal();
    
    }
    
    public static String path(){
        if(System.getProperty("os.name").equals("Linux"))
            return "/Documentos";
        else
            return "/Documents";
    }
    
    
}
