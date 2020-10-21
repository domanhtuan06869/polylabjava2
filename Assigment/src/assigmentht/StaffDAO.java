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

    void addSaff(Staff saff);

    void updateSaff(Staff paramStaff, String id);

    int deleteSaff(int position);

    int findSaff();

    boolean checkExits(String id);

    void openFile();

    void saveFile();
}
