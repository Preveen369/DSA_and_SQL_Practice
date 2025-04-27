package arrays;

// import java.util.Arrays;

class LargestElementInArray {
    // public static int largestElement(int[] nums){
    // //Bruteforce Approach:
    // //Arrays.sort(nums); // O(NlogN) (or)
    // //sorting the array without inbuilt functions:
    // for (int i=nums.length-1; i>=1; i--){
    //     for (int j=0; j<=i-1; j++){
    //         if (nums[j] > nums[j+1]){
    //             int temp = nums[j];
    //             nums[j] = nums[j+1];
    //             nums[j+1] = temp;
    //         }
    //     }
    // }
    // return nums[nums.length-1];
    // }

    public static int largestElement(int[] nums) {
        // Optimal Approach:
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 2 };
        System.out.println(largestElement(nums));
    }
}