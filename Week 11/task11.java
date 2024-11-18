public class task11 {
    public static void main(String[] args) {
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        int[][] totalHours = new int[hours.length][2];

        for (int i = 0; i < hours.length; i++) {
            int sum = 0;
            for (int j = 0; j < hours[i].length; j++) {
                sum += hours[i][j];
            }
            totalHours[i][0] = sum;
            totalHours[i][1] = i;
        }

        for (int i = 0; i < totalHours.length; i++) {
            for (int j = i + 1; j < totalHours.length; j++) {
                if (totalHours[i][0] < totalHours[j][0]) {
                    int temp = totalHours[i][0];
                    totalHours[i][0] = totalHours[j][0];
                    totalHours[j][0] = temp;
    
                    int temp2 = totalHours[i][1];
                    totalHours[i][1] = totalHours[j][1];
                    totalHours[j][1] = temp2;
                }
            }
        }

        System.out.println("Employee total hours in descending order:");
        for (int i = 0; i < totalHours.length; i++) {
            System.out.println("Employee " + (totalHours[i][1] + 1) + ": " + totalHours[i][0] + " hours");
        }
    }
}
