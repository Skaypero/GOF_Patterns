package shape;

import renderer.Renderer;

public abstract class Shape {
    protected Renderer renderer;
    protected int x;
    protected int y;

    public Shape(Renderer renderer, int x, int y) {
        this.renderer = renderer;
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}
