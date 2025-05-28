public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int x, int y, int a, int b, int c) {
        super(color, x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Shape clone() {
        return new Triangle(color, x, y, a, b, c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
