import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDof2Numbers {
    public static int gcd(int a, int b) {
        // Optimal approach: Euclidean Algorithm
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        return (a == 0) ? b : a;
    }

    // // Better approach: Finding first common factor
    // for (int i = Math.min(a, b); i > 1; i--) {
    // if (a % i == 0 && b % i == 0) {
    // return i; // first common factor
    // }
    // }
    // return 1; // if no common factors

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        System.out.println("GCD of (" + a + "," + b + ") = " + gcd(a, b));
    }
}