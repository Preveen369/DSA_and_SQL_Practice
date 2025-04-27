package arrays;

import java.util.Arrays;

public class LeftRotateArrayByDPlace {

    // public static void leftRotateDPlaces(int[] arr, int n, int d) {
    //     // bruteforce approach: reduce to d steps, since when d is multiple 
    //     // of n it comes back to the original position, itself
    //     d=d%n;
        
    //     // new temp[] array to store first d elements
    //     int[] temp = new int[d];
    //     for (int i=0; i<d; i++){
    //         temp[i] = arr[i];
    //     }

    //     // shifting n-d elements of the array to first d positions
    //     for (int i=d; i<n; i++){
    //         arr[i-d] = arr[i];
    //     }

    //     // pushing back first d elements to n-d array positions
    //     for (int i=n-d; i<n; i++){
    //         arr[i] = temp[i - (n-d)];
    //     }

    // }

    public static void leftRotateDPlaces(int[] arr, int n, int d) {
        // optimal approach: reversing sections of array,
        // without using swapping of elements, no extra space
        d = d % n; // handle d when d>=n
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

    }

    static void reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // public static void rightRotateDPlaces(int[] arr, int n, int d) {
    //     // optimal approach: reversing sections of array,
    //     // without using swapping of elements, no extra space
    //     d = d % n; // handle d when d>=n
    //     reverse(arr, 0, n-1);
    //     reverse(arr, 0, d-1);
    //     reverse(arr, d, n-1);
    // }

    // static void reverse(int[] arr, int start, int end){
    //     while(start <= end){
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int size = arr.length;
        leftRotateDPlaces(arr, size, 100);
        System.out.println(Arrays.toString(arr));
    }
}
