import java.util.Scanner;

public class lab2task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double weightKg = weight * 0.45359237;
        double heightM = height * 0.0254;
        double bmi = weightKg / (heightM * heightM);

        System.out.println("BMI is " + bmi);
    }
}
