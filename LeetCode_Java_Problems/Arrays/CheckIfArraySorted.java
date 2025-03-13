package Arrays;

public class CheckIfArraySorted{
    public static boolean check(int[] nums) {
        int n = nums.length;
        int dropCount = 0;
        for (int i=0; i<n-1; i++){
            if (nums[i]>nums[i+1]){
                dropCount++;
            }
        }
        if (nums[n-1] > nums[0]){
            dropCount++;
        }
        if (dropCount == 0 || dropCount == 1){
            return true;
        }
        return false;
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