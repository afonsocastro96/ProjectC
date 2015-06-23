package Engine.Main;

public class Main {

    static StateManager sm;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        sm = new StateManager();

        while(sm.getState() != StateManager.OPTIONS) {
            try {
                Thread.sleep(1000/60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            sm.update();
        }

    }
}
