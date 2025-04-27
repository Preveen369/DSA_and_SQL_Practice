package arrays;

import java.util.Map;
import java.util.HashMap;

public class FindElementThatAppearsOnce {
    // public static int appearOnce(int[] arr){
    //     // Better Approach
    //     Map<Integer, Integer> map = new HashMap<>();
    //     int ans = 0;
    //     for (int i=0; i<arr.length; i++){   // O(N logM), M = N/2 + 1
    //         map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    //     }
    //     for (int key : map.keySet()){       // O(N/2 + 1)
    //         if(map.get(key) == 1){
    //             ans = key;
    //         }
    //     }
    //     return ans;
    // }

    public static int appearOnce(int[] arr){
        // Optimal Approach
        int xor = 0;
        for (int i=0; i<arr.length; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        int result = appearOnce(arr);
        System.out.println(result);
    }
}
