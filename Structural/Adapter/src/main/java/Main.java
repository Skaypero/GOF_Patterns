public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new Mp3Player();
        MediaPlayer mediaPlayerWav = new WavAdapter();
        String filename = "music";

        mediaPlayer.play(filename);
        mediaPlayerWav.play(filename);
    }
}
