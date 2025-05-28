package shape;

import renderer.Renderer;

public class Circle extends Shape {
    private int radius;

    public Circle(Renderer renderer, int x, int y, int radius) {
        super(renderer, x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(x, y, radius);
    }
}
