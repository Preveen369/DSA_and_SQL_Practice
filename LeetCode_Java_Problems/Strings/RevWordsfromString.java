import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RevWordsfromString {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        reverseArray(str);
        return String.join(" ", str);
    }

    public static void reverseArray(String[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) throws IOException {
        // Reading input using BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Enter a string:
        String input = br.readLine();

        // Create an instance of the class and reverse the words
        RevWordsfromString obj = new RevWordsfromString();
        String result = obj.reverseWords(input);

        // Print the "Reversed string" 
        System.out.println(result);
    }
}
