public class Main {

    public static void main(String[] args) {
        // This is an implementation of counting sort. It assumes that
        // the values are within a certain range. It uses a temporary array
        // to count the occurrences of each possible value.
	    int[] intArray = {2, 5, 9, 8, 7, 10, 4, 3 };

	    countingSort(intArray, 1, 10);
	    for (int i = 0; i < intArray.length; i ++) {
            System.out.println(intArray[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            // index of where to count each value
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
