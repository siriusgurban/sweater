package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComponent extends JTextArea {
    private int code;

    public MyComponent(String title){
       super(title);
       this.code = code;

    }

    public int getCode(){
        return code;
    }



//    @Override
//    public void actionPerformed(ActionEvent e) {
//        int code = ((MyComponent) e.getSource()).getCode();
//        if (code==EXIT){
//            System.exit(0);
//        }else if (code==PRINT){
//            System.out.println("...");
//        }
//    }

}
