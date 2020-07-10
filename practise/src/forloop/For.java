package forloop;

import javax.swing.*;

public class For {
    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog(null,"Enter number", JOptionPane.QUESTION_MESSAGE);
        if (x == ""){
            JOptionPane.showMessageDialog(null,"Fill the gape");
        }

        int sum = 0;
        int in = Integer.parseInt(x);

        if ( in != 0 && in > 0) {

            for (int i = 1; i <=in ; i++) {
                sum +=i;
            }
            System.out.println(sum);
            JOptionPane.showMessageDialog(null,sum);

        }else{
            JOptionPane.showMessageDialog(null,"Enter positive number");
        }
    }
}
