import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintTable {
    public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int i=10;
        while (i>0) {
            int mul = i * n;
            System.out.print(mul + " ");
            i--;
        }
    }
}
