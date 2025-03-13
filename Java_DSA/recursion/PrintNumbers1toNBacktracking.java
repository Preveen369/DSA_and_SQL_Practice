package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNumbers1toNBacktracking {
    void printNos(int i, int n) {
        if (i < 1)
            return;
        printNos(i - 1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        PrintNumbers1toNBacktracking pr = new PrintNumbers1toNBacktracking();
        int n = Integer.parseInt(bf.readLine());
        pr.printNos(n, n);

    }
}
