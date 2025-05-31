public class Projector implements Component {
    @Override
    public void on() {
        System.out.println("Projector on");
    }

    @Override
    public void off() {
        System.out.println("Projector off");
    }
}