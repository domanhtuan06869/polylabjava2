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
public class bai3TestThread {
    public static void main(String[] args) {
        try {
            OddThread oddThread = new OddThread();
            oddThread.start();
            oddThread.join();
            EvenThread evenThread = new EvenThread();
            evenThread.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(bai3TestThread.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
