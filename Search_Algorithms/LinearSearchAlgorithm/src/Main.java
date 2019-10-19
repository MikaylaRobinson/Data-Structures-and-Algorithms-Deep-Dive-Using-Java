public class Main {

    public static void main(String[] args) {
//        Linear search: You increment the index by one and traverse the entire array
//        until you reach your desired value
	    int[] intArray = {20, 35, -15, 1, -22};

        System.out.println(linearSearch(intArray, -15));
        System.out.println(linearSearch(intArray, -1));
        System.out.println(linearSearch(intArray, 8888));
        System.out.println(linearSearch(intArray, -22));
    }

    public static int linearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
