package Remotcommand;

public class Main {
    public static void main(String[] args) {
      Remotecontrol remoteControl = new Remotecontrol();
        Light light = new Light();
        Tv tv = new Tv();
        MusicPlayer musicPlayer = new MusicPlayer();

        Command lightOnCommand = new Turnonlight(light);
        Command lightOffCommand = new Turnoflight(light);

        Command tvOnCommand = new Turnontv(tv);
        Command tvOffCommand = new TurnofTv(tv);

        Command musicPlayerOnCommand = new Turnonmusic(musicPlayer);
        Command musicPlayerOffCommand = new Turnofmusic(musicPlayer);

        Remotecontrol RemoteControl = new Remotecontrol();

        remoteControl.addcommand(0, lightOnCommand, lightOffCommand);
        remoteControl.addcommand(1, tvOnCommand, tvOffCommand);
        remoteControl.addcommand(2, musicPlayerOnCommand, musicPlayerOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
       remoteControl.undoButtonWasPushed();
          remoteControl.undoButtonWasPushed();
             remoteControl.undoButtonWasPushed();
                remoteControl.undoButtonWasPushed();
                   remoteControl.undoButtonWasPushed();
    
    
    }
    
}
