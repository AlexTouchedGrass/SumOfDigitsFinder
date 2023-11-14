import java.util.Scanner;
import java.lang.Math;

public class SumOfDigitsFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        boolean valid = true;

        System.out.println("Please enter a number.");
        num = scan.nextInt();

        if (num < 0) {
            num = num * -1;
        }

        while (num>0) {
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println(sum);
    }
}
