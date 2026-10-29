package Remotcommand;

public class Turnoflight implements Command {
    private Light light;

    public Turnoflight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
