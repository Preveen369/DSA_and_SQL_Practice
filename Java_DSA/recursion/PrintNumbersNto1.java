package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNumbersNto1 {
    void printNos(int i, int n) {
        if (i < 1)
            return;
        System.out.print(i + " ");
        printNos(i - 1, n);
    }

    // void printNos(int N) {
    // if (N < 1)
    // return;
    // System.out.print(N-- + " ");
    // printNos(N); }

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        PrintNumbersNto1 pr = new PrintNumbersNto1();
        int n = Integer.parseInt(bf.readLine());
        pr.printNos(n, n);

    }
}
