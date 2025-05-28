package shape;

import renderer.Renderer;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Renderer renderer, int x, int y, int width, int height) {
        super(renderer, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        renderer.renderRectangle(x, y, width, height);
    }
}
