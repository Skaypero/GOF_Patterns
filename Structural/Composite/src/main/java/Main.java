public class Main {
    public static void main(String[] args) {
        Component root = new Folder("root");

        Component directory1 = new Folder("directory1");
        Component directory2 = new Folder("directory2");

        Component file1 = new File("file1");
        Component file2 = new File("file2");

        directory1.add(file1);

        root.add(file2);
        root.add(directory1);
        root.add(directory2);

        root.show("");
    }
}
