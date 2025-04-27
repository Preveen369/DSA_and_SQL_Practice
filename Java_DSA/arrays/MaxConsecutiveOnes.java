package arrays;

public class MaxConsecutiveOnes {
    public static int maxConsecutive(int[] arr){
        int max = 0;
        int count = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == 1){
                count++;
                max = Math.max(max, count);
            } else{
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1,1};
        int result = maxConsecutive(arr);
        System.out.println(result);
    }
}
