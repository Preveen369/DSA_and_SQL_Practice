package hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountFreqArrayChars {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the array of characters
        String input = br.readLine().trim().replaceAll("\\s+", "");
        char[] arr = input.toCharArray();

        // Pre-computing frequencies using an array (counting sort)
        int[] hash = new int[256];
        for (char ch : arr) {
            hash[ch] += 1;
        }

        // Reading the number of queries
        int q = Integer.parseInt(br.readLine());
        char[] queries = new char[q];

        // Reading the query values
        for (int i = 0; i < q; i++) {
            queries[i] = br.readLine().trim().charAt(0);
        }

        System.out.println();
        
        // Fetching and printing the frequencies for each query
        for (char ch : queries) {
            System.out.println(hash[ch]);
        }
    }
}