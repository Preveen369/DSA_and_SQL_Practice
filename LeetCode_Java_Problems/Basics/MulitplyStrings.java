import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MulitplyStrings{
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int n1 = num1.length(), n2 = num2.length();
        int[] result = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = n2 - 1; j >= 0; j--) {
                result[i + j + 1] += d1 * (num2.charAt(j) - '0');
            }
        }
        for (int i = result.length - 1, carry = 0, sum; i >= 0; i--) {
            sum = result[i] + carry;
            carry = sum / 10;
            result[i] = sum % 10 + '0';
        }
        int i = result[0] == '0' ? 1 : 0;
        return new String(result, i, result.length - i);
    }

    public static void main(String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        String num1 = bf.readLine();
        String num2 = bf.readLine();
        MulitplyStrings ms = new MulitplyStrings();
        System.out.println(ms.multiply(num1, num2));
    }
}