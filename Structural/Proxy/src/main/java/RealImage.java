public class RealImage implements Image {
    private String name;

    public RealImage(String name) {
        this.name = name;
        System.out.println("Downloading image " + name);
    }

    @Override
    public void display() {
        System.out.println("Image");
    }
}
