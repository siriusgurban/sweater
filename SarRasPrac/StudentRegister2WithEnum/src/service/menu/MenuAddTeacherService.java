package service.menu;

import bean.Config;
import bean.Teacher;
import inter.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

    @Override
    public void processLogic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("name");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("surname");
        String surname = sc2.nextLine();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);

        Config.instance().appendTeacher(t);
        System.out.println("Teacher added");

//        Teacher[] teachers = Config.instance().getTeachers();
//        teachers[teachers.length] = t;
    }

}
