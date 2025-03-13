package arrays;

// import java.util.Arrays;

class LargestElementInArray{
    // public static int findLargestElement(int[] nums){
    //     //Bruteforce Approach:
    //     Arrays.sort(nums);  // O(NlogN)   
    //     return nums[nums.length-1];        
    // }

    public static int findLargestElement(int[] nums){
        //Optimal Approach:
        int largest = nums[0];
        for (int i=1; i<nums.length; i++){
            if (nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;     
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,2};
        System.out.println(findLargestElement(nums));
    }
}