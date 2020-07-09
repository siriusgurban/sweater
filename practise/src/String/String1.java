package String;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

public class String1 {
    public static void main(String[] args){

//        String str = JOptionPane.showInputDialog(null,"Nese daxil edin");
//try{
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.substring(1,4)+"Hello");
//} catch (StringIndexOutOfBoundsException e){
//    System.out.println(e);
//}

//        String str = JOptionPane.showInputDialog(null,"Radiusu daxil edin");
//        int r = Integer.parseInt(str);
//        double S = (double) (Math.PI*r);
//        System.out.println(S);
//
//        double get = (9895*5.7)/100;
//        BigDecimal ge =  new BigDecimal(get).setScale(2, RoundingMode.HALF_UP);
//        System.out.println(ge);

//
//        HashMap<String, Integer> data = new HashMap<String, Integer>();
//        data.put("Siri",23);
//        data.put("Quru",24);
//        data.put("Allo",30);
//
//        System.out.println(data.get("Quru")*4);
////        data.put("Quru",(data.get("Quru")*4));
//
//        data.replace("Quru",data.get("Quru")*4);
//        System.out.println(data.get("Quru"));
//        data.forEach((t,u)->System.out.println(t+" = "+u));


//        ArrayList<String> log = new ArrayList<String>();
//        log.add("Derza");
//        log.add("Yapon");
//        log.add("Apolo");
//
//        for (int i = 0; i <log.size() ; i++) {
//            System.out.println(log.get(i));
//        }
//        log.set(1,log.get(2));
//        log.forEach((t)-> System.out.println(t));

        Date d = new Date();
        Calendar c = Calendar.getInstance();
        System.out.println(d);
        String date = "01-01-1970 00:00:00";

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
        ParsePosition pp = new ParsePosition(0);
        d = format.parse(date,pp);
        c.setTime(d);
        System.out.println(c);



    }
}
