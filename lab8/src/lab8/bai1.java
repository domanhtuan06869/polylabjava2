/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.ArrayList;

/**
 *
 * @author tuan.domanh
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        mylist.add(10);
        mylist.add("Hello");
        mylist.add(true);
        mylist.add(15.75);
        
        mylist.forEach((t) -> {
            System.out.println(t);
        });
    }

}
