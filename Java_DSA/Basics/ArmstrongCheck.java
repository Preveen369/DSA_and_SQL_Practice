import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Formula for counting no. of digits in num (n) 
    => int k = (int) Math.log10(n) + 1;
    => int k = String.valueOf(num).length() */ 

public class ArmstrongCheck {
	static boolean isArmstrong(int n) {
        int k = (int) Math.log10(n) + 1;
        int orig_num = n;
        int sum = 0;
        while(n>0){
            int d = n % 10;
            sum = sum + (int)(Math.pow(d, k));
            n = n / 10;
        }
        return (orig_num == sum)?true:false;
    }

	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);

        String input = bf.readLine();
        int n = Integer.parseInt(input);
        System.out.println(isArmstrong(n));
	}
}
