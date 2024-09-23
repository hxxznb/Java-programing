public class a10 {  
    public static void main(String[] args) {  
        double KM = 14.0;  
        int minutes = 45;  
        int seconds = 30; 
        double totaltime = minutes / 60.0 + seconds / 3600.0;  
        double speedKM= KM / totaltime;  
        double speedMiles = speedKM / 1.6;  
        System.out.println("Average speed: "+speedMiles+" miles per hour");  
    }  
}
