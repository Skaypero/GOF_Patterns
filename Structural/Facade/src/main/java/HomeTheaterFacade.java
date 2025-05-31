public class HomeTheaterFacade {
    private Lights lights;
    private Player player;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade() {
        lights = new Lights();
        player = new Player();
        projector = new Projector();
        soundSystem = new SoundSystem();
    }

    public void startMovie() {
        lights.off();
        projector.on();
        soundSystem.on();
        player.on();
    }

    public void stopMovie() {
        projector.off();
        soundSystem.off();
        player.off();
        lights.on();
    }
}
