import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidPalindrome {
    // Using iterative approach (OPTIMAL) [TWO POINTER APPROACH]:
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left), r = s.charAt(right);
            if (!Character.isLetterOrDigit(l))
                left++;
            else if (!Character.isLetterOrDigit(r))
                right--;
            else if (Character.toLowerCase(l) != Character.toLowerCase(r))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        String input = bf.readLine();
        System.out.println(isPalindrome(input));
    }
}
