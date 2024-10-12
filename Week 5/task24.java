import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();

       
        char ch = input.charAt(0);

            
        if (Character.isLetter(ch)) {
            
            char lowerChar = Character.toLowerCase(ch);
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || 
                lowerChar == 'o' || lowerChar == 'u') {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }
        } else {
            System.out.println(ch + " is an invalid input");
        }
        

        scanner.close();
    }
}
