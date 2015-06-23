package Events;

import java.awt.*;

public class Keyboard {
    private static Robot r;
    private static Keyboard instance = null;

    private Keyboard(){
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static Keyboard getInstance(){
        if(instance == null)
            instance = new Keyboard();
        return instance;
    }

    public static void keyPress(int key){
        r.keyPress(key);
        r.keyRelease(key);
    }
}
