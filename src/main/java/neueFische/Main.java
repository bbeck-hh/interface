package neueFische;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo Welt. Lass uns starten");

        VideoPlayer video = new VideoPlayer();

        MusicPlayer musicplayer = new MusicPlayer();

        MediaController mediacontroller = new MediaController();

        mediacontroller.playMedia(musicplayer);
        mediacontroller.playMedia(video);

    }
}
