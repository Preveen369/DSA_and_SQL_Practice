package sorting;

import java.util.Arrays;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

public class InsertionSort {

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n-1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) /* throws IOException */ {
        // InputStreamReader is = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(is);
        int[] arr = { 6, 5, 5,6,7,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
