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
package pruebas;

import MenuPrincipal.panelFondo;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class timer {
    
    private int segundos = 20;
    private Timer timer;
    
    public timer(){
        
        timer = new Timer();
        
    }
    
    TimerTask task = new TimerTask() {
        private boolean isTimerRunning;
        @Override
        public void run() {
            isTimerRunning = true;
            if (segundos>0) {
                
                segundos--;
                
            }else{
                segundos=1;
                isTimerRunning=false;
                timer.cancel();
                timer.purge();
            }
            if (isTimerRunning) {
                System.err.println("Corriendo");
                
            }
        }
    };
    
    public void start (int timeout, int interval){
        timer.schedule(task, timeout,interval);
        
    }
}
