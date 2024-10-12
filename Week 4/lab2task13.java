import java.util.Scanner;
public class lab2task13 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter pay: ");
            double pay = input.nextDouble();
            System.out.print("Enter score: ");
            double score = input.nextDouble();


            double raise;
            if (score > 90) {
                pay = pay * 1.03;
            } else {
                pay = pay * 1.01;
            }
            System.out.println("your new pay is " + pay);
        }
    }
