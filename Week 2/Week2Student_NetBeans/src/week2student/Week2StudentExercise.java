package week2student;

/**
 * Week 2 Student Exercise: DSA, Algorithm Analysis, Recursion, and Searching.
 *
 * Complete the TODO sections in the separate files, then run this main class.
 */
public class Week2StudentExercise {
    public static void main(String[] args) {
        StudentRecord[] records = DatasetFactory.createSortedStudentRecords();

        System.out.println("==============================");
        System.out.println("WEEK 2 JAVA PRACTICE EXERCISE");
        System.out.println("DSA, Analysis, Recursion, Searching");
        System.out.println("==============================\n");

        DatasetPrinter.printDataset(records);
        DSAExplainer.printWhatIsDSA();
        BigOExamples.printBigOExamples();
        OperationCounter.runOperationCountingExamples();
        RecursionExamples.runRecursionExamples();
        SearchDemo.runSearchingExamples(records);

        PracticeTasks.printStudentPracticeTasks();

        // A. Find highest mark
        System.out.println("\nA. Highest mark: "
                + PracticeTasks.findHighestMark(records));

        // B. Count students above 80
        System.out.println("B. Students scoring above 80: "
                + PracticeTasks.countAbove80(records));

        // C. Explain binary search requirement
        System.out.println("C. " 
                + PracticeTasks.explainBinarySearchRequirement());

        // D. Create and print dataset sorted by mark
        StudentRecord[] markSortedRecords =
                PracticeTasks.createMarkSortedDataset(records);

        System.out.println("D. Dataset sorted by mark:");
        DatasetPrinter.printDataset(markSortedRecords);

        // E. Print Big-O
        System.out.println("E. Big-O:");
        PracticeTasks.printBigO();
    }
}