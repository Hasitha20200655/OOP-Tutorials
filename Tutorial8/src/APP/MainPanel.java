package APP;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    
    public MainPanel (){

        setLayout(new BorderLayout());


        JTextField topText = new JTextField();
        topText.setFont(new Font("SanSerif", Font.BOLD, 20));
        add(topText, BorderLayout.NORTH);



        ButtonPanel btnPanel = new ButtonPanel(topText);
        add(btnPanel, BorderLayout.CENTER);

    } 
}
