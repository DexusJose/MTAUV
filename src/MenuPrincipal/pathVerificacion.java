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
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import javax.swing.JOptionPane;
import mtauv.MTAUV;

/**
 *
 * @author Ing Dexus José Pérez <joser_perezmiranda@gmail.com>
 */
public class pathVerificacion {
    
        //**************** Verificacion de documentos **********
    private static final String EXT_FILE = ".accdb";
    public static String pathUser = System.getProperty("user.home");
    
    public static String pathDoc = MTAUV.path();
    public static String ADMTAUV = "/Administracion MTAUV";
    public static String Dat = "/BaseDatos";
    public static String config = "/Configuraciones";
    public static File PathPrincipal = new File(pathUser+pathDoc+ADMTAUV);
    public static File PathDatos = new File(pathUser+pathDoc+ADMTAUV+Dat);
    public static File PathConf = new File(pathUser+pathDoc+ADMTAUV+config);
    
    //************ Propiedades *********** 
    public  final Properties defaultProperties = new Properties();
    public  final String archivoString = "/default.properties";
    public final File Propertie = new File(pathUser+pathDoc+ADMTAUV+config+archivoString);
    public  OutputStream defaultFile = null;
    
    //************ Propiedades en el archivo propertie ******************
    public final String[] DATOS_PROPERTIE = {"user","pass"};
    public final String[] DATOS_VALOR = {"empty","empty"};
    
    public String propiedad = "";
    public String valor = "";
    
    public  void verificacion() {
        System.out.println(Propertie);
        initVerificacion();
        JOptionPane.showMessageDialog(null,"Archivos verificados");
        
    }

    private  void initVerificacion() {
        
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
    
    public  void pathsInternos() {
        
        
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
        if (PathConf.exists()) {
            
            System.out.println("Existe:"+PathConf);
            archivoPropertie();
            
        }else{
            try {
                PathConf.mkdir();
                System.out.println("config creado");
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            archivoPropertie();
            
        }
        
    }
    
    private void archivoPropertie(){
        
        if(Propertie.exists()){
            
//            try{
//                defaultProperties.load(new FileReader(Propertie.toString()));
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//            
//            
//            
//            
//            int i=0;
//            do{
//                
//                propiedad = DATOS_PROPERTIE[i];
//                valor = DATOS_VALOR[i];
//                
//                if(!defaultProperties.getProperty(DATOS_PROPERTIE[i]).equals(DATOS_PROPERTIE[i])){
//                    System.out.println("No hay error en: "+defaultProperties.getProperty(propiedad));
//                }
//                
//                System.out.println(defaultProperties.getProperty(propiedad, "default value"));
//                i++;
//                
//                
//            }while(i<=DATOS_PROPERTIE.length-1);
//             try {
//                defaultFile = new FileOutputStream(pathUser+pathDoc+ADMTAUV+config+archivoString);
//                defaultProperties.store(defaultFile, null);
//                defaultFile.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            
//            
//            System.out.println(DATOS_PROPERTIE.length);

            
        } else {
            try {
        
                defaultFile = new FileOutputStream(pathUser+pathDoc+ADMTAUV+config+archivoString);
                
                int i=0;
                do{
                
                    propiedad = DATOS_PROPERTIE[i];
                    valor = DATOS_VALOR[i];
                    defaultProperties.setProperty(propiedad, valor);
                    System.out.println("creado:" +propiedad+"= "+valor);
                    
                    i++;
                
                
                }while(i<=DATOS_PROPERTIE.length-1);
                
                
                defaultProperties.store(defaultFile, null);
                defaultFile.close();
                System.out.println("Creado:"+Propertie);
                
            } catch (IOException e) {
                
                e.printStackTrace();
                
            }
                
        }
        
    }
    
}
