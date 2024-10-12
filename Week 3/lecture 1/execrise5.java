import java.util.Scanner;

public class execrise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length of the hexagon: ");
        double s = input.nextDouble();

        double area = (3 * Math.sqrt(3) / 2) * Math.pow(s, 2);
        input.close();

        System.out.printf("The area of the hexagon is: %.2f\n", area);
    }
}
