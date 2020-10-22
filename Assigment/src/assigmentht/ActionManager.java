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
public class ActionManager implements StaffDAO {

    private ArrayList<Staff> listSaff = new ArrayList<>();
    private boolean checkNewSaff = true;

    public ArrayList<Staff> getListStaff() {
        return listSaff;
    }

    public boolean isCheckNewSaff() {
        return checkNewSaff;
    }

    public void setCheckNewSaff(boolean checkNewSaff) {
        this.checkNewSaff = checkNewSaff;
    }

    @Override
    public void addSaff(Staff saff) {
        listSaff.add(saff);
    }

    @Override
    public void updateSaff(Staff paramStaff, String id) {
        for (Staff saff : this.getListStaff()) {
            if (saff.getId().equalsIgnoreCase(id)) {
                saff.setId(paramStaff.getId());
                saff.setName(paramStaff.getName());
                saff.setAge(paramStaff.getAge());
                saff.setEmail(paramStaff.getEmail());
                saff.setSalary(paramStaff.getSalary());
                break;
            }
        }
    }

    @Override
    public int deleteSaff(int position) {
        try {
            if (this.getListStaff().isEmpty()) {
                JOptionPane.showMessageDialog(null, "không có gì để xóa");
                return 0;
            }

            int confrim = JOptionPane.showConfirmDialog(null, "bạn có muốn xóa không", "Alert", JOptionPane.YES_NO_OPTION);
            if (confrim == 0) {
                listSaff.remove(position);
                position = position - 1;
                JOptionPane.showMessageDialog(null, "xóa thành công");
            }
        } catch (Exception e) {
            System.out.println("assigmentht.ActionManager.deleteSaff()");
        }
        return position;
    }

    @Override
    public int findSaff() {
        String inputId = JOptionPane.showInputDialog("mời bạn nhập mã");
        int position = 0;
        try {
            boolean result = false;
            for (Staff saff : listSaff) {
                if (saff.getId().equalsIgnoreCase(inputId)) {
                    position = listSaff.indexOf(saff);
                    result = true;
                    break;
                }
            }
            if (!result) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy nhân viên có mã " + inputId);
            } else {
                JOptionPane.showMessageDialog(null, "Có nhân viên  " + inputId);
            }

        } catch (Exception e) {
            System.out.println("assigmentht.ActionManager.findSaff()");
        }
        return position;
    }

    @Override
    public boolean checkExits(String id) {
        for (Staff saff : this.getListStaff()) {
            if (saff.getId().equalsIgnoreCase(id)) {
                JOptionPane.showMessageDialog(null, "Đã tồn tại nhân viên có mã:" + id);
                return true;
            }
        }
        return false;
    }

    @Override
    public void openFile() {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            listSaff = (ArrayList<Staff>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("assigmentht.ActionManager.openFile()");
        }
    }

    @Override
    public void saveFile() {
        try {
            FileOutputStream fos = new FileOutputStream("a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.getListStaff());
            oos.flush();
            fos.flush();
            oos.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "Đã lưu data");
        } catch (Exception e) {
            System.out.println("assigmentht.ActionManager.saveFile()");
        }
    }

    public boolean checkValidate(String id, String name, String age, String email, String salary) {
        if (id.isEmpty() || name.isEmpty() || age.isEmpty() || email.isEmpty() || salary.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống trường");
            return false;
        }
        if (!age.matches("-?\\d+") || !salary.matches("-?\\d+")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhâp lương hoặc tuổi là số");
            return false;
        }
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if (!email.matches(regex)) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhâp đúng kiểu email");
            return false;
        }
        if (Integer.parseInt(age) < 16 || Integer.parseInt(age) > 55) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tuổi từ 16 đến 55");
            return false;
        }

        if (Integer.parseInt(salary) < 5000000) {
            JOptionPane.showMessageDialog(null, "Vui lòng lương từ 5 triệu trở lên");
            return false;
        }
        return true;
    }

}
