package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNameNtimes {
    void printGfg(int N) {
        if (N == 0)
            return;
        System.out.print("GFG ");
        printGfg(--N);
    }

    public static void main(String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        int num = Integer.parseInt(bf.readLine());

        PrintNameNtimes pn = new PrintNameNtimes();
        pn.printGfg(num);
    }
}
