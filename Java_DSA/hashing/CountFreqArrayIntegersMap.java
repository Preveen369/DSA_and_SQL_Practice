package hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CountFreqArrayIntegersMap {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().trim().split("\\s+");

        // pre-computing can also be done seperately while taking map inputs itself
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(input[i]);

        // pre-computing -> performed seperately after taking map inputs
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        // Number of queries
        int q = Integer.parseInt(br.readLine());
        int[] queries = new int[q];
        for (int i = 0; i < q; i++)
            queries[i] = Integer.parseInt(br.readLine());

        System.out.println();
        // fetching the hashed values from map
        for (int num : queries)
            System.out.println(map.getOrDefault(num, 0));
    }
}
