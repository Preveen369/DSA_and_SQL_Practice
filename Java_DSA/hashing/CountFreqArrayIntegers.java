package hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountFreqArrayIntegers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Reading the size of the array
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        String[] input = br.readLine().trim().split("\\s+");
        int maxElement = 0;
        
        // Reading array elements and finding the maximum element
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
            maxElement = Math.max(maxElement, arr[i]);
        }
        
        // Pre-computing frequencies using an array (counting sort)
        int[] hash = new int[maxElement + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        
        // Reading the number of queries
        int q = Integer.parseInt(br.readLine());
        int[] queries = new int[q];
        
        // Reading the query values
        for (int i = 0; i < q; i++) {
            queries[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println();
        // Fetching and printing the frequencies for each query
        for (int num : queries) {
            // Check if the number is within the valid range to avoid ArrayIndexOutOfBoundsException
            if (num <= maxElement) {
                System.out.println(hash[num]);
            } else {
                System.out.println(0);  // If the number is larger than maxElement, its frequency is 0
            }
        }
    }
}