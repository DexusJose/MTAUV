/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import mtauv.*;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class principal {
    
    private final ImageIcon mainIcon = new ImageIcon(MTAUV.class.getResource("/res/icon.png"));
    
    
    // ****************** Mensajes ***************
    private static final String version = "V 0.1.4";
    
    private static final String dev = "-XIX0x03";
    
    private final String title = "MTAUV";
    
    // ****************** Fuentes ***************
    public static final Font ArialP9 = new Font("Arial",Font.PLAIN,9);
    public static final Font ArialB9 = new Font("Arial",Font.BOLD,9);
    public static final Font ArialP10 = new Font("Arial",Font.PLAIN,10);
    public static final Font ArialB10 = new Font("Arial",Font.BOLD,10);
    public static final Font ArialP12 = new Font("Arial",Font.PLAIN,12);
    public static final Font ArialB12 = new Font("Arial",Font.BOLD,12);
    public static final Font ArialP14 = new Font("Arial",Font.PLAIN,14);
    public static final Font ArialB14 = new Font("Arial",Font.BOLD,14);
    

    private JFrame principal;
    
    private panelFondo panelPrincipal;  
    private Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
    
    private void cerrarPrograma(){
        if(JOptionPane.showConfirmDialog(principal,"¿Desea salir de la aplicacion?","¿Salir?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    
    public void VentanaPrincipal(){
        
        
        //Mensaje de bienvenida
        MensajeInicial();              
        
        //inicio de la aplicacion principal
        ConfiguracionVentana();
        
    }
    
    public void ConfiguracionVentana(){
        
        panelPrincipal = new panelFondo();
        principal = new JFrame();
        principal.setTitle(title + "  -  " + version);
        principal.setIconImage(mainIcon.getImage());
        principal.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        principal.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                cerrarPrograma();
            }
        });
        principal.setPreferredSize(pantalla);
        principal.setExtendedState(Frame.MAXIMIZED_BOTH);
        principal.getContentPane().add(panelPrincipal);
        principal.pack();
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
        
        
        
    }

    private void MensajeInicial() {
        JLabel textoInicio = new JLabel();
        textoInicio.setIcon(mainIcon);
        textoInicio.setText(version+dev);
        textoInicio.setFont(ArialB14);
        textoInicio.setHorizontalAlignment(SwingConstants.CENTER);
        
        JOptionPane.showMessageDialog(null, textoInicio,"Bienvenido",JOptionPane.PLAIN_MESSAGE);
    }
    
        
}
