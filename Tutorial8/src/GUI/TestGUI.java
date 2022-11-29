package GUI;

import javax.swing.*;
import java.awt.*;

public class TestGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setVisible(true);


        JPanel tp = new JPanel();
        tp.setLayout(new BorderLayout());
        JTextField topText = new JTextField("45.5");
        topText.setFont(new Font("SansSerif ", Font.PLAIN, 20));
        tp.add(topText, BorderLayout.NORTH);

        JPanel centerP = new JPanel(new GridLayout(1,2));

        JPanel btnP = new JPanel();
        btnP.setLayout(new GridLayout(4,3));

        for (int i = 1; i <= 9; i++) {
            btnP.add(new JButton("" + i));
        }
        btnP.add(new JButton("0"));
        btnP.add(new JButton("."));

        JPanel btnR = new JPanel(new GridLayout(4,1));
        btnR.add(new JButton("+"));
        btnR.add(new JButton("-"));
        btnR.add(new JButton("Clear"));


        centerP.add(btnP);
        centerP.add(btnR);
        tp.add(centerP, BorderLayout.CENTER);
        frame.add(tp);
    }
}
