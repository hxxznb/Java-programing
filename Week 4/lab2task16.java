import java.util.Scanner;

public class lab2task16 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = input.nextInt();

            boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            System.out.println(year + " is " + (leapYear ? "" : "not ") + "a leap year");
        }
}
