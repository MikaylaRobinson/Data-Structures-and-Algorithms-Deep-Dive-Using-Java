public class Main {

    public static void main(String[] args) {
        System.out.println(interativeFactorial(3));
        System.out.println(recursiveFactorial(3));
    }

    // First, there is an example of factorial algorithm that is iterative
    // and does not include recursion.
    public static int interativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // This method is recursive because it calls the method within the method
    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num -1);
    }
}
