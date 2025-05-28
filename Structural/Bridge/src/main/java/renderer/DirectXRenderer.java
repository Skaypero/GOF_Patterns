package renderer;

public class DirectXRenderer implements Renderer {
    @Override
    public void renderCircle(int x, int y, int radius) {
        System.out.println("Circle directX");
    }

    @Override
    public void renderRectangle(int x, int y, int width, int height) {
        System.out.println("Rectangle directX");
    }
}
