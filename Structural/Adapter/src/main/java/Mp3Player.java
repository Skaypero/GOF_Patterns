public class Mp3Player implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Play mp3 " + filename);
    }
}
