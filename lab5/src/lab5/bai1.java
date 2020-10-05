/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.IOException;

/**
 *
 * @author tuand
 */
public class bai1 {

    public static void main(String[] args) throws IOException {
        XFile xFile = new XFile();
        byte[] data = xFile.read("filetest/download.jpg");
        xFile.wirte("filetest/b.jpg", data);
    }
}
