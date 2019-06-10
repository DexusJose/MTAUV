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
package manager.nuevaMDB;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class Nuevamdb extends JFrame {
    private final String Titulo = "Nuevo Base de Datos";
    public final Dimension SizeNMDB = new Dimension(400,150);
    private PanelNMDB panelmdb;
    public static int vi=0;
    
    public void NuevaMDB(){
        configuracion();
    }

    private void configuracion() {
        panelmdb = new PanelNMDB();
        setTitle(Titulo);
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setPreferredSize(SizeNMDB);
        setResizable(false);
        getContentPane().add(panelmdb);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
            
        
    }
    
    public void cer(){
        dispose();
    }
}
