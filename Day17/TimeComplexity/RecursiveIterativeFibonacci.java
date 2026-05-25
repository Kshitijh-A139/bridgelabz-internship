package TimeComplexity;

public class RecursiveIterativeFibonacci {
    public static void main(String[] args) {
        int n = 40;

        long recursiveStart = System.nanoTime();
        int recursiveResult = fibonacciRecursive(n);
        long recursiveEnd = System.nanoTime();

        long iterativeStart = System.nanoTime();
        int iterativeResult = fibonacciIterative(n);
        long iterativeEnd = System.nanoTime();

        System.out.println("Recursive Result: " + recursiveResult);
        System.out.println("Recursive Time: "
                + (recursiveEnd - recursiveStart) + " ns");

        System.out.println("Iterative Result: " + iterativeResult);
        System.out.println("Iterative Time: " + (iterativeEnd - iterativeStart) + " ns");
    }

    public static int fibonacciRecursive(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        int a = 0;
        int b = 1;
        int sum;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }
}
