public class task6 {
    public static void main(String[] args) {


        float[] myList = new float[5];


        for (int i = 0; i < myList.length; i++) {
            myList[i] = (float) Math.random() * 10;
        }


        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }

        float max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }

        System.out.println();
        System.out.print("Largest element in the array is: " + max);
    }
}

