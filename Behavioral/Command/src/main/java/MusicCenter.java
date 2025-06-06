public class MusicCenter implements Device {
    @Override
    public void on() {
        System.out.println("Music center on");
    }

    @Override
    public void off() {
        System.out.println("Music center off");
    }
}
