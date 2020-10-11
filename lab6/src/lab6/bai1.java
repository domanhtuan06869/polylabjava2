/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author tuand
 */
public class bai1 {
    public static void main(String[] args) {
            MyThread theard = new MyThread();
            MyThread myThread =new MyThread();
            myThread.setPriority(Thread.MAX_PRIORITY);
            theard.setPriority(Thread.MIN_PRIORITY);      

            theard.start();
            myThread.start();

    }
}
