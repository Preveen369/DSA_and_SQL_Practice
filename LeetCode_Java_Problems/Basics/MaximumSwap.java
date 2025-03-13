import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumSwap {
    public static int maximumSwap(int num){
        int rmax = -1, id1 = -1, id2 = -1;
        char[] nums = Integer.toString(num).toCharArray();
        int n = nums.length;
        for (int i=n-1; i>=0; i--){
            if (rmax == -1 || nums[i]>nums[rmax]){
                rmax = i;
            }
            else if (nums[i]<nums[rmax]){
                id1 = i;
                id2 = rmax;
            }
        }
        if (id1 != -1 && id2 != -1){
            char temp = nums[id1];
            nums[id1] = nums[id2];
            nums[id2] = temp;
        }
        return Integer.parseInt(new String(nums));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = maximumSwap(num);
        System.out.println(result);
    }
}
