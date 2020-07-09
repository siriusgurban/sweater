package classes;

public class MyMyth {

    private static int count = 0;

    public static int add(int a, int b){
        count++;
        return a+b;
    }
    public static int sub(int a, int b){
        count++;
        return a-b;
    }
    public static int mult(int a, int b){
        count++;
        return a*b;
    }
    public static double div(double a, double b){
        count++;
        return a/b;
    }

    public static int getCount(){
        return count;
    }
}
