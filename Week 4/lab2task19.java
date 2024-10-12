import java.util.Random;
import java.util.Scanner;

public class lab2task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter number: ");
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        System.out.println("What is " + num1 + " + " + num2 + "?");
        int sum = num1 + num2;

        int num3 = sc.nextInt();

        if(sum == num3)
            System.out.println("True");
        else
            System.out.println("False");

    }
}

