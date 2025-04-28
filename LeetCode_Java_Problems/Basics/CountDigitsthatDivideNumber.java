package basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigitsthatDivideNumber {
    public static int countDigits(int num) {
        return 0;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        // Enter the number of sentences:
        int num = Integer.parseInt(br.readLine());
        System.out.println(countDigits(num));
    }
}
