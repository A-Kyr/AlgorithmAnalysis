package structures;

public class Hashing {
    // second row is a validation bit
    private int[][] A = new int[31][2];
    private int hash = 31;

    public void insert(int value) {
        int index = value % hash;
        // if cell not occupied put the value there
        if (A[index][1] == 0) {
            A[index][0] = value;
            A[index][1] = 1;
        }
        // otherwise use linear probing
        else {
            // this counter ensures that the algorithm only does one cycle of the array
            int counter = 0;
            index++;
            do {
                counter++;
                if (index == A.length) index = 0;
                if (A[index][1] == 0) {
                    A[index][0] = value;
                    A[index][1] = 1;
                    return;
                }
                else index++;
            } while(counter <= A.length);
            System.out.println("Value could not be added.");
        }
    }

    public int find(int value) {
        int index = value % hash;
        if (A[index][0] == value) return index;
        else {
            int counter = 0;
            do {
                index++;
                if (index == A.length) index = 0;
                else {
                    if (A[index][0] == value) return index;
                }
            } while (A[index][1] != 0 || counter != A.length);
            return -1;
        }
    }

    public void setHash(int val) {
        this.hash = val;
        this.A = new int[hash][2];
    }
}
