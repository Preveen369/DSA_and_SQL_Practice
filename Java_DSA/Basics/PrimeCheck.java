import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeCheck {
    public static String isPrime(int num) {
        int ctr = 0;
        int sqrtN = (int)(Math.sqrt(num));
        for (int i=1; i<=sqrtN; i++){
            if (num % i == 0){
                ctr++;
                if ((num/i)!=i) ctr++;
            }
        }
		return (ctr==2)?"YES":"NO";
	}
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);

        String input = bf.readLine();
        int n = Integer.parseInt(input);
        System.out.println(isPrime(n));
        
    }
}
