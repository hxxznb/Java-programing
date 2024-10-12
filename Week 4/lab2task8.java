import java.util.Scanner;

public class lab2task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the hexagon: ");
        double length = sc.nextDouble();
        double g3 = Math.sqrt(3);
        double area = length * length * 1.5 * g3;
        System.out.println("The area of the hexagon is " + area);


    }
}
