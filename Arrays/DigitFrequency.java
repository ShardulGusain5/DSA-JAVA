package Arrays;

import java.util.Scanner;

/**
 * DigitFrequency
 */
public class DigitFrequency {

    public static int digi(int n, int d) {
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit == d) {
                count++;
            }
            n = n / 10;

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int d = S.nextInt();
        int result = digi(n, d);
        System.out.println(result);

    }
}