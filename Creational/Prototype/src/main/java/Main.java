public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle("red", 1, 2, 3);
        System.out.println(shape);
        Shape copy = shape.clone();
        System.out.println(copy);
    }
}
