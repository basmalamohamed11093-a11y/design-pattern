package Remotcommand;

public class Turnonlight implements Command {
    Light light;

    public Turnonlight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
    
}
