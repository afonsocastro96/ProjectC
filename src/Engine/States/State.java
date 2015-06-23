package Engine.States;

public abstract class State {
    public abstract void init();
    public abstract void update();
    public abstract void dispose();

    public State(){
        init();
    }
}
