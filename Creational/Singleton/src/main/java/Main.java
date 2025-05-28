public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Notebook notebook = new Notebook();

        if (notebook.getHash() == book.getHash()) {
            System.out.println("true");
        }
    }
}
