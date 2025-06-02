public class TreeType {
    protected String name;
    protected String texture;
    protected String color;

    public TreeType(String name, String texture, String color) {
        this.name = name;
        this.texture = texture;
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println(name + " " + x + " " + y);
    }
}
