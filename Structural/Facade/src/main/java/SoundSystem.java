public class SoundSystem implements Component {
    @Override
    public void on() {
        System.out.println("SoundSystem on");
    }

    @Override
    public void off() {
        System.out.println("SoundSystem off");
    }
}