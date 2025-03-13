public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int orignum = x, revnum = 0;
        if (x<0)
            return false;
        while (x!=0){
            int digit = x % 10;
            revnum = (revnum * 10) + digit;
            x = x / 10;      
        }
        return (orignum == revnum)?true:false; 
    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalindrome(121));
    }
}
