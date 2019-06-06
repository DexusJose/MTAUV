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
import pruebas.timer;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class panelFondo extends JPanel{
    
    int cont = 1;
    
    public final ImageIcon FondoImage = new ImageIcon(MTAUV.class.getResource("/res/fondos/Bus_img_001.png"));
    public final ImageIcon FondoImage2= new ImageIcon(MTAUV.class.getResource("/res/fondos/Bus_img_002.png"));
    private int segundos;
    private int frame;
    
    
//    public panelFondo(){
//        
//        
//    }
    
    public void run(){
		while( true ){
			try{
				//Actualiza el pintado del JPanel
				repaint();
				//Se espera 1 segundo
				Thread.sleep(1000);
				if( segundos > 0 ){
					segundos--;
				}
				else{
					//Ya habiendo transcurrido los 5 segundos cambia  de imagen
					segundos = 5;
					//Si va en la imagen 4 regresa a la 1 
					if( frame < 4 ){
						frame++;
					}
					else{ 
						frame = 0; 
					}
				}
				//Actualiza el pintado del JPanel
				repaint();
			}catch( Exception e ){ e.printStackTrace(); }
		}
	}
    
    public void paint(Graphics g){
        int width = getSize().width;
        int height = getSize().height;
     
        
        
        
        switch(cont){
            case 0:
                
                
                g.drawImage(FondoImage.getImage(),0,0,width,height,this);
                cont++;
                System.out.println("imagen1"+cont);
                break;
                
            case 1:
                
                g.drawImage(FondoImage2.getImage(),0,0,width,height,this);
                cont--;
                System.out.println("Imagen2"+cont);
                break;
        }
        //g.drawImage(FondoImage.getImage(),0,0,width,height,null);
        
        
        setOpaque(false);
        super.paint(g); 
//        timer tiempo = new timer();
//        tiempo.start(0, 10000);  
    }
}
