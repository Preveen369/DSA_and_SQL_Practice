package hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CountFreqArrayCharsMap {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the string input
        String input = br.readLine().trim();
        
        // Pre-computing character frequencies
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Number of queries
        int q = Integer.parseInt(br.readLine());
        char[] queries = new char[q];
        for (int i = 0; i < q; i++)
            queries[i] = br.readLine().charAt(0);

        System.out.println();
        // fetching the hashed values from map
        for (char ch : queries)
            System.out.println(map.getOrDefault(ch, 0));
    
    }
}
