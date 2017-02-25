package org.recursion;

public class Max {

    private int maxRecursive(int [] a) {
        class Largest {
            private int l(int n, int [] a, int i) {
                if (i == a.length) return n;
                else return l(Math.max(n, a[i]), a, i + 1);
            }
        }

        return new Largest().l(0, a, 0);
    }

    private int maxIterative(int [] a) {
        int n = 0;

        for (int i : a) {
            if (i > n) n = i;
        }

        return n;
    }

    public static void main(String [] args) {
        int [] a = {2, 6, 85, 10, 1, 0};
        int [] b = {};
        int [] c = {95};

        Max m = new Max();

        System.out.println(m.maxIterative(a));
        System.out.println(m.maxRecursive(a));
    }
}
