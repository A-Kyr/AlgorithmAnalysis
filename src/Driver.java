import searching.BinarySearch;
import sorting.Quicksort;

public class Driver {
    public static void main(String[] args) {
        // array definition
        // note: should add a file which contains a lot of arrays for testing
        int[] A = {1, 4, 6, 2, 20, 4, 3, 9};

        // test quicksort
        Quicksort.refined(A, 5);
        for (int number: A) {
            System.out.println(number);
        }

        // test binary search
        System.out.println(BinarySearch.search(A, 3));
    }
}
