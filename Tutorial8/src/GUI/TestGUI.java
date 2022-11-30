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

        //Manin panel
        JPanel tp = new JPanel();
        tp.setLayout(new BorderLayout());
        JTextField topText = new JTextField("45.5");
        topText.setFont(new Font("SansSerif ", Font.PLAIN, 20));
        tp.add(topText, BorderLayout.NORTH);

        //Center panel
        JPanel centerP = new JPanel(new GridLayout(1,2));
        tp.add(centerP, BorderLayout.CENTER);

        //Button left panel
        JPanel btnL = new JPanel();
        btnL.setLayout(new GridLayout(4,3));

        for (int i = 1; i <= 9; i++) {
            btnL.add(new JButton("" + i));
        }
        btnL.add(new JButton("0"));
        btnL.add(new JButton("."));

        //Button Right panel
        JPanel btnR = new JPanel(new GridLayout(4,1));
        btnR.add(new JButton("+"));
        btnR.add(new JButton("-"));
        btnR.add(new JButton("Clear"));


        centerP.add(btnL);
        centerP.add(btnR);
        frame.add(tp);
    }
}
