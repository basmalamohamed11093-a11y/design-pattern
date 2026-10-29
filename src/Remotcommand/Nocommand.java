package Remotcommand;

public class Nocommand implements Command {

    @Override
    public void execute() {
        System.out.println("No command");
    }

    @Override
    public void undo() {
        System.out.println("No command");
    }

}
