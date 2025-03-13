package sorting;

import java.util.Arrays;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

public class RecursiveBubbleSort {

    static void bubble_sort(int[] arr, int n) {
        // Base case: range == 1
        if (n == 1)
            return;

        int didSwap = 0; // track the swap operations done
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = 1;
            }

            // in the first time, if the array is in ascending order
            // didn't perform swap operations
            if (didSwap == 0) {
                return;
            }

            // Range reduced after recursion:
            bubble_sort(arr, n - 1);
        }
    }

    public static void main(String[] args) /* throws IOException */ {
        // InputStreamReader is = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(is);
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        bubble_sort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
