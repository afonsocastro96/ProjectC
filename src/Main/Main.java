package Main;

public class Main {

    static StateManager sm;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        sm = new StateManager();

        while(true) { //quando decidir uma condicao de paragem, provavelmente clicar numa tecla, coloco aqui
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            sm.update();
        }
    }
}
