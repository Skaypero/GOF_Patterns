package renderer;

public class OpenGLRenderer implements Renderer {
    @Override
    public void renderCircle(int x, int y, int radius) {
        System.out.println("Circle openGL");
    }

    @Override
    public void renderRectangle(int x, int y, int width, int height) {
        System.out.println("Rectangle openGL");
    }
}
