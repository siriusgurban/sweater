package main;

import beans.Student;
import util.StudentUtil;
import util.inputUtil;

public class Main {
    public static void main(String[] args) {
        int menu = 0;

        while (true){
            menu = inputUtil.requiredNumber(
                    "What do you want to do?"
                            + "\n1. Register Student"
                            + "\n2. Show all students"
                            + "\n3. Find student"
                            + "\n4. Update Student");

            if(menu == 1){
                StudentUtil.studentRegister();
            }else if (menu == 2){
                StudentUtil.printAllRegisteredStudents();
            }else if (menu == 3){
                StudentUtil.findAndPrintStudents();
            }else if (menu == 4){
                int num = inputUtil.requiredNumber("asd");

                Student s = StudentUtil.fillStudent();
                Config.students[num-1] = s;

            }
        }




    }
}
