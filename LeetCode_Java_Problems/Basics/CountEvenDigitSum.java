public class CountEvenDigitSum {
    public int countEven(int num) {
        int sum = 0, parity = 0;
        sum = num % 10 + (num/10) % 10 + (num/100) % 10 + (num/1000) % 10;
        // order of parity reverts every 10 numbers, since:
        // num % 10 == 0, means  digit sum has same parity with same of previous
        // else, the digit sum has parity alongwith same of previous + 1
        if (sum % 2 == 0 && num % 2 == 0) parity = 1; else parity = 0;
        return (num - 1) / 2 + parity;
    }
    public static void main(String[] args) {
        CountEvenDigitSum ce = new CountEvenDigitSum();
        int res = ce.countEven(123);
        System.out.println(res);
    }
}
