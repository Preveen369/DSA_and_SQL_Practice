package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNumbers1toN {
    public void printNos(int i, int n) {
        if (i > n)
            return;
        System.out.print(i + " ");
        printNos(i + 1, n);
    }

    // int ctr = 1;
    // public void printNos(int n) {
    // if (ctr > n)
    // return;
    // System.out.print(ctr++ + " ");
    // printNos(n);
    // }
    
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        PrintNumbers1toN pr = new PrintNumbers1toN();
        int num = Integer.parseInt(bf.readLine());
        pr.printNos(1, num);
    }
}
