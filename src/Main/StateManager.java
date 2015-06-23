package Main;

import States.*;

public class StateManager {
    private State state;

    private static final int IDLE = 0;
    private static final int NEWGAME = 1;
    private static final int PLAY = 2;
    private static final int EXITGAME = 3;
    private static final int MOUSECALIBRATION = 4;



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
            case MOUSECALIBRATION:
                state = new MouseCalibration();
                break;
        }
    }

    public void update(){
        state.update();
    }
}
