public class ReverseInteger {
    public int reverse(int x) {
        int num = Math.abs(x);  // to return magnitude of x
        int revnum = 0;
        while (num!=0){
            int digit = num % 10;
            //  If reversing x goes outside of range [-2^31, 2^31 - 1], then return 0.
            if (revnum > (Integer.MAX_VALUE - digit) / 10) return 0; 
            revnum = (revnum * 10) + digit;
            num = num / 10;
        }
        // append the reversed num with original sign 
        return (x<0)? (-revnum):revnum; 
    }
    public static void main(String[] args) {
        ReverseInteger rn = new ReverseInteger();
        int res = rn.reverse(-7789);
        System.out.println(res);
    }
}
