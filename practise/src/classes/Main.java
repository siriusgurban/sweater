package classes;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        User []us_arr = new User[2];

//         us_arr[0] = new User(15, "Siri", "051");
//         us_arr[1] = new User(25, "Quru", "921");

//        for (User temp: us_arr) {
//            System.out.println(temp.id+" "+ temp.login+" "+ temp.password);
//        }

        User usNew = new User(18, "Hmm", "Okay") {
            @Override
            public void printUser() {

            }
        };



        usNew.setId();
        usNew.setLogin();
        usNew.setPassword();

        System.out.println(usNew.getId());
        System.out.println(usNew.getLogin());
        System.out.println(usNew.getPassword());

        usNew.setId(28);
        usNew.setLogin("John");
        usNew.setPassword("0519asd");

        System.out.println("Id : "+usNew.getId()+"  Login : "+usNew.getLogin()+"  Password : "+usNew.getPassword());

        usNew.setLogin("BratPeredal");

        System.out.println(usNew.getLogin());


        System.out.println("1st: "+MyMyth.getCount());

        System.out.println("Add: "+MyMyth.add(2,3));
        System.out.println("Sub: "+MyMyth.sub(2,3));
        System.out.println("Mult: "+MyMyth.mult(2,3));
        System.out.println("Div: "+MyMyth.div(2,3));

        System.out.println("2nd: "+MyMyth.getCount());

        UserSocial us = new UserSocial(241, "asd", "asfdg", "Xmm", 170);
        WebMaster wm = new WebMaster(120, "Hee", "Odu ele", "Ok");

        us.printUser();
        wm.printUser();


        us.setHeight(185);
        wm.setLogin("Yoo");

        System.out.println(us.getLogin() + " " + us.getHeight());
        System.out.println(wm.getAdress());
        System.out.println(wm.getLogin());

        MyLine ml = new MyLine(5,7,10,3);

        System.out.println("Baslangic noqte"+"("+ml.point1.x+","+ml.point1.y+")"+";"+"Bitis noqtesi"+"("+ml.point.pointStart+","+ml.point.pointEnd+")");

        User user = new User(12,"as","df"){

            public void printUser() {
                System.out.println(getId() + " is ID");
            }
        };
            user.printUser();


            Shop<Integer> sh = new Shop<Integer>();
            int[] ab = {1, 2};
            sh.printObject();

            WebMaster wm1 = new WebMaster(10,"asd","fgh","gjg");
            System.out.println(wm1);
            WebMaster newWm = wm1;
            newWm.adress = "Natavan";
            wm1.clone();
            System.out.println(newWm);

            UserSocial us1 = new UserSocial(20, "hee", "yoo", "belke", 17);
            System.out.println(us1);
            UserSocial newUs = us1;
            newUs.height = 777;
            us1.clone();
            System.out.println(newUs);


            Integer [] arr = {5,10,7,21,54,77,11,22,85,99};
//            String [] arr = {"hee", "yo", "belke",};

            Arrays.sort(arr, (s1, s2) -> Integer.compare(s2, s1));
            for(int s : arr) System.out.println(s);


        factorial(100);

        System.out.println(sum(1539));

    }

    public static int factorial(int x){
            if(x==1) return 1;
            else System.out.println(101-x);
            return factorial(x-1);
    };

    public static int sum(int n){
        if (n == 0) return 0;
        return (n % 10 + sum(n / 10));
    }



}
