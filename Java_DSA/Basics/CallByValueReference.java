public class CallByValueReference {
    static int[] passedBy(int a, int b) {
        // to make changes in values of original array
        a = a + 1;
        b = b + 2;
        return new int[]{a,b};
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println("before change: " + arr[0] + " " + arr[1]);
        arr = passedBy(arr[0], arr[1]); // pass by value of reference
        System.out.println("After change: " + arr[0] + " " + arr[1]);
    }
}
