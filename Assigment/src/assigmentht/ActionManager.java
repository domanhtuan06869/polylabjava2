/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentht;

import java.util.ArrayList;

/**
 *
 * @author tuan.domanh
 */
public class ActionManager {

    public ArrayList<QLNV> list = new ArrayList<>();

    public ArrayList<QLNV> getListNv() {
        return list;
    }

    public void setListNv(String id, String name, int age, String email, double salary) {
        list.add(new QLNV(id, name, age, email, salary));
    }

    public void initData() {

        list.add(new QLNV("Ph05730", "Nguyễn Văn Lộc", 19, "loc@gmail.com", 500000));

    }

}
