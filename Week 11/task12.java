import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
            double sum = sumColumn(matrix, columnIndex);
            System.out.println("Sum of the elements at column " + columnIndex + " is " + sum);
        }
        input.close();
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
