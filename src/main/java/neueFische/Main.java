package neueFische;

import javax.print.attribute.standard.Media;
import javax.swing.text.View;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo Welt");

        VideoPlayer video = new VideoPlayer();

        MusicPlayer musicplayer = new MusicPlayer();

        MediaController mediacontroller = new MediaController();

        mediacontroller.playMedia(musicplayer);
        mediacontroller.playMedia(video);

    }
}
