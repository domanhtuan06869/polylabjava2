/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentht;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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

    public void initData(QLNV qlnv) {

        list.add(qlnv);

    }

    public int deleteSaff(int position) {
        try {
            if (this.getListNv().isEmpty()) {
                JOptionPane.showMessageDialog(null, "không có gì để xóa");
                return 0;
            }

            int confrim = JOptionPane.showConfirmDialog(null, "bạn có muốn xóa không");
            if (confrim == 0) {
                list.remove(position);
                position = position - 1;
            }
        } catch (Exception e) {
            System.out.println("assigmentht.GiaodienQL.btndeleteActionPerformed()");
        }
        return position;
    }

    public int findSaff(String id) {
        int position = 0;
        try {

            boolean kq = false;
            for (QLNV nv : list) {
                if (nv.getManv().equalsIgnoreCase(id)) {
                    position = list.indexOf(nv);
                    kq = true;
                    break;
                }
            }
            if (!kq) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy nhân viên có mã " + id);
            } else {
                JOptionPane.showMessageDialog(null, "Có nhân viên  " + id);
            }

        } catch (Exception e) {
            System.out.println("assigmentht.ActionManager.findSaff()" + e);
        }
        return position;
    }

    public void openFile() {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList<QLNV>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("assigmentht.GiaodienQL.btnopenActionPerformed()" + e);
        }
    }

    public void saveFile() {
        try {
            FileOutputStream fos = new FileOutputStream("a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this.getListNv());
            oos.flush();
            fos.flush();
            oos.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "Đã lưu data");
        } catch (Exception e) {
            System.out.println("assigmentht.ActionManager.saveFile()");
        }
    }
}
