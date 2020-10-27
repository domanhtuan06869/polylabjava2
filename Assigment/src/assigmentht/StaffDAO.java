/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentht;

/**
 *
 * @author tuand
 */
public interface StaffDAO {

    void addStaff(Staff saff);

    void updateStaff(Staff paramStaff, String id);

    int deleteStaff(int position);

    int findStaff();

    boolean checkExits(String id);

    void openFile();

    void saveFile();
}
