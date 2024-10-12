public class task18 {
    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.println("Interest is $: " + interest);
        System.out.printf("Interest with two decimal point is $%4.2f: ", interest);
    }
}
