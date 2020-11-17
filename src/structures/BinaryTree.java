package structures;

public class BinaryTree {
    private BinaryNode root;

    public BinaryTree(BinaryNode root) {
        this.root = root;
    }
    public BinaryTree(int value) {
        this.root = new BinaryNode(value);
    }

    // add insert method
    public void add(int value) {
        this.add(new BinaryNode(value));
    }
    public void add(BinaryNode node) {
        root.addNode(node);
    }
    // add delete method
    // add search method
    // add toString method
}
