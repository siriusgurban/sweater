package util;

import java.util.Scanner;

public class MenuUtil {

    public static void showMenu(){
        System.out.println("Please select menu");

        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        int selectMenuNumber = sc.nextInt();

        Menu selectMenu = Menu.find(selectMenuNumber);
        selectMenu.process();
    }

    public static void processMenu(Menu menu){
        menu.process();
    }

//    public static void processAllLoginObjects(MenuRegisterServiceInter[] logins){
//        for (int i = 0; i < logins.length; i++) {
//            MenuRegisterServiceInter m = logins[i];
//            m.process();
//        }
//    }
}
