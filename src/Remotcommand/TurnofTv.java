package Remotcommand;

public class TurnofTv implements Command {
    private Tv tv;

    public TurnofTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }   
    
}
