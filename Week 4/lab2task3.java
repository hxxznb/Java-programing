public class lab2task3 {
    public static void main(String[] args) {
        
        int today = 2; 
        
    
        int a = 100 % 7; 
        int b =(today + a) % 7; 
        
        
        String x;
        switch (b) {
            case 0:
                x = "Sunday";
                break;
            case 1:
                x = "Monday";
                break;
            case 2:
                x = "Tuesday";
                break;
            case 3:
                x = "Wednesday";
                break;
            case 4:
                x = "Thursday";
                break;
            case 5:
                x = "Friday";
                break;
            case 6:
                x = "Saturday";
                break;
            default:
                x = "Unknown";
                break;
        }

  
        System.out.println("Today is Tuesday,the day in 100 days is " + x + ".");
    }
}
