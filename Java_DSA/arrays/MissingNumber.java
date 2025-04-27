package arrays;

public class MissingNumber {
    // public static int missingNumber(int[] arr, int n){
    //     // Better approach: using hash map
    //     int[] hash = new int[n+1];
    //     for (int i=0; i<n-1; i++){
    //         hash[arr[i]] = 1;
    //     }
    //     for (int i=1; i<n; i++){
    //         if (hash[i] == 0){
    //             return i;
    //         }
    //     }
    //     return 0;
    // }

    public static int missingNumber(int[] arr, int n){
        // optimal approach: computing XOR values
        int xor1=0, xor2=0;
        for (int i=0; i<n-1; i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        int size = arr.length;
        int result = missingNumber(arr, size);
        System.out.println(result);
    }
}
