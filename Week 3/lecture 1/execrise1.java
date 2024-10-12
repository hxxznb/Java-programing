import java.util.Scanner;

public class execrise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        input.close();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.printf("The area is %.4f\n", area);
        System.out.printf("The volume is %.1f\n", volume);

        
    }
}
