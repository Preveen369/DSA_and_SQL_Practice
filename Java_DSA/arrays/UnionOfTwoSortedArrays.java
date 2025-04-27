package arrays;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.HashSet;
import java.util.List;
// import java.util.Set;

public class UnionOfTwoSortedArrays {
    // public static List<Integer> unionArray(List<Integer> arr1, List<Integer>
    // arr2) {
    // // Bruteforce Approach
    // Set<Integer> set = new HashSet<>();
    // List<Integer> result = new ArrayList<>();

    // for (int num : arr1) {
    // set.add(num);
    // }
    // for (int num : arr2) {
    // set.add(num);
    // }
    // for (int num : set) {
    // result.add(num);
    // }
    // return result;
    // }

    public static List<Integer> unionArray(List<Integer> a, List<Integer> b) {
        // Optimal Approach: Two Pointer method
        int n1 = a.size();
        int n2 = b.size();

        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a.get(i) <= b.get(j)) {
                if (result.isEmpty() || result.get(result.size() - 1) != a.get(i)) {
                    result.add(a.get(i));
                }
                i++;
            } else if (a.get(i) > b.get(j)) {
                if (result.isEmpty() || result.get(result.size() - 1) != b.get(j)) {
                    result.add(b.get(j));
                }
                j++;
            }
        }

        // Remaining elements from list a
        while (i < n1) {
            if (result.isEmpty() || result.get(result.size() - 1) != a.get(i)) {
                result.add(a.get(i));
            }
            i++;
        }

        // Remaining elements from list b
        while (j < n2) {
            if (result.isEmpty() || result.get(result.size() - 1) != b.get(j)) {
                result.add(b.get(j));
            }
            j++;
        }

        return result;
    }

    // public static List<Integer> intersectionArray(List<Integer> a, List<Integer>
    // b) {
    // // Bruteforce approach
    // int n1 = a.size();
    // int n2 = b.size();

    // List<Integer> result = new ArrayList<>();
    // int[] visitedArr = new int[n2];
    // for (int i=0; i<n1; i++){
    // for (int j=0; j<n2; j++){
    // // compare if element is same in both arrays,
    // // track occurence and then add in result list
    // if(a.get(i) == b.get(j) || visitedArr[j] == 0){
    // result.add(a.get(i));
    // visitedArr[j] = 1;
    // break;
    // }

    // if(b.get(j) > a.get(i)) break;
    // }
    // }

    // return result;
    // }

    public static List<Integer> intersectionArray(List<Integer> a, List<Integer> b) {
        // Optimal Approach: Two Pointer method for intersection
        int n1 = a.size();
        int n2 = b.size();

        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a.get(i) < b.get(j)) {
                i++;
            } else if (a.get(i) > b.get(j)) {
                j++;
            } else {
                // Equal elements found
                result.add(a.get(i));
                i++;
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> arr2 = Arrays.asList(2, 3, 4, 5, 5, 6);
        // List<Integer> result = unionArray(arr1, arr2);
        List<Integer> result = intersectionArray(arr1, arr2);
        System.out.println(result);
    }
}
