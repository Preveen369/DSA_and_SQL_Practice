package arrays;

public class SecondLargestElementInArray {
    // public static int secondLargestElement(int[] nums){
    // //Bruteforce Approach:
    // Arrays.sort(nums); //O(NlogN)
    // int n = nums.length;
    // int largest = nums[n-1];
    // int sLargest = -1;

    // for (int i=n-2; i>=0; i--){ //O(N)
    // if (nums[i] != largest){
    // sLargest = nums[i];
    // break;
    // }
    // }
    // return sLargest;
    // }

    // public static int secondLargestElement(int[] nums){
    // //Better Approach:
    // int n = nums.length;
    // int largest = nums[0];
    // int secondLargest = -1;

    // for (int i=0; i<n; i++){
    // if (nums[i] > largest){
    // largest = nums[i];
    // }
    // }

    // for(int j=0; j<n; j++){
    // if(nums[j] > secondLargest && nums[j] != largest){
    // secondLargest = nums[j];
    // }
    // }
    // return secondLargest;
    // }

    public static int secondLargestElement(int[] nums){
        //Optimal Approach:
        int n = nums.length;
        int largest = 1;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];  
            } else if (nums[i] < largest && nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }
        
        // if second largest doesn't exists
        if (secondLargest == Integer.MIN_VALUE) return -1;
        else return secondLargest; // if exists
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 7, 7, 5 };
        System.out.println(secondLargestElement(nums));
    }
}
