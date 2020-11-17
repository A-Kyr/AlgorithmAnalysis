import structures.BinaryNode;
import structures.Hashing;

public class Driver {
    public static void main(String[] args) {
        Hashing A = new Hashing();
        A.setHash(11);
        A.insert(33);
        A.insert(24);
        A.insert(3);
        A.insert(5);
        A.insert(17);
        A.insert(40);
        A.insert(74);
        A.insert(31);
        A.insert(16);

        System.out.println(A.find(16));

    }
}
