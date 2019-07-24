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
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Ing Dexus José Pérez <joser_perezmiranda@gmail.com>
 */
public class testCodeGen extends JFrame {

    // *¨**** Designacion de,los campos de las etiquetas******
    
    private JLabel l_texto;
    private JButton bt_setTes;
    private JLabel l_nombre;
    private JLabel l_descripcion;
    private JLabel l_marca;
    private JLabel l_codigoP;
    private JLabel l_precio;
    private JLabel l_folFact;
    private JLabel l_fech;
    
    // ***** Designacion de los campos de texto
    
    private JTextField tf_nombre;
    private JTextField tf_descripcion;
    private JTextField tf_marca;
    private JTextField tf_codigoP;
    private JTextField tf_precio;
    private JTextField tf_folFact;
    private JTextField tf_fech;
    
    //**** boton para generar el codigo ****
    private JButton bt_Generar;
    
    private JTextField tf_codigoGenerado;
    private JLabel l_textGen;
    
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
        
        tf_nombre = new JTextField();
        tf_descripcion = new JTextField();
        tf_marca = new JTextField();
        tf_codigoP = new JTextField();
        tf_precio = new JTextField();
        tf_folFact = new JTextField();
        tf_fech = new JTextField();
        
        bt_Generar = new JButton("Generar");
        
        tf_codigoGenerado = new JTextField();
        
        l_textGen = new JLabel();
        
        l_nombre.setFont(MenuPrincipal.principal.ArialB12);
        l_nombre.setHorizontalAlignment(CENTER);
        l_nombre.setBounds(114, 100, 114, 30);
        //l_nombre.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        tf_nombre.setBounds(57, 140, 228, 30);
        tf_nombre.setHorizontalAlignment(CENTER);
        tf_nombre.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.lightGray, Color.darkGray));
        
        l_descripcion.setFont(MenuPrincipal.principal.ArialB12);
        l_descripcion.setHorizontalAlignment(CENTER);
        l_descripcion.setBounds(342, 100, 114, 30);
        //l_descripcion.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        tf_descripcion.setBounds(285, 140, 228, 30);
        tf_descripcion.setHorizontalAlignment(CENTER);
        tf_descripcion.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.lightGray, Color.darkGray));
        
        l_marca.setFont(MenuPrincipal.principal.ArialB12);
        l_marca.setHorizontalAlignment(CENTER);
        l_marca.setBounds(570, 100, 114, 30);
        //l_marca.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        tf_marca.setBounds(513, 140, 228, 30);
        tf_marca.setHorizontalAlignment(CENTER);
        tf_marca.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.lightGray, Color.darkGray));
        
        
        
        l_codigoP.setFont(MenuPrincipal.principal.ArialB12);
        l_codigoP.setHorizontalAlignment(CENTER);
        l_codigoP.setBounds(88, 200, 88, 30);
        //l_codigoP.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        tf_codigoP.setBounds(44, 240, 176, 30);
        tf_codigoP.setHorizontalAlignment(CENTER);
        tf_codigoP.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.lightGray, Color.darkGray));
        
        l_precio.setFont(MenuPrincipal.principal.ArialB12);
        l_precio.setHorizontalAlignment(CENTER);
        l_precio.setBounds(264, 200, 88, 30);
        //l_precio.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        tf_precio.setBounds(220, 240, 176, 30);
        tf_precio.setHorizontalAlignment(CENTER);
        tf_precio.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.lightGray, Color.darkGray));
        
        l_folFact.setFont(MenuPrincipal.principal.ArialB12);
        l_folFact.setHorizontalAlignment(CENTER);
        l_folFact.setBounds(440, 200, 88, 30);
        //l_folFact.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        tf_folFact.setBounds(396, 240, 176, 30);
        tf_folFact.setHorizontalAlignment(CENTER);
        tf_folFact.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.lightGray, Color.darkGray));
        
        l_fech.setFont(MenuPrincipal.principal.ArialB12);
        l_fech.setHorizontalAlignment(CENTER);
        l_fech.setBounds(616, 200, 88, 30);
        //l_fech.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
        
        tf_fech.setBounds(572, 240, 176, 30);
        tf_fech.setHorizontalAlignment(CENTER);
        tf_fech.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.lightGray, Color.darkGray));
        
        bt_Generar.setFont(MenuPrincipal.principal.ArialB14);
        bt_Generar.setBounds(333,320,133,30);
        bt_Generar.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent evt){
                generarCodigo();
            }

            
        });
        
        l_textGen.setText("Codigo:");
        l_textGen.setFont(MenuPrincipal.principal.ArialB14);
        l_textGen.setHorizontalAlignment(CENTER);
        l_textGen.setBorder(new BevelBorder(BevelBorder.LOWERED,Color.lightGray,Color.darkGray));
        l_textGen.setBounds(88, 380, 88, 30);
        
        
        tf_codigoGenerado.setFont(MenuPrincipal.principal.ArialP14);
        tf_codigoGenerado.setBorder(new BevelBorder(BevelBorder.LOWERED,Color.lightGray,Color.darkGray));
        tf_codigoGenerado.setHorizontalAlignment(CENTER);
        tf_codigoGenerado.setBounds(176,380,440,30);
        

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
        
        this.add(tf_nombre);
        this.add(tf_marca);
        this.add(tf_descripcion);
        this.add(tf_folFact);
        this.add(tf_precio);
        this.add(tf_fech);
        this.add(tf_codigoP);
        
        this.add(bt_Generar);
        
        this.add(tf_codigoGenerado);
        
        this.add(l_textGen);
        
        this.setLayout(null);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
    }
    
    private void generarCodigo() {
    
        //tf_codigoGenerado.setText("Hola");
        char[] articulo = tf_nombre.getText().toCharArray();
        char[] marca = tf_marca.getText().toCharArray();
        char[] descripcion = tf_descripcion.getText().toCharArray();
        
        String codigo = tf_codigoP.getText();
        String costo = tf_precio.getText();
        String folio = tf_folFact.getText();
        String fecha = tf_fech.getText();
        
        String result;
        
        for(int x = 0; x <= (articulo.length -1) ;x++){
            System.out.println(articulo[x]);
        }
        
        result = null;
        
        tf_codigoGenerado.setText(result);
    
    }
    
}
