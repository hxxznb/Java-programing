import java.util.Scanner;

public class lab2task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Please enter the total number of seconds: ");
        int a = scanner.nextInt();
        
        int minutes = a / 60; 
        int remainingSeconds = a % 60;
        
        
        System.out.println(a + " = " + minutes + " minutes and " + remainingSeconds + " seconds.");
        
        scanner.close();
    }
}
