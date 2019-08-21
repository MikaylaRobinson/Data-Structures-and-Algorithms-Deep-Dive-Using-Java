public class Main {

    public static void main(String[] args) {
        // This is one implementation of the bubble sort algorithm.
        // Bubble sort loops through all values and compares the values adjacent to
        // each other. If the left value is larger, it is swapped to the right.
        // Once the loop is done once through, the largest value is at the highest index.
        // The array is then theoretically divided between unsorted and sorted. This partition
        // moves one element with every full iteration through the array. The bubble sort is
        // done once the partition reaches the far left side (lowest index).
        // The big O notation for this algorithm is O(n^2) due to the nested loop.
        // This displays quadratic time complexity.
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i ++) {
            System.out.println(intArray[i]);
        }
    }

    // This is our swap method that will be carrying out the movement
    // of our elements as we use bubble sort
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
