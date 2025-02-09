package recursion;

import java.util.Arrays;

public class RecursiveFibonacci {
    /**
     * An binary recursive solution. Very inefficient
     * @param k positive integer
     * @return Kth fibonacci sequence
     */
    public static int binaryRecurFib(int k) {
        // extremely inefficient, makes multiple calls recursive calls with the same input
        // (k - 1) calls (k - 2) and (k - 3). (k-2) calls (k-3) and (k - 4).
        // That's (k - 3) being called twice, this repeats with each recursive call.
        if (k <= 1) {
            return k;
        } else {
            return binaryRecurFib(k - 1) + binaryRecurFib(k -2);
        }
    }

    /**
     * Using dynamic programming to store intermediate results in the recursive calls.
     * This makes k-1 recursive calls, unlike binary recursion which makes at least 2^(k/2) calls 
     * @param k , a positive integer
     * @return the kth value of the fibonacci sequence
     */
    public static int[] linearRecurFib(int k) {
        if (k <= 1) {
            return (new int[] {k, 0});
        } else {
            int[] fib = linearRecurFib(k-1);
            return (new int[] {fib[0] + fib[1], fib[0]});
        }
    }

    /**
     * Iterative solution, also very efficient. O(n)
     * @param k positive integer
     * @return kth value of the fibonacci sequence
     */
    public static int iterFib(int k) {
        if (k <=1) return k;
        
        int prev = 0;
        int current = 1;
        int next = prev + current;

        for (int i = 2; i <= k; i++) {
            next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        int binFib = binaryRecurFib(5);
        int[] linFib = linearRecurFib(5);
        int itFib = iterFib(5);

        System.out.println(binFib);
        System.out.println(Arrays.toString(linFib));
        System.out.println(linFib[0]);
        System.out.println(itFib);
    }

}