package util;

import bean.Config;
import service.menu.*;
import ser.inter.Process;

public enum  Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add student", new MenuAddStudentService()),
    ADD_TEACHER(4, "Add teacher", new MenuAddTeacherService()),
    SHOW_All_STUDENT(5, "Show all student", new MenuShowStudentService()),
    SHOW_All_TEACHER(6, "Show all teacher", new MenuShowTeacherService()),
    UNKNOWN;

    private int number;
    private String label;
    private Process service;

    Menu() {

    }

    Menu(int number, String label, Process service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public String getLabel(){
        return label;
    }

    @Override
    public String toString() {
        return number+". "+label;
    }

    public void process(){
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return number;
    }

    public static Menu find(int number){
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
           if(menus[i].getNumber() == number){
               return menus[i];
           }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu(){
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
           if(menus[i] != UNKNOWN){
               if (menus[i] == LOGIN || menus[i] == REGISTER){
                   if (!Config.isLoggedIn()){
                       System.out.println(menus[i]);
                   }
               }else if (Config.isLoggedIn()){
                   System.out.println(menus[i]);
               }

           }
        }
    }
}
