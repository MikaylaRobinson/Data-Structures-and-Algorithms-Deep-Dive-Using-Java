public class Main {

    public static void main(String[] args) {
        // This is an implementation of merge sort.
	    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

	    mergeSort(intArray, 0, intArray.length);

	    for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        // partitioning of array
        int mid = (start + end) / 2;

        // merge sorting the left partition of the array
        mergeSort(input, start, mid);

        // right partition
        mergeSort(input, mid, end);

        // Merging the left and right partitions
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
