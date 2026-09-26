package week2student;

public class SearchDemo {
    public static void runSearchingExamples(StudentRecord[] records) {
        System.out.println("6) Searching examples:");
        int firstId = 1001;
        int middleId = 1012;
        int lastId = 1030;
        int missingId = 9999;

        System.out.println("   Is dataset sorted by id? " + SortedChecker.isSortedById(records));

        SearchAlgorithm linear = new LinearSearch();
        SearchAlgorithm iterativeBinary = new IterativeBinarySearch();
        SearchAlgorithm recursiveBinary = new RecursiveBinarySearch();

        System.out.println("   " + linear.search(records, firstId));
        System.out.println("   " + linear.search(records, middleId));
        System.out.println("   " + linear.search(records, lastId));
        System.out.println("   " + linear.search(records, missingId));
        System.out.println();

        System.out.println("   " + iterativeBinary.search(records, firstId));
        System.out.println("   " + iterativeBinary.search(records, middleId));
        System.out.println("   " + iterativeBinary.search(records, lastId));
        System.out.println("   " + iterativeBinary.search(records, missingId));
        System.out.println();

        System.out.println("   " + recursiveBinary.search(records, 1025));
        System.out.println();
    }
}
