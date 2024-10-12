import java.math.BigDecimal;
import java.util.Scanner;

public class lab2task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the purchase amount: ");
        double purch = sc.nextDouble();
        double tax = purch * 0.06;
        BigDecimal taxAmount = new BigDecimal(tax);
        taxAmount =  taxAmount.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("The tax amount is: " + taxAmount);
    }
}
