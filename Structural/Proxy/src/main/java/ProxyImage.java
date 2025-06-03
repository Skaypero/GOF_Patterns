public class ProxyImage implements Image {
    private String name;
    private RealImage image;

    public ProxyImage(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(name);
        }

        image.display();
    }
}
