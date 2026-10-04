package week3sorting;

/**
 * Main class used to test all Week 3 sorting algorithms.
 */
public class MainApp {
    public static void main(String[] args) {
        int[] assessmentMarks = {72, 45, 89, 61, 50, 95, 38};
        int[] reversedData = {9, 8, 7, 6, 5, 4, 3};

        SortAlgorithm[] algorithms = {
            new BubbleSort(),
            new SelectionSort(),
            new InsertionSort(),
            new MergeSort(),
            new QuickSort()
        };

        System.out.println("WEEK 3 SORTING EXERCISE");
        System.out.println("=======================\n");

        ArrayUtils.printArray("Original assessment marks: ", assessmentMarks);
        System.out.println();

        for (SortAlgorithm algorithm : algorithms) {
            System.out.println("-----------------------------");
            System.out.println(algorithm.sort(assessmentMarks));
            System.out.println("Real-world example: " + algorithm.getRealWorldExample());
            System.out.println();
        }

        System.out.println("COMPLEXITY COMPARISON");
        System.out.println("=====================");
        ComplexityTable.print();

        System.out.println("\nExtra test with reversed data:");
        ArrayUtils.printArray("Original reversed data: ", reversedData);
        System.out.println(new BubbleSort().sort(reversedData));
    }
}
