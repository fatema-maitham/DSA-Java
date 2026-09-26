package week2student;

/**
 * TODO 5 and TODO 6: Complete recursive methods.
 */
public class RecursionExamples {
    public static void runRecursionExamples() {
        System.out.println("5) Recursion examples:");
        System.out.println("   recursiveSum(5) = " + recursiveSum(5));
        System.out.println("   factorial(5) = " + factorial(5));
        System.out.println("   countdown(4):");
        countdown(4);
        System.out.println();
    }

    public static int recursiveSum(int n) {
        // TODO 5: Complete this recursive method.
        // Base case: if n <= 0, return 0.
        // Recursive case: return n + recursiveSum(n - 1).
        if (n <= 0) {
          return 0;
        }
    return n + recursiveSum(n - 1);
    }

    public static int factorial(int n) {
        // TODO 6: Complete this recursive method.
        // Base case: if n <= 1, return 1.
        // Recursive case: return n * factorial(n - 1).
       if (n <= 1) {
        return 1;
    }
    return n * factorial(n - 1);
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("      Done!");
            return;
        }
        System.out.println("      " + n);
        countdown(n - 1);
    }
}
