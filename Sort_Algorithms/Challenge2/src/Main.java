public class Main {

    // Challenge 2: Making the insertion sort example recursive
    public static void main(String[] args) {
        // This is an implementation of insertion sort. The unsorted and sorted portions are
        // partitioned off. This works by assessing each element in the unsorted portion and comparing
        // it each value in the sorted portion until the conditions are met for it to be in its
        // ordered position. The element is then inserted into that position.
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        insertionSort(intArray, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void insertionSort(int[] input, int items) {

        if (items < 2) {
            return;
        }

        insertionSort(input, items - 1);

        int newElement = input[items - 1];

        int i;
        for (i = items - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }

        input[i] = newElement;

    }
}
