package week2student;

/**
 * TODO 3 and TODO 4: Complete operation-counting examples.
 */
public class OperationCounter {
    public static void runOperationCountingExamples() {
        System.out.println("4) Operation counting examples:");
        int n1 = 5;
        int n2 = 10;
        System.out.println("   countSingleLoopOperations(" + n1 + ") = " + countSingleLoopOperations(n1));
        System.out.println("   countSingleLoopOperations(" + n2 + ") = " + countSingleLoopOperations(n2));
        System.out.println("   countNestedLoopOperations(" + n1 + ") = " + countNestedLoopOperations(n1));
        System.out.println("   countNestedLoopOperations(" + n2 + ") = " + countNestedLoopOperations(n2));
        System.out.println();
    }

    public static int countSingleLoopOperations(int n) {
        int operations = 0;
        // TODO 3: Write one loop from 0 to n - 1.
        // Increment operations once per iteration.
        for (int i = 0; i < n; i++) {
            operations++;
        }
        return operations;
    }

    public static int countNestedLoopOperations(int n) {
        int operations = 0;
        // TODO 4: Write two nested loops, each from 0 to n - 1.
        // Increment operations once inside the inner loop.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                operations++;
            }
        }
        return operations;
    }
}
