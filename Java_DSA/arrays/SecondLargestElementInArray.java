package arrays;

import java.util.Arrays;

public class SecondLargestElementInArray {
    // public static int findSecondLargestElement(int[] nums){
    // //Bruteforce Approach:
    // Arrays.sort(nums); //O(NlogN)
    // int n = nums.length;
    // int largest = nums[n-1];
    // int second = -1;

    // for (int i=n-2; i>=0; i--){ //O(N)
    // if (nums[i] != largest){
    // second = nums[i];
    // break;
    // }
    // }
    // return second;
    // }

    // public static int findSecondLargestElement(int[] nums){
    // //Better Approach:
    // int n = nums.length;
    // int largest = nums[0];
    // int second = -1;

    // for (int i=0; i<n; i++){
    // if (nums[i] > largest){
    // largest = nums[i];
    // }
    // }

    // for(int j=0; j<n; j++){
    // if(nums[j] > second && nums[j] != largest){
    // second = nums[j];
    // }
    // }
    // return second;
    // }

    public static int findSecondLargestElement(int[] nums){
        //Optimal Approach:
        int n = nums.length;
        int largest = 1;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(nums[i] > largest){
                second = largest;
                largest = nums[i];  
            } else if (nums[i] < largest && nums[i] > second){
                second = nums[i];
            }
        }
        
        if (second == Integer.MIN_VALUE) return -1;
        else return second;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 7, 7, 5 };
        System.out.println(findSecondLargestElement(nums));
    }
}
