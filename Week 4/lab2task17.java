import java.util.Scanner;
public class lab2task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String formattedNumber = String.format("%02d", number);
        System.out.println("Formatted number: " + formattedNumber);
    }
}
