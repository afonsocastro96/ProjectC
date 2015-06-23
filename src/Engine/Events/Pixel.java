package Engine.Events;

import java.awt.*;

/**
 * Created by afonso on 23-06-2015.
 */
public class Pixel {
    private static Robot r;
    private static Pixel instance = null;

    private Pixel(){
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static Pixel getInstance(){
        if(instance == null)
            instance = new Pixel();
        return instance;
    }

    public static void getPixelColor(Point p) {
        Color color = r.getPixelColor(p.x,p.y);

        //
        // Print the RGB information of the pixel color
        //
        System.out.println("Red   = " + color.getRed());
        System.out.println("Green = " + color.getGreen());
        System.out.println("Blue  = " + color.getBlue());
        System.out.println();



    }
}
