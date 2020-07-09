package util;

import beans.Student;
import main.Config;

import java.util.Scanner;

public class StudentUtil {
    public static Student fillStudent(){
        String name = inputUtil.requiredText("Adi");
        String surname = inputUtil.requiredText("Soyadi");
        int age = inputUtil.requiredNumber("Yashi");
        String className = inputUtil.requiredText("Sinfi");


        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void printAllRegisteredStudents(){
        if (Config.students==null) return;

        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println(st.getName()+" "+st.getSurname()+" "+st.getAge()+" "+st.getClassName());
        }
    }

    public static void studentRegister(){
        int count = inputUtil.requiredNumber("Nece telebe qeydiyyatdan kecirececksiniz?");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i+1)+".Registration");

            Config.students[i] = StudentUtil.fillStudent();
        }
        System.out.println("Muveffeqqiyyetle telebeleri qeydiyyatdan kecirdiniz");
        StudentUtil.printAllRegisteredStudents();

    }

    public static void findAndPrintStudents(){
        String text = inputUtil.requiredText("Ad, soyad ya da sinfi");
        Student[] tapilanlar = findStudents(text);
        for (int i = 0; i < tapilanlar.length ; i++) {
            System.out.println(tapilanlar[i].getFullInfo());
        }
    }

    public static Student[] findStudents(String text){
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)){
               count++;
            }
        }

        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)){
                result[found] = st;
                found++;
            }
        }return result;
    }

}
