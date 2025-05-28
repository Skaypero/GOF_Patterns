import renderer.DirectXRenderer;
import renderer.OpenGLRenderer;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int radius = 10;
        int width = 2;
        int height = 3;

        Shape circle = new Circle(new DirectXRenderer(), x, y, radius);
        Shape rectangle = new Rectangle(new OpenGLRenderer(), x, y, width, height);

        circle.draw();
        rectangle.draw();
    }
}
