package bite;

public class Bite {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        String a_b = Integer.toBinaryString(a);
        String b_b = Integer.toBinaryString(b);

        System.out.println(a_b);
        System.out.println(b_b);

        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a ^ b));
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(~b));




    }
}
