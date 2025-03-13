import java.util.ArrayList;
import java.util.List;

public class SwitchCheck {
    static double switchCase(int choice, List<Double> arr){
        double area = 0;
        switch (choice) {
            case 1: // area of circle
                area = Math.PI * arr.get(0) * arr.get(0);
                break;
            case 2: // area of rectangle
                area = arr.get(0) * arr.get(1);
                break;
        }
        return area;
    }
    public static void main(String[] args) {
        List<Double> arr = new ArrayList<>();
        arr.add(5.0);
        arr.add(10.0);
        System.out.println(switchCase(2, arr));
    }
}
