package sorting;

public class InsertionSort {
    // No use of sentinel value
    // Room for improvement
    public static void sort(int[] A) {
        int length = A.length;
        int key;
        for (int i = 1; i < length; i++) {
            key = A[i];
            int j = i;
            while (j > 0 && key < A[j-1]) {
                A[j] = A[j-1];
                j--;
            }
            A[j] = key;
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 6, 2, 20, 4, 3, 9};
        sort(A);
        for (int number: A) {
            System.out.println(number);
        }
    }
}
