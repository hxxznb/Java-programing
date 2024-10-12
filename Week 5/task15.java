import java.util.Scanner;  

public class task15 {  
    public static void main(String[] args) {  
          
        Scanner scanner = new Scanner(System.in);  

        
        System.out.print("Enter the name of the first city: ");  
        String city1 = scanner.nextLine();  

        
        System.out.print("Enter the name of the second city: ");  
        String city2 = scanner.nextLine();  

        
        if (city1.compareTo(city2) < 0) {  
            System.out.println("Cities in alphabetical order: " + city1 + ", " + city2);  
        } else {  
            System.out.println("Cities in alphabetical order: " + city2 + ", " + city1);  
        }  
 
        scanner.close();  
    }  
}