import sorting.Quicksort;

public class Driver {
    public static void main(String[] args) {
        int[] A = {1, 4, 6, 2, 20, 4, 3, 9};
        Quicksort.refined(A, 5);
        for (int number: A) {
            System.out.println(number);
        }
    }
}
