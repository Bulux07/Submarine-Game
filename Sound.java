import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.*;

public class Sound {
    Clip clip;
    URL soundUrl[] = new URL[10];

    public Sound(){
        soundUrl[0] = getClass().getResource("Music/missile.wav");
        soundUrl[1] = getClass().getResource("Music/background.wav");
        soundUrl[2] = getClass().getResource("Music/Water splat.wav");
    }
    public void setFile(int i){
        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundUrl[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);

        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }

    public void play(){
        clip.start();
    }

    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop(){
        clip.stop();
    }
}