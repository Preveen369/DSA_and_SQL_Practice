package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {
    // Approach: two pointers swapping
    // int start = 0, end = arr.length-1;
    // while(start<end) {
    // int temp = arr[start];
    // arr[start] = arr[end];
    // arr[end] = temp;
    // start++; end--;
    // }

    // Approach: single pointers recursion
    static void reverseArray(int arr[]) {
        reverse(0, arr, arr.length);
    }
    private static void reverse(int i, int arr[], int n) {
        if (i >= n / 2)
            return;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        reverse(i + 1, arr, n); // for swapping 
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);

        System.out.print("Enter the size of the array: ");
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(bf.readLine());

        reverseArray(arr);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
