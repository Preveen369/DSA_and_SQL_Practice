package hashing;

import java.io.*;
import java.util.*;

public class CountFreqListofArrayElements {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the size of the array
        int n = Integer.parseInt(br.readLine());
        
        // Read the array elements
        int[] arr = new int[n];
        String[] input = br.readLine().trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // Create a Solution object and invoke the frequencyCount method
        Solution solution = new Solution();
        List<Integer> result = solution.frequencyCount(arr);

        // Print the result
        for (int count : result) {
            System.out.print(count + " ");
        }
    }
}

// } Driver Code Ends

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        Integer[] hash = new Integer[n + 1];
        Arrays.fill(hash, 0);
        // Pre-computing
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        List<Integer> HashList = new ArrayList<>();
         // Fetching the hashed values
        for (Integer num : hash) {
            HashList.add(num);
        }
        HashList.remove(0);
        return HashList;

    }
}