package IO;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.Objects;

public class IOio {

    public static long folderSize(File directory) {
        long length = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile())
                length += file.length();
            else
                length += folderSize(file);
        }
        return length;
    }

    public static void main(String[] args) throws IOException {
//        String fileIn = JOptionPane.showInputDialog(null,"Cigiri daxil edin");
//        JOptionPane.showMessageDialog(null, folderSize(new File(fileIn)));
//        String fileIn = "D:\\Загрузки\\Java\\Программирование на JAVA с нуля до гуру\\lessons\\Lesson_8_1.mp4";
//        File file = new File(fileIn);
//        long str = folderSize(new File(fileIn));
//--------------------------------------------------------------------------------
//        JFrame jf = new JFrame("Pəncərə");
//        jf.setBounds(100,200,720,480);
//
//        String out = "";
//        JPanel panel = new JPanel();
//        JTextArea ta = new JTextArea(out);
//
//        panel.add(ta);
//
//        String path = "D:/Jpractise/out/file.txt";
//        FileReader file = new FileReader(path);
//        int code = file.read();
//        while (code != -1){
//            System.out.print((char) code);
//            code = file.read();
//            out = Integer.toString(code);
//
//        }
//        file.close();
//        System.out.println(out);
//
//        jf.add(panel);
//        jf.setVisible(true);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//--------------------------------------------------------------------------------
        JFrame jf = new JFrame("Pəncərə");
        jf.setBounds(100,200,720,480);

        String out = "   ";
        JPanel panel = new JPanel();
        JTextArea ta = new JTextArea(out);
        panel.add(ta);
        JButton button = new JButton("Button");
        panel.add(button);

//        FileInputStream input = new FileInputStream(out);
//        FileOutputStream output = new FileOutputStream("D:/Jpractise/out/file.txt");
        File file = new File("D:/Jpractise/out/file.txt");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());


        jf.addMouseListener( new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getButton());

                BufferedWriter writer = new BufferedWriter(fw);
//                writer.write(out);
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

//        writer.close();

        jf.add(panel);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
