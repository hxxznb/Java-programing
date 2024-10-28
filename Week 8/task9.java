public class task9 {
    public static void main(String[] args) {
        int[] myList = new int[5];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int)(Math.random() * myList.length);
        }

        System.out.println("Array before shifting: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
        int temp = myList[0]; 
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];
        }

        myList[myList.length - 1] = temp;

        System.out.println("\nArray after shifting: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
    }
}


