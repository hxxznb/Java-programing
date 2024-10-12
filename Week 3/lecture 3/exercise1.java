import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 90) + 10;
        Scanner input = new Scanner(System.in);
        System.out.print("please input your guess: ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is: " + lottery);

        if (guess == lottery) {
            System.out.println("Execise is correct, you win $10,000");
        } else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)) {
            System.out.println("Matching two digits, you win $3,000");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("Matching one digit, you win $1,000");
        } else {
            System.out.println("Sorry, you lose");
        }

        input.close();
    }
}
