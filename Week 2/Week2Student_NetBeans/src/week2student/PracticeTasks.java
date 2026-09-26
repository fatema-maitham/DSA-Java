package week2student;

public class PracticeTasks {

    public static void printStudentPracticeTasks() {
        System.out.println("7) Extra practice tasks for students:");
        System.out.println("   A. Add a method to find the highest mark using linear scan.");
        System.out.println("   B. Add a recursive method to count how many students scored above 80.");
        System.out.println("   C. Explain why binary search cannot be used if the array is not sorted by id.");
        System.out.println("   D. Create another dataset sorted by mark and search by mark.");
        System.out.println("   E. Write the Big-O for every method you completed.");
    }

    // A. Find the highest mark using linear scan
    public static double findHighestMark(StudentRecord[] records) {
        double highest = records[0].getMark();

        for (int i = 1; i < records.length; i++) {
            if (records[i].getMark() > highest) {
                highest = records[i].getMark();
            }
        }

        return highest;
    }

    // B. Recursively count students who scored above 80
    public static int countAbove80(StudentRecord[] records) {
        return countAbove80Recursive(records, 0);
    }

    private static int countAbove80Recursive(StudentRecord[] records, int index) {
        if (index == records.length) {
            return 0;
        }

        if (records[index].getMark() > 80) {
            return 1 + countAbove80Recursive(records, index + 1);
        }

        return countAbove80Recursive(records, index + 1);
    }

    // C. Explanation of why binary search needs sorted data
    public static String explainBinarySearchRequirement() {
        return "Binary search requires sorted data because it uses the middle value "
                + "to decide which half of the array can be ignored.";
    }

    // D. Create a dataset sorted by mark
    public static StudentRecord[] createMarkSortedDataset(StudentRecord[] records) {
        StudentRecord[] sorted = records.clone();

        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j].getMark() > sorted[j + 1].getMark()) {
                    StudentRecord temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        return sorted;
    }

    // E. Big-O of the completed methods
    public static void printBigO() {
        System.out.println("   findHighestMark: O(n)");
        System.out.println("   countAbove80: O(n)");
        System.out.println("   explainBinarySearchRequirement: O(1)");
        System.out.println("   createMarkSortedDataset: O(n^2)");
        System.out.println("   Linear search: O(n)");
        System.out.println("   Iterative binary search: O(log n)");
        System.out.println("   Recursive binary search: O(log n)");
    }
}