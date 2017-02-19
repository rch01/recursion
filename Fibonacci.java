package example.recursion;

public class Fibonacci {
    private int fibRecursive(int n) {
        if (n == 0 || n == 1) return n;
        else return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    private int fibIterative(int n) {
        int [] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    // tests
    public static void main(String [] args) {
        Fibonacci f = new Fibonacci();

        System.out.println(f.fibRecursive(5));
        System.out.println(f.fibIterative(5));
    }
}
