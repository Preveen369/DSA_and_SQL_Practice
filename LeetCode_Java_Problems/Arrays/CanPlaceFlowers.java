package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;

        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    n--;
                    flowerbed[i] = 1; // planted
                    i += 2;
                } else {
                    i++;
                }
            } else {
                i += 2;
            }
        }

        return (n <= 0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Enter the flowerbed array (space-separated 0s and 1s):
        int[] flowerbed = Arrays.stream(br.readLine().split(" "))
                                 .mapToInt(Integer::parseInt)
                                 .toArray();

        // Enter the number of flowers to place: 
        int n = Integer.parseInt(br.readLine());

        CanPlaceFlowers cpf = new CanPlaceFlowers();
        boolean result = cpf.canPlaceFlowers(flowerbed, n);

        // Result of "Can place flowers" 
        System.out.println(result);
    }
}
