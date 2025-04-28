package basics;
public class SubstringMatchingPattern{
    public static boolean isMatchingPattern(String s, String p){
        int startIndex = p.indexOf('*');
        
        String prefix = p.substring(0, startIndex);
        String suffix = p.substring(startIndex+1);
        
        for (int i=0; i<= s.length()-prefix.length(); i++){
            if (s.startsWith(prefix, i)){
                for (int j=i+prefix.length(); j<=s.length()-suffix.length();j++){
                    if (s.startsWith(suffix, j)){
                        return true;    
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String p = "ee*e";
        System.out.println(isMatchingPattern(s, p)); // Output: true
    }
}