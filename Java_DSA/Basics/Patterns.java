import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patterns {
    static void pattern_1(int n) {
        for (int i = 0; i < n; i++) { // n->5
            for (int j = 0; j < n; j++) { // n->5
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_2(int n) {
        for (int i = 0; i < n; i++) { // n->5
            for (int j = 0; j <= i; j++) { // j=i
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_3(int n) {
        for (int i = 1; i <= n; i++) { // n->5
            for (int j = 1; j <= i; j++) { // j=i
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern_4(int n) {
        for (int i = 1; i <= n; i++) { // n->5
            for (int j = 1; j <= i; j++) { // j=i
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern_5(int n) {
        for (int i = 1; i <= n; i++) { // n->5
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_6(int n) {
        for (int i = 1; i <= n; i++) { // n->5
            // 1<j<=n-i+1
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern_7(int n) {
        for (int i = 0; i < n; i++) { // n->5
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); // spaces
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // stars
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); // spaces
            }
            System.out.println();
        }
    }

    static void pattern_8(int n) {
        for (int i = 0; i < n; i++) { // n->5
            for (int j = 0; j < i; j++) {
                System.out.print(" "); // spaces
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*"); // stars
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" "); // spaces
            }
            System.out.println();
        }
    }

    static void pattern_10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i > n) ? 2 * n - i : i;
            // if (i>n) stars = 2*n-i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*"); // stars
            }
            System.out.println();
        }
    }

    static void pattern_11(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            start = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void pattern_12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // forward numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // reverse numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
            space -= 2;
        }
    }

    static void pattern_13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((num++) + " ");
            }
            System.out.println();
        }
    }

    static void pattern_14(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern_15(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern_16(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i) + " ");
            }
            System.out.println();
        }
    }

    static void pattern_17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" "); // spaces
            }
            char ch = 'A'; // characters
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" "); // spaces
            }
            System.out.println();
        }
    }

    static void pattern_18(int n) {
        for (int i = 0; i < n; i++) {
            // in this pattern here: 'E' => 'A'+n-1 -> (4), when n=5;
            // print each row by: previous chars of 'E' (E-i) till letter 'E'
            for (char ch = (char) ('A' + n - 1 - i); ch <= 'A' + n - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern_19(int n) {
        int iniSpace = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*"); // stars
            }
            for (int j = 0; j < iniSpace; j++) {
                System.out.print(" "); // spaces
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*"); // stars
            }
            iniSpace += 2;
            System.out.println();
        }
        iniSpace = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // stars
            }
            for (int j = 0; j < iniSpace; j++) {
                System.out.print(" "); // spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // stars
            }
            iniSpace -= 2;
            System.out.println();
        }
    }

    static void pattern_20(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i > n) ? 2 * n - i : i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*"); // stars
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" "); // spaces
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*"); // stars
            }
            System.out.println();
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;
        }
    }

    static void pattern_21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("* "); // stars
                else 
                    System.out.print("  "); // spaces
            }
            System.out.println();
        }
    }

    static void pattern_22(int n) {
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top = i;
                int left = j;
                int right = 2*(n-1)-j;
                int bottom = 2*(n-1)-i;
                System.out.print(n-Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader((System.in));
        BufferedReader br = new BufferedReader(in);
        System.out.print("Enter pattern choice (1-22): ");
        int choice = Integer.parseInt(br.readLine());
        System.out.print("Enter number of rows: ");
        int n = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1 -> pattern_1(n);
            case 2 -> pattern_2(n);
            case 3 -> pattern_3(n);
            case 4 -> pattern_4(n);
            case 5 -> pattern_5(n);
            case 6 -> pattern_6(n);
            case 7 -> pattern_7(n);
            case 8 -> pattern_8(n);
            case 10 -> pattern_10(n);
            case 11 -> pattern_11(n);
            case 12 -> pattern_12(n);
            case 13 -> pattern_13(n);
            case 14 -> pattern_14(n);
            case 15 -> pattern_15(n);
            case 16 -> pattern_16(n);
            case 17 -> pattern_17(n);
            case 18 -> pattern_18(n);
            case 19 -> pattern_19(n);
            case 20 -> pattern_20(n);
            case 21 -> pattern_21(n);
            case 22 -> pattern_22(n);    
        }
    }
}
