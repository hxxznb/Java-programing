import java.util.Scanner;

public class execrise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance to drive (miles): ");
        double distance = input.nextDouble();


        System.out.print("Enter the fuel efficiency (miles per gallon): ");
        double fuelEfficiency = input.nextDouble();


        System.out.print("Enter the price per gallon: ");
        double pricePerGallon = input.nextDouble();
        input.close();
        double cost = (distance / fuelEfficiency) * pricePerGallon;

        System.out.printf("The cost of the trip is: $%.2f\n", cost);
    }
}
