public class task5 {
    public static void main(String[] args) {
       
        int[][] matrix = new int[3][3];

      
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int) (Math.random() * 20);
            }
        }

       
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                total += matrix[row][column];
            }
        }

        System.out.println("The sum is = " + total);
    }
}
