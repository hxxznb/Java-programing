public class a12 {
    public static void main(String[] args) {
        double KM = 24.0;
        int hour = 1;  
        int minutes = 40;  
        int seconds = 35; 
        double totaltime = hour + minutes / 60.0 + seconds / 3600.0;  
        double speedKM= KM / totaltime;  
        double speedMiles = speedKM / 1.6;  
        System.out.println("Average speed: "+speedMiles+" miles per hour");
    }
}
