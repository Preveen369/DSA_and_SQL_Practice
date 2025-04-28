package basics;
import java.util.ArrayList;
import java.util.List;


public class SumofPowersofThree{
    public static boolean checkPowersOfThree(int n){
        List<Integer> powers = new ArrayList<>();
        int power = 1;
        
        while (power <= n){
            powers.add(n);
            power *= 3;
        }
        
        return canFormSum(powers, 0, n);
    }

    // Optimized approach
    // public static boolean checkPowersOfThree(int n){
    //    while (n>0){
    //     if (n%3 == 2){
    //         return false;
    //     }
         
    //      n /= 3;
    //    }
    //    return true;
    // }


    
    private static boolean canFormSum(List<Integer> powers, int index, int target){
        if (target==0){
            return true;
        }
        if (index>=powers.size() || target<0){
            return false;
        }
        if (canFormSum(powers, index+1, target-powers.get(index))){
            return true;
        }
        
        return canFormSum(powers, index + 1, target);
    }

    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(12)); // Output: true
        System.out.println(checkPowersOfThree(91)); // Output: true
        System.out.println(checkPowersOfThree(21)); // Output: false
    }
}