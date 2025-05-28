public class WavAdapter implements MediaPlayer {
    private OldWavPlayer oldWavPlayer;

    public WavAdapter() {
        oldWavPlayer = new OldWavPlayer();
    }

    @Override
    public void play(String filename) {
        oldWavPlayer.playWav(filename);
    }
}
