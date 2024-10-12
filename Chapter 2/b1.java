import java.util.Scanner;
public class b1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a degree in Celsius: ");
        double Celsius=scanner.nextDouble();  
        double Fahrenheit=(9.0/5.0)*Celsius+32;
        System.err.println(Celsius+" Celsius is "+Fahrenheit+" Fahrenheit");
        scanner.close(); 
    }
}
