package util;

import java.util.Scanner;

public class inputUtil {

    public static String requiredText(String title){
        Scanner sc = new Scanner(System.in);
        System.out.println(title+" daxil edin: ");
        String answer = sc.nextLine();
        return answer;
    }

    public static int requiredNumber(String title){
        Scanner sc = new Scanner(System.in);
        System.err.println(title+" daxil edin: ");
        int answer = sc.nextInt();
        return answer;
    }
}
