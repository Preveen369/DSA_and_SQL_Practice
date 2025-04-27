package arrays;

// import java.util.HashSet;
// import java.util.Set;

public class RemoveDuplicatesFromArrays {
    // // Bruteforce approach
    // public static int removeDuplicates(int[] nums){
    //     Set<Integer> set = new HashSet<>();
    //     int n = nums.length;
    //     int index = 0;

    //     for (int i=0; i<n; i++){
    //         set.add(nums[i]);
    //     }

    //     nums = new int[set.size()];

    //     for (int item : set){
    //         nums[index] = item;
    //         index++;
    //     }
    //     return nums.length;
    // }


    // Optimized Approach 
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j=1; j<n; j++){
            if (nums[j] != nums[i]){
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }    

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}
