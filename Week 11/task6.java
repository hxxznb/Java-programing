public class task6 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int) (Math.random() * 20);
            }
        }
        int maxOfRow = 0;
        int indexOfMaxRow = 0;
        
        for (int column = 0; column < matrix[0].length; column++) {
            maxOfRow += matrix[0][column];
        }
        int totalOfThisRow = 0;
        for (int row = 1; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                totalOfThisRow += matrix[row][column];
            }
            if (totalOfThisRow > maxOfRow) {
                maxOfRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }  
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxOfRow);
    }
}
