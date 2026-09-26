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
    }
}
