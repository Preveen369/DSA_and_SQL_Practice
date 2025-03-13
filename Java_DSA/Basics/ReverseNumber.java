import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReverseNumber {
    public static int reverse(int x) {
        int revnum = 0;
        while (x>0){
            int digit = x % 10;
            revnum = (revnum * 10) + digit;
            x = x / 10;
        }
        return revnum; 
	}
		public static void main(String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		
        String input = bf.readLine();
        int n = Integer.parseInt(input);
		System.out.print(reverse(n));
    }
    
}
