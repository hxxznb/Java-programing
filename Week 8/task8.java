public class task8 {
    public static void main(String[] args) {
        int[] myList = new int[10];

        System.out.println("Array before shuffling: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int)(Math.random() * myList.length);
            System.out.print(myList[i] + " ");
        }
        System.out.println("\nArray after shuffling: ");
        for (int i = 0; i < myList.length; i++) {
            int j = (int)(Math.random() * myList.length);
            int temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
            System.out.print(myList[i] + " ");
        }
    }
}




