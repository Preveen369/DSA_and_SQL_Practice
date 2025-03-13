import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeCheck {
    public static boolean palindromeNumber(int n){
        int orig_num = n, rev_num = 0;
        while(n>0){
            int digit = n % 10;
            rev_num = (rev_num * 10) + digit;
            n = n / 10;
        }
        return (orig_num == rev_num)?true:false;
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		
        String input = bf.readLine();
        int n = Integer.parseInt(input);
        System.out.println(palindromeNumber(n));
    }
}