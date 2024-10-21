import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示用户输入两个整数
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        // 计算并显示最大公约数
        int gcd = computeGCD(num1, num2);
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
    }

    // 计算GCD的方法
    public static int computeGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

