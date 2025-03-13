package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNumbersNto1Backtracking {
    void printNos(int i, int n) {
        if (i > n)
            return;
        printNos(i + 1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        PrintNumbersNto1Backtracking pr = new PrintNumbersNto1Backtracking();
        int n = Integer.parseInt(bf.readLine());
        pr.printNos(1, n);

    }
}
