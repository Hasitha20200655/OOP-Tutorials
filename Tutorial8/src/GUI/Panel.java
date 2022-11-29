package GUI;

import java.awt.*;
import javax.swing.*;

public class Panel extends JFrame {

    public Panel(){

        JButton jb = new JButton("hello");

          JPanel leftBtns = new JPanel();
          leftBtns.setLayout(new GridLayout(4,3));
          leftBtns.add(jb);
//
//        for (int i = 1; i <= 9; i++){
//            leftBtns.add(new JButton("" + i));
//        }
//        leftBtns.add(new JButton("0"));
//        leftBtns.add(new JButton("."));
//
//
//        JPanel topPanel = new JPanel(new BorderLayout());
//        topPanel.add(new TextField("45.4"), BorderLayout.NORTH);
//        topPanel.add(leftBtns, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        Panel frame = new Panel();
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setVisible(true);

        frame.add(new JButton("dsg"));
    }
}
