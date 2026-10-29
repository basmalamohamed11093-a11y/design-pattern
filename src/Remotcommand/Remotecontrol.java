package Remotcommand;

import java.util.LinkedList;

public class Remotecontrol {
    private Command[] onCommands;
    private Command[] offCommands;
    private LinkedList<Command> history;
    public Remotecontrol() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        Nocommand noCommand = new Nocommand();
        for (int i = 0; i < 3; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        history=new LinkedList<Command>();
    }
    public void addcommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        history.push(onCommands[slot]);
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        history.push(offCommands[slot]);
    }
    public void undoButtonWasPushed() {
        if (!history.isEmpty()) {
            Command command = history.removeLast();
            command.undo();
        }
    }
@Override 
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
