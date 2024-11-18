public class task13 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        int maxRowIndex = 0;
        int maxRowCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRowIndex = i;
            }
        }

        int maxColumnIndex = 0;
        int maxColumnCount = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            int columnCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    columnCount++;
                }
            }
            if (columnCount > maxColumnCount) {
                maxColumnCount = columnCount;
                maxColumnIndex = j;
            }
        }

        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColumnIndex);
    }
}
