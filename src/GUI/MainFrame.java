package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by afonso on 23-06-2015.
 */
public class MainFrame extends JFrame{
    private JButton clickMeButton;
    private JPanel panel1;

    public MainFrame(){
        super("Hi :3");
        setContentPane(panel1);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showConfirmDialog(MainFrame.this,"You pressed the button");
            }
        });
    }
}
