public class File implements Component {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + name);
    }

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException("Cannot add");
    }
}
