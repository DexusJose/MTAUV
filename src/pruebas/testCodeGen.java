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
package pruebas;

import MenuPrincipal.principal;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Ing Dexus José Pérez <joser_perezmiranda@gmail.com>
 */
public class testCodeGen extends JFrame {

    private JLabel l_texto;
    private JButton bt_setTes;
    
    public void generador(){
        
        initWind();
        
    }
    
    public void initWind(){
        
        
        
        l_texto = new JLabel();
        l_texto.setBorder(new BevelBorder(BevelBorder.RAISED, Color.darkGray, Color.darkGray));
        l_texto.setText("hello");
        l_texto.setFont(MenuPrincipal.principal.ArialB14);
        //l_texto.setPreferredSize(new Dimension(80,30));
        l_texto.setBounds(0,0,50,30);
        
        bt_setTes = new JButton();
        bt_setTes.setBorder(new BevelBorder(HEIGHT, Color.lightGray, Color.yellow));
        bt_setTes.setText("Gua");
        //bt_setTes.setPreferredSize(new Dimension(100,50));
        bt_setTes.setBounds(0,0,100,50);
        
        this.setTitle("Generador de codigo");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                
                new principal().cerrarPrograma();
            }
        });
        this.setPreferredSize(new Dimension(800,600));
        this.getContentPane().setBackground(MenuPrincipal.principal.Fond_blue);
        this.add(l_texto);
        this.setLayout(null);
        //this.add(bt_setTes);
        //this.add(l_texto);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
    }
    
    
    
}
