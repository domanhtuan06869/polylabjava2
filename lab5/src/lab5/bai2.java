/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuand
 */
public class bai2 {

    public static void main(String[] args) {
        try {
            List<Student> list = new ArrayList<>();
            list.add(new Student("Tuấn", 5, "CNTT"));
            list.add(new Student("Cường", 7.5, "TKTW"));
            list.add(new Student("Hạnh", 8.5, "CNTT"));
            XFile xFile = new XFile();
            xFile.wirteObjects("filetest/students.dat", list);
            List<Student> list2
                    = (List<Student>) xFile.readObjects("filetest/students.dat");
            list2.forEach((student) -> {
                System.out.println(">Họ và tên: " + student.getName());
            });
        } catch (IOException ex) {
        }
    }

}
