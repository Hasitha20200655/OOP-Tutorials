package APP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    JTextField jt;

    public ButtonPanel(JTextField jt){

        this.jt = jt;

        setLayout(new GridLayout(1,2));

        //Numbers buttons
        JPanel numBtns = new JPanel(new GridLayout(4,3));
        this.add(numBtns);

        for (int i = 1; i <= 9; i++) {
            numBtns.add(new JButton(new AbstractAction(""+ i) {

                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    String text = jt.getText();
                    text = text + ((JButton) e.getSource()).getText();
                    jt.setText(text);
                }
                
            }));
        }

        //zero buttton
        JButton btn0 = new JButton("0");
        numBtns.add(btn0);
        btn0.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String text = jt.getText();
                    text = text + ((JButton) e.getSource()).getText();
                    jt.setText(text);
                
            }
            
        });

        //Decimel point button
        JButton btnDecimel = new JButton(".");
        btnDecimel.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String text = jt.getText();
                    text = text + ((JButton) e.getSource()).getText();
                    jt.setText(text);
                
            }
            
        });
        numBtns.add(btnDecimel);




        //Other Buttons
        JPanel otherBtns = new JPanel(new GridLayout(4,1));
        this.add(otherBtns);

        JButton addition = new JButton("+");
        otherBtns.add(addition);
        JButton subtract = new JButton("-");
        otherBtns.add(subtract);
        JButton clear    = new JButton("Clear");
        otherBtns.add(clear);


    }
}
