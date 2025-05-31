public class Lights implements Component {
    @Override
    public void on() {
        System.out.println("Lights on");
    }

    @Override
    public void off() {
        System.out.println("Lights off");
    }
}
