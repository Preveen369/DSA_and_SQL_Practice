import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class NthFibonacci {

    public static int nthFibonacci(int n){
        int a=1, b=1, c=0;
        if (n == 1 || n == 2) 
            return 1;
        for (int i=3; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		
        String input = bf.readLine();
        int n = Integer.parseInt(input);
        System.out.println(nthFibonacci(n));
	}

}
