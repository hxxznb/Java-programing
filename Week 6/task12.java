public class task12 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        System.out.println("The first 50 prime numbers are:");
        while (count < 50) {
            int a = 1;  // 1表示素数，0表示非素数
            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    a = 0;
                    break;
                }
            }

            if (a == 1) {
                System.out.print(num + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }

            num++;
        }
    }
}
