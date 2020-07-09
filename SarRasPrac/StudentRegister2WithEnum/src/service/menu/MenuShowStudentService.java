package service.menu;

import bean.Config;
import bean.Student;
import inter.MenuShowStudentServiceInter;
import util.FileUtility;

public class MenuShowStudentService implements MenuShowStudentServiceInter {

    @Override
    public void processLogic(){
        Student[] allStudent = Config.instance().getStudents();
        for (int i = 0; i < allStudent.length; i++) {
            System.out.println(allStudent[i]);
        }
    }


}
