package Engine.States;

import Engine.Events.Mouse;
import Engine.Events.Pixel;
import GUI.MainFrame;

import java.awt.*;

public class Options extends State {

    int i = 0;

    @Override
    public void init() {
        MainFrame m = new MainFrame();
    }

    @Override
    public void update() {
        Mouse.getInstance().moveMouse(new Point(69 + i * 10, 69 + i * 10));
        //Mouse.getInstance().mouseClick();
        i++;
        Pixel.getInstance().getPixelColor(new Point(69 + i * 10, 69 + i * 10));
        if(i==80)
            dispose();
    }

    @Override
    public void dispose() {
        System.exit(0);
    }
}
