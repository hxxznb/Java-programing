public class task14 {
    public static void main(String[] args) {
        double tuition = 10000;
        double a = tuition * 2;
        int years = 0;

        while (tuition < a) {
            tuition *= 1.07;
            years++;
        }

        System.out.println("Tuition will be doubled in " + years + " years");
        System.out.printf("Tuition will be $%.2f in %d years\n", tuition, years);
    }
}
