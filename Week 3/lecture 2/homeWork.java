import java.util.Scanner;
public class homeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;
        System.out.print("Enter number of years: ");
        int numberofYears = input.nextInt();
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberofYears * 12));
        double totalPayment = monthlyPayment * numberofYears * 12;
        System.out.println("Monthly payment: " + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("Total payment: " + (int)(totalPayment * 100) / 100.0);
        input.close();
}
}
