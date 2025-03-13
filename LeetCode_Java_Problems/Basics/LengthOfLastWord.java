import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LengthOfLastWord{
    public int lengthOfLastWord(String s) {
        // String[] parts = s.split(" ");
        // return parts[parts.length-1].length();s = s.trim();
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        return length;
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        LengthOfLastWord obj = new LengthOfLastWord();
        String input = bf.readLine();
        int length = obj.lengthOfLastWord(input);
        System.out.println(length);
    }
}