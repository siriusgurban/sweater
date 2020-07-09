package service.menu;

import bean.Config;
import bean.Student;
import inter.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter{

    @Override
    public void processLogic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("name");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("surname");
        String surname = sc2.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);

        Config.instance().appendStudent(s);
        System.out.println("Student added");

//        Student[] students = Config.instance().getStudents();
//        students[students.length] = s;
    }

}
