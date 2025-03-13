package recursion;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Sumoffirst_N_Numbers {
    static int sumOfNaturals(int n) {
        if (n == 0) return 0;
        return n + sumOfNaturals(n-1);
    }

    // static int sumOfNaturals(int n) {
    //     return (n == 0)? 0 : n + sumOfNaturals(n-1);
    // }

    // static void sumOfNaturals(int i, int sum) {
    //     if (i<1){
    //         System.out.println(sum);
    //         return;
    //     }
    //     sumOfNaturals(i-1, sum+i);
    // }

    public static void main(String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        String input = bf.readLine();
        int n = Integer.parseInt(input);

        int res = sumOfNaturals(n);
        System.out.println(res);

        // sumOfNaturals(n,0);
    }
}
