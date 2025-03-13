import java.util.HashSet;

public class CheckIfExist {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            if (set.contains(2*arr[i]) || (arr[i] % 2 == 0 && set.contains(arr[i] / 2)))
                return true;
            set.add(arr[i]);
            }
            return false;
        }

    public static void main(String[] args) {
        CheckIfExist ck = new CheckIfExist();
        int arr[] = new int[]{-1, 8 ,9, 4};
        boolean res = ck.checkIfExist(arr);
        System.out.println(res);
    }
}
