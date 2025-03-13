package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFactorial {
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        int num = Integer.parseInt(bf.readLine());

        int result = factorial(num);
        System.out.println(result);
    }
}
