package compare;

public class Compare {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;
        System.out.println(b1 && !(b2 && b3));
        System.out.println(b2 || !(b1 || b3));
        System.out.println(b1 ^ (b2 ^ b3));
    }
}
