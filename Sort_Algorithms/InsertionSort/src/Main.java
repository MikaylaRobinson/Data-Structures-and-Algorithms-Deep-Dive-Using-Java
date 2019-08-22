public class Main {

    public static void main(String[] args) {
        // This is an implementation of insertion sort. The unsorted and sorted portions are
        // partitioned off. This works by assessing each element in the unsorted portion and comparing
        // it each value in the sorted portion until the conditions are met for it to be in its
        // ordered position. The element is then inserted into that position. 
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
             firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
