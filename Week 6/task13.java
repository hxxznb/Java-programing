import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int a = 1;
        int k = 1;

        while (k <= num1 && k <= num2) {
            if (num1 % k == 0 && num2 % k == 0) {
                a = k;
            }
            k++;
        }

        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + a);
    }
}
