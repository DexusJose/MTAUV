/*
 * The MIT License
 *
 * Copyright 2019 Ing Dexus José Pérez <joser_perezmiranda@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package MenuPrincipal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Ing Dexus José Pérez <joser_perezmiranda@gmail.com>
 */
public class pathVerificacion {
    
        //**************** Verificacion de documentos **********
    private static final String EXT_FILE = ".accdb";
    public static String pathUser = System.getProperty("user.home");
    public static String pathDoc = "/documents";
    public static String ADMTAUV = "/Administracion MTAUV";
    public static String Dat = "/BaseDatos";
    public static String config = "/Configuraciones";
    public static File PathPrincipal = new File(pathUser+pathDoc+ADMTAUV);
    public static File PathDatos = new File(pathUser+pathDoc+ADMTAUV+Dat);
    public static File PathConf = new File(pathUser+pathDoc+ADMTAUV+config);
    
    //************ Propiedades *********** 
    private final Properties defaultProperties = new Properties();
    private final String archivoString = "/default.properties";
    private final File Propertie = new File(pathUser+pathDoc+ADMTAUV+config+archivoString);
    public  OutputStream defaultFile = null;
    
    public  void verificacion() throws FileNotFoundException{
        
        initVerificacion();
        
    }

    private  void initVerificacion() throws FileNotFoundException {
        
        if(PathPrincipal.exists()){
            
            System.out.println("Existe:"+PathPrincipal);
            pathsInternos();
        }else{
            JOptionPane.showMessageDialog(null, PathPrincipal.exists(), "sin carpeta", JOptionPane.ERROR_MESSAGE);
            
            try {
                
                PathPrincipal.mkdir();
                System.out.println("Principal Creado");
                
            } catch (Exception e) {
                
                e.printStackTrace();
                
            }
            
            pathsInternos();
                       
        }
        
    }
    
    public  void pathsInternos() throws FileNotFoundException{
        
        
        if(PathDatos.exists())
            System.out.println("Existe:"+PathDatos);
        else{
            try {
                PathDatos.mkdir();
                System.out.println("datos creado");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (PathConf.exists()) 
            System.out.println("Existe:"+PathConf);
        else{
            try {
                PathConf.mkdir();
                System.out.println("config creado");
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
            
            if(Propertie.exists()){
                //System.out.println("Existe:"+defaultFile.toString());
            } else {
                try {
                    
                    defaultFile = new FileOutputStream(pathUser+pathDoc+ADMTAUV+config+archivoString);
                    //defaultProperties.setProperty("user", "admin");
                    //defaultProperties.setProperty("pass", "1234");
                    defaultProperties.store(defaultFile, null);
                    defaultFile.close();
                    System.out.println("creado");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
            }
            
        }
        
    }
    
}
