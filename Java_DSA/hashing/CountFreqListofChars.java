package hashing;

import java.io.*;
import java.util.*;

public class CountFreqListofChars {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the array of characters
        String input = br.readLine().trim().replaceAll("\\s+","");
        char[] arr = input.toCharArray();

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
    // Function to count the frequency of all chars from 1 to N in the array.
    public List<Integer> frequencyCount(char[] arr) {
        int n = arr.length-1;
        Integer[] hash = new Integer[n+1];
        Arrays.fill(hash, 0);
        // Pre-computing
        for (char ch : arr) {
            hash[ch] += 1;
        }
        List<Integer> HashList = new ArrayList<>();
        // Fetching the hashed values
        for (Integer count : hash) {
            HashList.add(count);
        }
        //HashList.remove(0);
        return HashList;

    }
}