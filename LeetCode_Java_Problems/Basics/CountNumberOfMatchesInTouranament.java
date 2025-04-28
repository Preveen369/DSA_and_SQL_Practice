package basics;
public class CountNumberOfMatchesInTouranament {
    public static int numberOfMatches(int n) {
        int matches = 0;
        int numberOfMatches = 0;
        while (n != 1){
            if (n%2==0){
                numberOfMatches = n/2;
                matches += numberOfMatches;
                n = n/2;
            } else{
                numberOfMatches = (n-1)/2;
                matches += numberOfMatches;
                n = (n-1)/2 + 1;
            }
        }
        if (n==1) return matches;
        return 0;      
    }

    public static void main(String[] args) {
        int n = 7; 
        int result = numberOfMatches(n);
        System.out.println("Number of matches: " + result);
    }
}
