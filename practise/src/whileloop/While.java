package whileloop;

import javax.swing.*;

public class While {
    public static void main(String[] args) {
        int sum=1;
        String x = JOptionPane.showInputDialog(null,"Enter number");
        if (x != null && !x.equals("")){
            int in = Integer.parseInt(x);
            if (in>0){
                int i=1;
                while(i<=in){
                    sum *= i;
                    i++;
                }

                JOptionPane.showMessageDialog(null,sum);

            }else{
                JOptionPane.showMessageDialog(null,"Enter positive number");
            }

        }else{
            JOptionPane.showMessageDialog(null,"Please, enter number");
        }
    }
}
