public class Main {
    public static void main(String[] args) {
        Device light = new Light();
        Device musicCenter = new MusicCenter();

        Command on = new OnCommand(light);
        Command off = new OffCommand(musicCenter);

        Controller controller = new Controller();
        controller.setCommand(on);
        controller.execute();
        controller.setCommand(off);
        controller.execute();
    }
}
