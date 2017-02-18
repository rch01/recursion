package example.recursion;

/**
 * Collection of methods (iterative and recursive) for calculating the sum of an array of integers.
 */

public class Sum {
    private int sum(int [] a) {
        class SumMore {
            private int sum(int [] a, int i) {
                if (i == a.length) return 0;
                else return a[i] + sum(a, i + 1);
            }
        }

        return new SumMore().sum(a, 0);
    }

    /**
     * @param a array of integers
     * @param endIndex last index of array
     * @return (int) sum of array, recursively.
     */
    private int sumRecursive(int [] a, int endIndex) {
        if (endIndex == -1) return 0;
        else return a[endIndex] + sumRecursive(a, endIndex - 1);
    }

    /**
     * @param a array of integers
     * @return (int) sum of array, iteratively.
     */
    private int sumIterative(int [] a) {
        int sum = 0;

        for (int n : a) {
            sum += n;
        }

        return sum;
    }

    // tests
    public static void main(String [] args) {
        int [] a = {1, 2, 3, 4, 5, 6};
        int [] b = {};
        int [] c = {1};

        Sum s = new Sum();

        System.out.println(s.sumIterative(a));
        System.out.println(s.sum(a));
        System.out.println(s.sumRecursive(a, a.length - 1));

        System.out.println(s.sumIterative(b));
        System.out.println(s.sum(b));
        System.out.println(s.sumRecursive(b, b.length - 1));

        System.out.println(s.sumIterative(c));
        System.out.println(s.sum(c));
        System.out.println(s.sumRecursive(c, c.length - 1));
    }
}
