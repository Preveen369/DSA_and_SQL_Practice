
/**
 * The problem requires reversing a string in-place, which means directly modifying the input array 
 * without using additional memory for another array. A two-pointer approach works efficiently:

    Place one pointer at the beginning of the array and another at the end.
    Swap the characters at these two pointers.
    Move the pointers closer until they meet.
 */

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        // Two pointer apporach (opp direction)
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        System.out.print(Arrays.toString(s));
    }

    public static void main(String[] args) {
        String str = "Hello";
        char[] strArr = str.toCharArray();
        ReverseString rs = new ReverseString();
        rs.reverseString(strArr);
    }
}