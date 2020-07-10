package switchcase;

import javax.swing.*;

public class Switch {
    public static void main(String[] args) {
        String in1 = JOptionPane.showInputDialog(null,"Enter number 1");
        String in2 = JOptionPane.showInputDialog(null,"Enter number 2");
        int x = Integer.parseInt(in1);
        int y = Integer.parseInt(in2);
        String op = JOptionPane.showInputDialog(null,"Enter operator");
        int out = 0;

        switch (op){
            case "+":
                out = x + y;
                break;
            case "-":
                out = x - y;
                break;
            case "/":
                out = x / y;
                break;
            case "*":
                out = x * y;
                break;
            default:
                System.out.println("You entered wrong operator");
        }
        JOptionPane.showMessageDialog(null,out);

    }
}
