public class task15 {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 5};
        printArray(myArray); 
        System.out.println();
        printArray(new int[] {3, 1, 2, 6, 4, 2}); 
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
