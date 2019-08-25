public class Main {

    public static void main(String[] args) {
        // This is an implementation of radix sort. All data must have same radix and width.
        // Radix sort sorts based on each individual digit or letter position.
	    int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

	    radixSort(radixArray, 10, 4);

	    for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }
    }

   public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
   }

   public static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;

        int[] countArray = new int[radix];
        for (int value: input) {
            countArray[getDigit(position, value, radix)]++;
        }
        // Adjusting the count array to count all values that have that digit or less than that digit
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        // Copy the values into a temporary array
        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }
       for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
           input[tempIndex] = temp[tempIndex];
       }
   }

   public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(10, position) % radix;
   }
}
