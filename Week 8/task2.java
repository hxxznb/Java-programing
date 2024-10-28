import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        double[] myList = new double[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + myList.length + " values");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }
        input.close();
    }
}
