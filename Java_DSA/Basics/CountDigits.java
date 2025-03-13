public class CountDigits {
    // static int evenlyDivides(int n) {
    //     int count = 0;
    //     int orig_num = n;
    //     while(n>0){
    //         int d = n % 10;
    //         if (d!=0 && orig_num%d==0)
    //             count = count + 1;
    //         n = n / 10;
    //     }
    //     return count;
    // }

    /* Formula for counting no. of digits in num (n) 
        => (int) Math.log10(n) + 1;
        => String.valueOf(num).length() */ 

    static int evenlyDivides(int n) {
        int count = 0, orig_num = n;
        for (int i = (int) Math.log10(n) + 1; i > 0; i--, n /= 10) {
            int d = n % 10;
            if (d!=0 && orig_num%d==0) count = count + 1;
        }
        return count;
    }


    public static void main(String[] args) {
        int res = evenlyDivides(2446);
        System.out.println(res);
    }
}