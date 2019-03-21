/*
 * The MIT License
 *
 * Copyright 2019 Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>.
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
package CatalogoProveedores;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import mtauv.MTAUV;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class Proveedores{
    
    public final ImageIcon iconCP = new ImageIcon(MTAUV.class.getResource("/res/Proveedor/Proveedor.png"));
    private JFrame CProveddores;
    
    public void Proveedores(){
        Config();
    }
    
    public void Config(){
        
        CProveddores = new JFrame();
        
        CProveddores.setTitle("Proveedores");
        CProveddores.setIconImage(iconCP.getImage());
        CProveddores.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        CProveddores.setPreferredSize(new Dimension(800,600));
        CProveddores.pack();
        CProveddores.setLocationRelativeTo(null);
        
        CProveddores.setVisible(true);
        
       
    }
    
}
