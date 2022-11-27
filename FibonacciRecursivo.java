public class FibonacciRecursivo {

    public static int fibonacciR(int  n) {
        if ((n == 1) || (n == 0)) {
            return n;
        }
        return fibonacciR(n - 1) + fibonacciR(n - 2);
    }
}