public class AddStrings {
    // Approach - 1
    // public static int convert(String x){
    //     int num = 0;
    //     for(int j=0; j < x.length(); j++) 
    //         num = num * 10 + ((int)x.charAt(j) - 48); 
    //     return num;
    // }

    // public String addStrings(String num1, String num2) {
    //     int numF = convert(num1);
    //     int numS = convert(num2);
        
    //     return String.valueOf(numF+numS);

    // }

    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0; 
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0; 

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;                 
            result.append(sum % 10);          

            i--; 
            j--;
        }
        return result.reverse().toString(); 
    }

    public static void main(String[] args) {
        AddStrings as = new AddStrings();
        String num1 = "6913259244", num2 = "71103343";
        System.out.println(as.addStrings(num1, num2));

    }
}
