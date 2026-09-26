package week2student;

/**
 * TODO 2: Complete the Big-O answers.
 */
public class BigOExamples {
    public static void printBigOExamples() {
        System.out.println("3) Big-O examples:");
        System.out.println("   One loop over n items: " + bigOOneLoop());
        System.out.println("   Two nested loops over n items: " + bigONestedLoops());
        System.out.println("   Binary search on sorted data: " + bigOBinarySearch());
        System.out.println("   Direct array access arr[i]: " + bigODirectAccess());
        System.out.println();
    }

    public static String bigOOneLoop() {
        // TODO 2A: Return the correct Big-O notation and a short reason.
        return "O(n) - the loop runs once for each item.";
    }

    public static String bigONestedLoops() {
        // TODO 2B: Return the correct Big-O notation and a short reason.
        return "O(n^2) - the nested loops perform about n times n operations.";
    }

    public static String bigOBinarySearch() {
        // TODO 2C: Return the correct Big-O notation and a short reason.
        return "O(log n) - the search range is approximately halved each step.";
    }

    public static String bigODirectAccess() {
        // TODO 2D: Return the correct Big-O notation and a short reason.
        return "O(1) - the element is accessed directly by its index.";
    }
}
