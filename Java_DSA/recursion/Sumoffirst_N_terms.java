package recursion;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Sumoffirst_N_terms {
    static int sumOfSeries(int n) {
        if (n == 0) return 0;
        return (n*n*n) + sumOfSeries(n - 1);
    }

    // static int sumOfSeries(int n) {
    //     return (n == 0) ? 0 : (n*n*n) + sumOfSeries(n - 1);
    // }

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        String input = bf.readLine();
        int n = Integer.parseInt(input);

        int res = sumOfSeries(n);
        System.out.println(res);

    }
}
