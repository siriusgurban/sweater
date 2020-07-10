package thread;

public class Thread {
    public static void main(String[] args) throws InterruptedException{
        long d = System.currentTimeMillis();

//        Threading t1 = new Threading ( () -> {
//            long a = 0;
//            for (int i = 0; i <= 100000000; i++) a += i;
//            System.out.println(a);
//
//        }
//                t1.start();
//        );




        long b = 0;
        for (int i=0; i<=100000000; i++) b+=i;

        long c = 0;
        for (int i=0; i<=100000000; i++) c+=i;



//        t2.start();

        System.out.println(b);
        System.out.println(c);


        System.out.println((System.currentTimeMillis()-d));
    }
}
