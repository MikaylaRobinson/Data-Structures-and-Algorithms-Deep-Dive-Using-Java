public class Main {

    public static void main(String[] args) {
	    // This is an implementation of shell sort. This is a variation on insertion sort.
        // This goal of this variation is to reduce the amount of shifting than is required
        // by insertion sort. Shell sort begins by comparing elements that are further apart,
        // sorting those, and then using insertion sort to finish.
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

	    for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

	        for (int i = gap; i < intArray.length; i++) {
	            int newElement = intArray[i];

	            int j = i;
	            while (j >= gap && intArray[j - gap] > newElement) {
	                intArray[j] = intArray[j - gap];
	                j -= gap;
                }

	            intArray[j] = newElement;
            }
        }

	    for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
