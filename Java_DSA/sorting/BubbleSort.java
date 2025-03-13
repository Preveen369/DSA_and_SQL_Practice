package sorting;

import java.util.Arrays;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int didSwap = 0;    // track the swap operations done
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            // in the first time, if the array is in ascending order
            // didn't perform swap operations
            if(didSwap == 0){
                break;
            }
            // System.out.println("runs");    
        }
    }

    public static void main(String[] args) /* throws IOException */ {
        // InputStreamReader is = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(is);
        int[] arr = { 1,2,3,4,5,6 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
