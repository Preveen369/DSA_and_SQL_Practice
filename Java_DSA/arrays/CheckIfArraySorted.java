package arrays;

// Check if the array is sorted or not:
public class CheckIfArraySorted{
    public static boolean check(int[] nums){
        int n=nums.length;
        for (int i=1; i<n; i++){
            if (nums[i] >= nums[i-1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {2,1,3,4};
        if (check(array)){
            System.out.println("The array is sorted.");
        }
        else{
            System.out.println("The array is not sorted.");
        }
    }
}