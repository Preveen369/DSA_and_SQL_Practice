package sorting;

import java.util.Arrays;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

public class SelectionSort {

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) /* throws IOException */ {
        // InputStreamReader is = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(is);
        int[] arr = { 2, 4, 5, 6, 5, 6, 3 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}