package GUI;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by afonso on 23-06-2015.
 */
public class MainFrame extends JFrame{
    private JPanel panel1;
    private JButton calibrateButton;
    private JSlider slider1;
    private JRadioButton keyboardRadioButton;
    private JRadioButton mouseRadioButton;
    private JRadioButton a0RadioButton;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JSlider slider2;
    private JSlider slider3;
    private JSlider slider4;
    private JButton applyButton;

    public MainFrame() {
        super("Project C");

        /* Logo do programa */
        URL url = ClassLoader.getSystemResource("Resources/logo.png");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(url);
        setIconImage(img);

        /* Swing initialization stuff */
        setContentPane(panel1);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
