package Remotcommand;

public class Turnonmusic implements Command {
    MusicPlayer musicPlayer;

    public Turnonmusic(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.on();
    }

    @Override
    public void undo() {
        musicPlayer.off();
    }   
    
}
