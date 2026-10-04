package week3sorting;

/**
 * Prints a comparison of the sorting algorithms.
 */
public class ComplexityTable {
    public static void print() {
        System.out.printf("%-18s %-14s %-14s %-14s %-12s %-10s%n",
                "Algorithm", "Best", "Average", "Worst", "Memory", "Stable?");
        System.out.println("--------------------------------------------------------------------------------");

        // TODO 10: Complete the complexity comparison table.
        // Fill the table based on what you learned in Week 3.
        System.out.printf("%-18s %-14s %-14s %-14s %-12s %-10s%n",
                "Bubble", "O(n)", "O(n^2)", "O(n^2)", "O(1)", "Yes");
        System.out.printf("%-18s %-14s %-14s %-14s %-12s %-10s%n",
                "Selection", "O(n^2)", "O(n^2)", "O(n^2)", "O(1)", "No");
        System.out.printf("%-18s %-14s %-14s %-14s %-12s %-10s%n",
                "Insertion", "O(n)", "O(n^2)", "O(n^2)", "O(1)", "Yes");
        System.out.printf("%-18s %-14s %-14s %-14s %-12s %-10s%n",
                "Merge", "O(n log n)", "O(n log n)", "O(n log n)", "O(n)", "Yes");
        System.out.printf("%-18s %-14s %-14s %-14s %-12s %-10s%n",
                "Quick", "O(n log n)", "O(n log n)", "O(n^2)", "O(log n)", "No");
    }
}