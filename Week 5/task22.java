import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 to 15): ");
        int a = scanner.nextInt();

        if (a >= 0 && a <= 15) {
            String hex = Integer.toHexString(a).toUpperCase();
            System.out.println("The hex value is " + hex);
        } else {
            System.out.println(a + " is an invalid input");
        }

        scanner.close();
    }
}
