package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    // Merge two sorted subarrays into a single sorted array
    static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // Merge the two subarrays
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Add remaining elements from the left subarray
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Add remaining elements from the right subarray
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy the sorted elements back into the original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // Recursive merge sort function
    static void mSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mSort(arr, low, mid); // Sort the left half
        mSort(arr, mid + 1, high); // Sort the right half
        merge(arr, low, mid, high); // Merge the two halves
    }

    // Public method to initiate merge sort
    static void mergeSort(int[] arr, int l, int r) {
        mSort(arr, l, r);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 9, 7, 2, 7, 1, 5, 8, 2 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}