package org.recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private int fibMem(int n) {
        Map<Integer, Integer> c = new HashMap<>();

        if (n == 0 || n == 1) return n;
        else if (c.containsKey(n)) return c.get(n);
        else {
            c.put(n, fibMem(n - 1) + fibMem(n - 2));
            return c.get(n);
        }
    }

    private int fibRecursive(int n) {
        if (n == 0 || n == 1) return n;
        else return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    private int fibIterative(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 0;

        for (int i = 2; i <= n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }

        return fn;
    }

    // tests
    public static void main(String [] args) {
        Fibonacci f = new Fibonacci();

        System.out.println("fibMem: " + f.fibMem(83));
        System.out.println("fibIterative: " + f.fibIterative(100));
        System.out.println("fibRecursive: " + f.fibRecursive(80));
    }
}
