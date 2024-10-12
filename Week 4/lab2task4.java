import java.util.Scanner;

public class lab2task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and the length of the clinder:");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double area = Math.PI * radius * radius;
        double volume = area * length;
        System.out.println("The area of the clinder is " + area);
        System.out.println("The volume of the clinder is " + volume);
    }
}
