package arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    // public static int[] movezeroes(int[] arr, int n){
    // // bruteforce approach: single pointer with temp[] array:
    // int[] temp = new int[n];
    // int index = 0;

    // // copying all non-zero elements into the temp[] array [O(N)]
    // for (int i=0; i<n; i++){
    // if (arr[i] != 0){
    // temp[index] = arr[i];
    // index++;
    // }
    // }

    // // pushing the temp[] elements to arr[] front position [O(x)]
    // int nz = temp.length;
    // for (int i=0; i<nz; i++){
    // arr[i] = temp[i];
    // }
    // // [zeros are moved to end positions]

    // // not needed: [optional] [O(N-x)]
    // // for (int i = nz; i<n; i++){
    // // arr[i] = 0;
    // // }

    // return arr; TC: O(2N)
    // }

    public static int[] movezeroes(int[] arr, int n) {
        // optimal approach:
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }

        return arr;
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int size = arr.length;
        int[] result = movezeroes(arr, size);
        System.out.println(Arrays.toString(result));
    }
}
