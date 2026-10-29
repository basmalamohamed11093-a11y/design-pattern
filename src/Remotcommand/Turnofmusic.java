package Remotcommand;

public class Turnofmusic implements Command  {
    
    MusicPlayer musicPlayer;

    public Turnofmusic(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.off();
    }

    @Override
    public void undo() {
        musicPlayer.on();
    }
    
}
