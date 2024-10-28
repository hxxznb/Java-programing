public class task5 {
    public static void main(String[] args) {

        double[] myList = new double[5];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 10;
        }
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
            total += myList[i];
        }

        System.out.println();
        System.out.print("Sum of all elements is: " + total);
    }
}
