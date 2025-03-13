public class ToLowerCase {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if(ch>='A' && ch <='Z')
                ch = (char) (ch + 32);
            result.append(ch);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        ToLowerCase tlw = new ToLowerCase();
        String res = tlw.toLowerCase("Hello");
        System.out.println(res);
    }
}
