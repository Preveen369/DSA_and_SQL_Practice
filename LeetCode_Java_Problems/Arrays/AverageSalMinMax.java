package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AverageSalMinMax {
    public double average(int[] salary) {
        int n = salary.length;
        if (n <= 2) return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        for (int sal : salary) {
            if (sal > max)
                max = sal;
            if (sal < min)
                min = sal;
            sum += sal;
        }
        sum = sum - (min + max);
        return sum / (n - 2);
    }

    public static void main(String[] args) throws IOException {
        // Reading input using BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Enter salaries separated by spaces:
        String[] input = br.readLine().split(" ");
        
        // Parse input to an integer array
        int[] salary = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            salary[i] = Integer.parseInt(input[i]);
        }

        // Create an instance of the class and calculate the average
        AverageSalMinMax obj = new AverageSalMinMax();
        double result = obj.average(salary);

        // Print the result (Average salary excluding min and max)
        System.out.println(result);
    }
}
