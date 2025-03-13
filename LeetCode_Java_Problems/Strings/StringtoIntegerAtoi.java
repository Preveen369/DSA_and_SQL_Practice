public class StringtoIntegerAtoi {
    public int myAtoi(String s) {
        int sign = 1, res = 0, idx = 0;
        
        // Skip leading whitespaces
        while (idx < s.length() && s.charAt(idx) == ' ')
            idx += 1;

        // Handle the sign
        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            char firstSign = s.charAt(idx);
            idx += 1;
            
            // Check for multiple consecutive signs
            if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
                return 0; // Invalid input with multiple signs
            }

            sign = (firstSign == '-') ? -1 : 1;
        }
        
        // Convert digits to integer
        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = 10 * res + (s.charAt(idx++) - '0');
        }
        
        return res * sign;
    }
}
