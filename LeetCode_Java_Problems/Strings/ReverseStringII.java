public class ReverseStringII {
    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);

            // Reverse first k characters in the 2k segment
            while (left < right) {
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        ReverseStringII rsII = new ReverseStringII();
        System.out.println(rsII.reverseStr("abcdefg", 2));
    }
}
