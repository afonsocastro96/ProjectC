package Engine.Main;

import Engine.States.*;

public class StateManager {
    private State state;
    private int currentState;

    public static final int IDLE = 0;
    public static final int NEWGAME = 1;
    public static final int PLAY = 2;
    public static final int EXITGAME = 3;
    public static final int OPTIONS = 4;

    public StateManager(){
        setState(OPTIONS);
    }

    public int getState(){
        return currentState;
    }
    public void setState(int newState){
        switch (newState) {
            case IDLE:
                state = new Idle();
                break;
            case NEWGAME:
                state = new NewGame();
                break;
            case PLAY:
                state = new Play();
                break;
            case EXITGAME:
                state = new ExitGame();
                break;
            case OPTIONS:
                state = new Options();
                break;
        }
        currentState = newState;
    }

    public void update(){
        state.update();
    }
}
