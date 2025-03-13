package sorting;

import java.util.Arrays;

public class QuickSort {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int partIdx = partition(arr, low, high);
            quickSort(arr, low, partIdx - 1);
            quickSort(arr, partIdx + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (arr[i] <= pivot && i <= high - 1) {
            i++;
        }
        while (arr[j] > pivot && j >= low + 1) {
            j--;
        }
        if (i < j)
            swap(arr, i, j);
        swap(arr, low, j);
        return j;
    }

    public static void main(String[] args) /* throws IOException */ {
        // InputStreamReader is = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(is);
        int[] arr = { 4, 1, 3, 9, 7 };
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}