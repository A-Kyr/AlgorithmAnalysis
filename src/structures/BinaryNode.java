package structures;

public class BinaryNode {
    private BinaryNode left;
    private BinaryNode right;
    private int value;
    private BinaryNode parent;

    public BinaryNode(int value) {
        this.value = value;
    }

    /**
     * Insert new node into tree
     *
     * @param node
     */
    public void add(BinaryNode node) {
        if (node.getValue() > this.value) {
            if (right == null) {
                right = node;
                node.parent = this;
            }
            else right.add(node);
        }
        else if (node.getValue() < this.value){
            if (left == null) {
                left = node;
                node.parent = this;
            }
            else left.add(node);
        }
    }

    /**
     * Insert new value into tree
     * Faster, because there is no need to explicitly construct a new node
     * @param value
     */
    public void add(int value) {
        this.add(new BinaryNode(value));
    }

    /**
     * Delete a node from the tree with the given value
     * Replace that node with the next biggest value and adjust tree appropriately
     * @param value
     */
    public void delete(int value) {
        BinaryNode toBeDeleted = this.find(value);
        if (toBeDeleted.right != null) {
            BinaryNode nextBiggest = toBeDeleted.right;
            while (nextBiggest.left != null) {
                nextBiggest = nextBiggest.left;
            }
            this.value = nextBiggest.value;
            // remove the next biggest node from its previous position
            if (nextBiggest.right != null) nextBiggest.parent.left = nextBiggest.right;
            else nextBiggest.parent.left = null;
        }
    }

    /**
     * Get the height of the tree which is formed if the current node was the root
     * @return the height of the current tree
     */
    public int height() {
        int lheight = 0;
        int rheight = 0;
        /* compute  height of each subtree */
        if (left != null)
            lheight = this.left.height();
        if (right != null)
            rheight = this.right.height();

        /* use the larger one */
        if (lheight > rheight)
            return(lheight+1);
        else return(rheight+1);
    }

    public BinaryNode find(int value) {
        if (this.value == value) return this;
        else if (this.value > value && left != null) return left.find(value);
        else if (this.value < value && left != null) return right.find(value);
        return null;
    }

    public int getValue() {
        return this.value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public BinaryNode getRight() {
        return right;
    }
}
