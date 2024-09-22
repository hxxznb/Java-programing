public class a11 {
    public static void main(String[] args) {
        int people=312032486;
        double birth=7.0;
        double death=13.0;
        double p=45.0;
        int time=365*24*60*60;
        double birthpeople=time/birth;
        double deathpeople=time/death;
        double ppeople=time/p;
        double oneyear=birthpeople-deathpeople+ppeople;
        System.out.printf("Population: %f\n",people+oneyear);
        System.out.printf("Population: %f\n",people+oneyear*2);
        System.out.printf("Population: %f\n",people+oneyear*3);
        System.out.printf("Population: %f\n",people+oneyear*4);
        System.out.printf("Population: %f\n",people+oneyear*5);
    }
}
