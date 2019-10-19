public class Main {

    // There are two versions of binary search below.
    // One uses recursion, the other is iterative, both accomplish the same thing
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 35));
        System.out.println(iterativeBinarySearch(intArray, 8888));
        System.out.println(iterativeBinarySearch(intArray, 1));

        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(recursiveBinarySearch(intArray, 8888));
        System.out.println(recursiveBinarySearch(intArray, 1));


    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            // With logical partitioning, we look at the midpoint of the array first
            int midpoint = (start + end)/2;
            // If the midpoint is the value we are searching for, then we return it
            if (input[midpoint] == value) {
                return midpoint;
            }
            // If midpoint is less than the value, then we look at the right side of the divided array
            else if (input[midpoint] < value) {
                start = midpoint + 1;
            }
            // If midpoint is greater than the value, we look at the left side of the divided array
            else {
                end = midpoint;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }
        int midpoint = (start + end) /2;

        if (input[midpoint] == value) {
            return midpoint;
        }
        else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        }
        else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }
}
