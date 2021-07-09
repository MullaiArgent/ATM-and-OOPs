import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class dummy{

        public  void audio_notify(String a) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
                File file =new File(a);
                AudioInputStream audio = AudioSystem.getAudioInputStream(file);
                Clip d = AudioSystem.getClip();

                d.open(audio);
                d.start();
        }
}
