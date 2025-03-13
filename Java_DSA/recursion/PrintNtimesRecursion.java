package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNtimesRecursion {
    int ctr = 1;
    public void printNos(int n) {
        if (ctr > n)
            return;
        System.out.print(ctr++ + " ");
        printNos(n);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        PrintNtimesRecursion rec = new PrintNtimesRecursion();
        int num = Integer.parseInt(bf.readLine());
        rec.printNos(num);
    }
}