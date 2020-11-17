package sorting;

public class Quicksort {
    private static int few = 0;

    /**
     * A refinement for quicksort which uses insertion sort after a FEW elements remain
     * Few should be around 5-25
     * @param A
     * @param L
     * @param R
     */
    public static void refined(int[] A, int L, int R) {
        int pivot;
        if (R - L > few) {
            pivot = partition(A, L, R);
            sort(A, L, pivot - 1);
            sort(A, pivot + 1, R);
        }
        InsertionSort.sort(A);
    }

    public static void refined(int[] A, int L, int R, int few) {
        setFew(few);
        refined(A, L, R);
    }

    public static void refined(int[] A, int few) {
        setFew(few);
        refined(A, 0, A.length-1, few);
    }

    public static void sort(int[] A, int L, int R) {
        int pivot;
        if (R > L) {
            pivot = partition(A, L, R);
            sort(A, L, pivot - 1);
            sort(A, pivot + 1, R);
        }
    }

    public static void sort(int[] A) {
        sort(A, 0, A.length-1);
    }

    private static int partition(int[] A, int L, int R) {
        int pivot = A[R];
        int pL = L;
        int pR = R;

        while (pL < pR) {
            while (A[pL] < pivot) pL++;
            while (A[pR] >= pivot && pR > L) pR--;
            if (pL < pR) swap(A, pL, pR);
        }
        swap(A, pL, R);
        return pL;
    }

    private static void swap(int[] A, int L, int R) {
        int temp = A[L];
        A[L] = A[R];
        A[R] = temp;
    }

    public static void setFew(int few) {
        Quicksort.few = few;
    }
}
