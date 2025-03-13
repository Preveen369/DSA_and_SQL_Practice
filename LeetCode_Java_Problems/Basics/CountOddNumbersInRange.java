public class CountOddNumbersInRange {
    public int countOdds(int low, int high) {
        int nums=high-low+1;
        if (low % 2 != 0 && high % 2 != 0)
            return (nums/2) + 1;
        else    
            return (nums/2);
    }
    public static void main(String[] args) {
        CountOddNumbersInRange codd = new CountOddNumbersInRange();
        int res = codd.countOdds(3, 10);
        System.out.println(res);
    }
}
