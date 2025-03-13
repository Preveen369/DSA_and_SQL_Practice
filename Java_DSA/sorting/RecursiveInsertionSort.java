package sorting;

import java.util.Arrays;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

public class RecursiveInsertionSort {

    static void insertion_sort(int[] arr, int i, int n) {
        // Base Case: i == n.
        if (i == n)
            return;
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertion_sort(arr, i+1, n);
    }

    public static void main(String[] args) /* throws IOException */ {
        // InputStreamReader is = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(is);
        int[] arr = { 6, 5, 5, 6, 7, 3 };
        int n = arr.length;
        insertion_sort(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }
}
