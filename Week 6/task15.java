import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String ch = input.nextLine();

        int l = 0;
        int r = ch.length() - 1;

        int a = 1;

        while (l < r) {
            if (ch.charAt(l) != ch.charAt(r)) {
                a = 0;
                break;
            }
            l++;
            r--;
        }

        if (a==1) {
            System.out.println(ch + " is a palindrome.");
        } else {
            System.out.println(ch + " is not a palindrome.");
        }
    }
}
