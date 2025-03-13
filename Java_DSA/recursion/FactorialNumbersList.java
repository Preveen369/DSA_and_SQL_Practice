package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FactorialNumbersList {
    static long factorial(long n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> list = new ArrayList<>();
        for (long i = 1; i <= n; i++) {
            long fact = factorial(i);
            if (fact>n) break;
            list.add(fact);
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        long num = Long.parseLong(bf.readLine());

        ArrayList<Long> list = factorialNumbers(num);
        System.out.println(list);
    }
}
