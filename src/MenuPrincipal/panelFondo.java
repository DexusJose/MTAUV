/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import mtauv.MTAUV;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class panelFondo extends JPanel{
    
    public final ImageIcon FondoImage = new ImageIcon(MTAUV.class.getResource("/res/IMG_3BUS.png"));
    
//    public panelFondo(){
//        
//        
//    }
    
    public void paint(Graphics g){
        int width = getSize().width;
        int height = getSize().height;
        
        g.drawImage(FondoImage.getImage(),0,0,width,height,null);
        
        setOpaque(false);
        super.paint(g);
    }
}
