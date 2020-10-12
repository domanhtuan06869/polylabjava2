/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuan.domanh
 */
public class EvenThread extends Thread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                Thread.sleep(15);
            } catch (InterruptedException ex) {
                Logger.getLogger(EvenThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
