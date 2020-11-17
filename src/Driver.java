import structures.BinaryNode;

public class Driver {
    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(5);
        root.add(3);
        root.add(8);
        root.add(1);
        root.add(4);
        root.add(6);
        root.add(10);
        root.add(7);

        root.delete(5);

        System.out.println(root.getValue());

    }
}
