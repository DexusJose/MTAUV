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
    private JLabel l_nombre;
    private JLabel l_descripcion;
    private JLabel l_marca;
    private JLabel l_codigoP;
    private JLabel l_precio;
    private JLabel l_folFact;
    private JLabel l_fech;
    
    public void generador(){
        
        initWind();
        
    }
    
    public void initWind(){
        
        l_nombre = new JLabel("Nombre");
        l_descripcion = new  JLabel("Descripción");
        l_marca =  new JLabel("Marca");
        l_codigoP = new JLabel("Codigo");
        l_precio = new JLabel("Precio");
        l_folFact = new JLabel("Folio factura");
        l_fech = new JLabel("Fecha");
        
        l_nombre.setFont(MenuPrincipal.principal.ArialB14);
        l_nombre.setBounds(165, 100, 60, 30);
        l_nombre.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        l_descripcion.setFont(MenuPrincipal.principal.ArialB14);
        l_descripcion.setBounds(375, 100, 90, 30);
        l_descripcion.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        l_marca.setFont(MenuPrincipal.principal.ArialB14);
        l_marca.setBounds(615, 100, 50, 30);
        l_marca.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        
        
        l_codigoP.setFont(MenuPrincipal.principal.ArialB14);
        l_codigoP.setBounds(100, 200, 60, 30);
        l_codigoP.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        l_precio.setFont(MenuPrincipal.principal.ArialB14);
        l_precio.setBounds(270, 200, 50, 30);
        l_precio.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        l_folFact.setFont(MenuPrincipal.principal.ArialB14);
        l_folFact.setBounds(420, 200, 90, 30);
        l_folFact.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        l_fech.setFont(MenuPrincipal.principal.ArialB14);
        l_fech.setBounds(650, 200, 50, 30);
        l_fech.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        
        
//        l_texto = new JLabel();
//        l_texto.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
//        l_texto.setText("hello");
//        l_texto.setFont(MenuPrincipal.principal.ArialB14);
//        //l_texto.setPreferredSize(new Dimension(80,30));
//        l_texto.setBounds(0,0,50,30);
//        
//        bt_setTes = new JButton();
//        //bt_setTes.setBorder(new BevelBorder(HEIGHT, Color.lightGray, Color.yellow));
//        bt_setTes.setText("Gua");
//        //bt_setTes.setPreferredSize(new Dimension(100,50));
//        bt_setTes.setBounds(200,200,100,50);
//        
        this.setTitle("Generador de codigo");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                
                new principal().cerrarPrograma();
            }
        });
        this.setPreferredSize(new Dimension(800,600));
        this.getContentPane().setBackground(MenuPrincipal.principal.Fond_blue);
        
        this.add(l_nombre);
        this.add(l_marca);
        this.add(l_descripcion);
        this.add(l_codigoP);
        this.add(l_fech);
        this.add(l_folFact);
        this.add(l_precio);
        
        this.setLayout(null);
        //this.add(bt_setTes);
        //this.add(l_texto);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
    }
    
    
    
}
