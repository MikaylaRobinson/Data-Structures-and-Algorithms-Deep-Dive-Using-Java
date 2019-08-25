public class Main {

    public static void main(String[] args) {
        // This is an implementation of quick sort. The array is separated
        // into two subarrays based on a decided pivot element. All values
        // smaller than the pivot element are place to the left and all greater are
        // placed to the right. Both of those subarrays are sorted and then the
        // total array will be sorted.
	    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

	    quickSort(intArray, 0, intArray.length);

	    for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
	    }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            // return because you are only dealing with a one element array
            // which by nature is already sorted.
            return;
        }

        int pivotIndex = partition(input, start, end);

        // Sorting the items to the left of the pivot
        quickSort(input, start, pivotIndex);
        // Sorting the items to the right of thr pivot
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This implementation uses the first element as the pivot.
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
