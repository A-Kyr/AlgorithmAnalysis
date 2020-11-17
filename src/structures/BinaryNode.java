package structures;

public class BinaryNode {
    private BinaryNode left;
    private BinaryNode right;
    private int value;
    private boolean root = false;

    public BinaryNode(int value) {
        this.value = value;
        this.root = false;
    }

    /**
     * Insert new node into tree
     *
     * @param node
     */
    public void addNode(BinaryNode node) {
        if (node.getValue() > this.value) {
            if (right == null) right = node;
            else right.addNode(node);
        }
        else if (node.getValue() < this.value){
            if (left == null) left = node;
            else left.addNode(node);
        }
    }

    /**
     * Insert new value into tree
     * Faster, because there is no need to explicitly construct a new node
     * @param value
     */
    public void addNode(int value) {
        this.addNode(new BinaryNode(value));
    }

    public int getValue() {
        return this.value;
    }

    // update this method to nicely print the whole tree from this node (hint: use recursion?)
    public String toString() {
        return Integer.toString(value);
    }
}
