public class Main {

    public static void main(String[] args) {
        // Creating an array of integers
        // You must define the size of the array, it is not a dynamic data structure
        int[] intArray = new int[7];

        // An array index begins at 0
        // Assigning a value to each position in the array
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        // Finding an element in the array when you do not know the index.
        // This has big O notation of O(n). The amount of elements directly
        // influences the amount of steps required to complete the operation.
        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                System.out.println("Found it!");
            }
        }
        System.out.println("index of 7 = " + index);
    }
}
