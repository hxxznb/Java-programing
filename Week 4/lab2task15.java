import java.util.Scanner;

public class lab2task15 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        
        num=input.nextInt();
        
        if(num%2==0||num%3==0)
        {
            System.out.println(num+"is divisible by 2 or 3.");
        }
        if(num%2==0&&num%3==0)
        {
            System.out.println(num+"is divisible by 2 and 3");
        }
        if(num%2==0^num%3==0)
        {
            System.out.println(num+"is divisible by 2 or 3,but not both");
        }
    }
}
