public class Player implements Component {
    @Override
    public void on() {
        System.out.println("Player on");
    }

    @Override
    public void off() {
        System.out.println("Player off");
    }
}