package recursion;

public class fibo {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;  // Base case
        } else {
            return n * factorial(n - 1);  // Recursive case
        }
    }

    public static void main(String[] args) {
        int result = factorial(10);
        System.out.println("Factorial of 10 is: " + result);
    }
}
