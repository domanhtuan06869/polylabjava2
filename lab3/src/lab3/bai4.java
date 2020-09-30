/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author tuan.domanh
 */
public class bai4 {

    public static void main(String[] args) {
        HashMap<String, Student> has = new HashMap< String, Student>();
        Student student = new Student("Tuấn", 7, "Toán");
        has.put(student.getName(), student);

        Set<String> keys = has.keySet();
        for (String name : keys) {
            Student student1 = has.get(name);
            System.out.println(">Họ và tên: " + student1.getName());
            System.out.println(">Học lực: " + student1.getGrade());
        }
    }
}
