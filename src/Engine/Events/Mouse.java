package Engine.Events;

import java.awt.*;
import java.awt.event.InputEvent;

public class Mouse {

    public static int mouseLeftButton = InputEvent.BUTTON1_MASK;

    private static Robot r;
    private static Mouse instance = null;
    private static GraphicsDevice[] gs;

    private Mouse(){

        GraphicsEnvironment ge =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        gs = ge.getScreenDevices();

        try {
            r = new Robot(gs[0]);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static Mouse getInstance(){
        if(Mouse.instance == null)
            instance = new Mouse();
        return instance;
    }

    public static void mouseClick(){
        r.mousePress(mouseLeftButton);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.mouseRelease(mouseLeftButton);
    }

    public static void moveMouse(Point p) {

        // Search the devices for the one that draws the specified point.
        for (GraphicsDevice device: gs) {
            GraphicsConfiguration[] configurations =
                    device.getConfigurations();
            for (GraphicsConfiguration config: configurations) {
                Rectangle bounds = config.getBounds();
                if(bounds.contains(p)) {
                    // Set point to screen coordinates.
                    Point b = bounds.getLocation();
                    Point s = new Point(p.x - b.x, p.y - b.y);

                    try {
                        Robot r = new Robot(device);
                        r.mouseMove(s.x, s.y);
                    } catch (AWTException e) {
                        e.printStackTrace();
                    }

                    return;
                }
            }
        }
    }
}
