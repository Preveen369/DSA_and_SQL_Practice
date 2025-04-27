package arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr, int num){
        int size = arr.length;
        for (int i=0; i<size; i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 4;
        int result = linearSearch(arr, target);
        System.out.println(result);
    }
}
