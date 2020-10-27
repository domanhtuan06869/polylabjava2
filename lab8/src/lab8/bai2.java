/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tuan.domanh
 */
public class bai2 {

    public static void main(String[] args) {
        ArrayList < Integer > myarrr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Nhập số thứ " + (i + 1) + ":");
            int number = in.nextInt();
            myarrr.add(number);
        };
        
        myarrr.forEach((t) -> {
            System.out.println(t);
        });
    }
}
