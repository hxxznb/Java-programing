import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        int number1 =(int)(Math.random()*10);
        int number2 =(int)(Math.random()*10);
        Scanner input=new Scanner(System.in);
        System.out.print("What is "+number1+" + " +number2 + "?");
        int anwer=input.nextInt();
        while (number1 + number2 != anwer)   {
            System.out.print("Wrong answer. Try again. What is "+number1+" + " +number2 + "?");
            anwer=input.nextInt();
        }
        System.out.println("You got it!");
    }
}
