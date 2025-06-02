public class Main {
    public static void main(String[] args) {
        TreeFactory factory = new TreeFactory();
        TreeType treeOak = factory.getTree("Oak");
        TreeType treePine = factory.getTree("Pine");

        Tree tree1 = new Tree(10, 10, treeOak);
        Tree tree2 = new Tree(20, 20, treePine);

        tree1.draw();
        tree2.draw();
    }
}
