package service.menu;

import bean.Config;
import inter.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter{

    @Override
    public void processLogic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("username");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("password");
        String password = sc2.nextLine();

        if (!(username.equals("user") && password.equals("111"))) {
            throw new IllegalArgumentException("user or password is invalid");
        }

        Config.setLoggedIn(true);
    }

}
