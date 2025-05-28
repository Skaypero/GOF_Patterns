public class Circle extends Shape {
    private int radius;

    public Circle(String color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(color, x, y, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
