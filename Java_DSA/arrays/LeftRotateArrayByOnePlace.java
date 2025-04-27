package arrays;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {
    // Optimal Approach:
    public static void leftRotate(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    // public static void rightRotate(int[] arr){
    //     int n = arr.length;
    //     int temp = arr[n-1];
    //     for(int i=n-1; i>0; i--){
    //         arr[i] = arr[i-1];
    //     }
    //     arr[0] = temp;
    // }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        leftRotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
