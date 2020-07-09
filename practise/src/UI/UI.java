package UI;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.awt.event.ActionListener;

public class UI {
    public static void main(String[] args) {

//        JFrame jf = new JFrame("Pəncərə");
//        jf.setBounds(100,200,720,480);
//
//        JPanel panel = new JPanel();
//
//        JTextArea ta = new JTextArea("Burda sizin reklaminiz ola bilerdi");
//        panel.add(ta);
//
//        JButton button = new JButton("Duyme");
//        panel.add(button);
//
//        ButtonGroup bg = new ButtonGroup();
//
//        JRadioButton rd1 = new JRadioButton("RadioButton");
//        JRadioButton rd2 = new JRadioButton();
//        bg.add(rd1);
//        bg.add(rd2);
//        panel.add(rd1);
//        panel.add(rd2);
//
//        JCheckBox cb = new JCheckBox("CheckBox");
//        panel.add(cb);
//
//        jf.add(panel);
//        jf.setVisible(true);
////        jf.setResizable(false);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//-----------------------------------------------------------------


//        JFrame jf = new JFrame("Pəncərə");
//        jf.setBounds(100,200,720,480);
//        jf.setLayout(new BorderLayout());
//
//        JPanel form = new JPanel();
//
//        JLabel name = new JLabel("Ad: ");
//        form.setLayout(new GridBagLayout());
//        JTextArea tan = new JTextArea("Burda sizin reklaminiz ola bilerdi");
//        JLabel mail = new JLabel("E-mail: ");
//        JTextArea tam = new JTextArea("Burda sizin reklaminiz ola bilerdi");
//
//        name.setHorizontalAlignment(SwingConstants.RIGHT);
//        mail.setHorizontalAlignment(SwingConstants.RIGHT);
//
//        tan.setPreferredSize(new Dimension(200,30));
//        tam.setPreferredSize(new Dimension(200,30));
//
//
//        GridBagConstraints c = new GridBagConstraints();
//        c.fill = GridBagConstraints.BOTH;
//        c.gridx = 0;
//        c.gridy = 0;
//        form.add(name,c);
//        c.gridx = 1;
//        form.add(tan,c);
//        c.gridx = 0;
//        c.gridy = 1;
//        form.add(mail,c);
//        c.gridx = 1;
//        form.add(tam,c);
//
//
//        Panel bottom = new Panel();
//
//        JCheckBox cb1 = new JCheckBox("HTML");
//        bottom.add(cb1);
//        JCheckBox cb2 = new JCheckBox("JavaScript");
//        bottom.add(cb2);
//        JCheckBox cb3 = new JCheckBox("PHP");
//        bottom.add(cb3);
//
//        JButton button = new JButton("Button");
//        bottom.add(button);
//
//
//        jf.add(form, BorderLayout.CENTER);
//        jf.add(bottom, BorderLayout.SOUTH);
//        jf.setVisible(true);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//------------------------------------------------------------------------

//        JFrame jf = new JFrame("Pəncərə");
//        jf.setBounds(100,200,720,480);
//        jf.setLayout(new BorderLayout());
//
//
//        Panel bottom = new Panel();
//
//        JButton button1 = new JButton("Qirmizi");
//        bottom.add(button1);
//        JButton button2 = new JButton("Ag");
//        bottom.add(button2);
//        JButton button3 = new JButton("Yashil");
//        bottom.add(button3);
//
//
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                bottom.setBackground(Color.RED);
//            }
//        });
//
//        button2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                bottom.setBackground(Color.WHITE);
//            }
//        });
//
//        button3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                bottom.setBackground(Color.GREEN);
//            }
//        });
//
//
//        jf.add(bottom, BorderLayout.CENTER);
//        jf.setVisible(true);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// ---------------------------------------------------------------------


//        JFrame jf = new JFrame("Pəncərə");
//        MyListener listener = new MyListener(jf);
//        jf.setBounds(100,200,720,480);
//
//        JMenuBar mb = new JMenuBar();
//        JMenu view = new JMenu("Görünüş");
//        JMenu size = new JMenu("Pəncərənin ölçüsü");
//
//        view.add(size);
//        mb.add(view);
//        jf.setJMenuBar(mb);
//
//        JMenuItem s6 = new JMenuItem("640x480");
//        size.add(s6);
//        JMenuItem s8 = new JMenuItem("800x600");
//        size.add(s8);
//        JMenuItem s10 = new JMenuItem("1024x768");
//        size.add(s10);
//
//
//        s6.addActionListener(listener);
//        s8.addActionListener(listener);
//        s10.addActionListener(listener);
//
//
//        jf.setVisible(true);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//        -----------------------------------------------
//        JFrame jf = new JFrame("Pəncərə");
//        MyListener listener = new MyListener(jf);
//        jf.setBounds(100,200,720,480);
//
//        Panel panel = new Panel();
//
//
//        jf.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//
//
//                System.out.println(e.getButton());
//                if (e.getButton() != MouseEvent.BUTTON1) {
//                    return;
//                }
//                JButton button = new JButton("OK");
//                button.setBounds(e.getX(), e.getY(), 50, 50);
//                jf.add(button);
//
//
//                //Считаем количество кнопок на форме
////                long count = Arrays.stream(jf.getContentPane().getComponents())
////                        .filter((comp) -> comp instanceof JButton)
////                        .count();
////                if (count >= 10) {
////                    return;
////                }
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//
//            }
//        });
//        jf.setVisible(true);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        -----------------------------------------------------------
//        JFrame jf = new JFrame("Pəncərə");
//        MyListener listener = new MyListener(jf);
//        jf.setBounds(100,200,720,480);
//        jf.setLayout(new BorderLayout());
//
//        Panel panel = new Panel();
//        jf.add(panel);
//        JButton button = new JButton("KnopKa");
//        panel.add(button);
//
//
//        button.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//
//                     System.out.println(e.getKeyChar());
//
//                    if (e.getKeyCode() == 37){
//                        button.setBounds(button.getX()-1, button.getY(), 50, 50);
//                    }else  if (e.getKeyCode() == 38){
//                        button.setBounds(button.getX(), button.getY()-1, 50, 50);
//                    }else  if (e.getKeyCode() == 39){
//                        button.setBounds(button.getX()+1, button.getY(), 50, 50);
//                    }else  if (e.getKeyCode() == 40){
//                        button.setBounds(button.getX(), button.getY()+1, 50, 50);
//                    }
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                System.out.println(e.getKeyCode());
//            }
//        });
//
//
//
//
//        jf.setVisible(true);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        -------------------------------------------------------------------------
        JFrame jf = new JFrame("Pəncərə");
//        MyListener listener = new MyListener(jf);
        jf.setBounds(100,200,720,480);

        Panel panel = new Panel();
        jf.add(panel);

        JLabel name = new JLabel("Ad: ");
        panel.setLayout(new GridBagLayout());
//        JTextArea tan = new JTextArea("Burda sizin reklaminiz ola bilerdi");
        panel.add(name);

        jf.add(panel, BorderLayout.CENTER);


        MyComponent exit = new MyComponent("Burda sizin reklaminiz ola bilerdi");
        panel.add(exit);
        exit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getButton());

                if (e.getButton() == 1){
                    System.out.println(e.getButton());
                    panel.setVisible(false);
                }else{
//                    panel.add(exit);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });



        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
