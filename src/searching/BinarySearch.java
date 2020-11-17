package searching;

public class BinarySearch {

    /**
     * Searches for a value in a sorted array
     * Assumption: array A is sorted
     *
     * @param A sorted array
     * @param key the key to search for
     */
    public static int search(int[] A, int key) {
        return search(A, key, 0, A.length-1);
    }

    private static int search(int[] A, int key, int L, int R) {
        if (R < L) return -1;
        int m = (R + L) / 2;
        if (key == A[m]) return m;
        if (key > A[m])
            return search(A, key, m+1, R);
        else
            return search(A, key, L, m-1);
    }
}
