package Remotcommand;

public class Turnontv implements Command {
    Tv tv;
    public Turnontv(Tv tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
    
}
