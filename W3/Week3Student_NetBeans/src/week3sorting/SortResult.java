package week3sorting;

import java.util.Arrays;

/**
 * Stores the output produced by one sorting algorithm.
 */
public class SortResult {
    private final String algorithmName;
    private final int[] sortedData;
    private final long comparisons;
    private final long moves;
    private final String complexity;
    private final boolean sorted;

    public SortResult(String algorithmName, int[] sortedData, long comparisons,
                      long moves, String complexity, boolean sorted) {
        this.algorithmName = algorithmName;
        this.sortedData = sortedData;
        this.comparisons = comparisons;
        this.moves = moves;
        this.complexity = complexity;
        this.sorted = sorted;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public int[] getSortedData() {
        return sortedData;
    }

    public long getComparisons() {
        return comparisons;
    }

    public long getMoves() {
        return moves;
    }

    public String getComplexity() {
        return complexity;
    }

    public boolean isSorted() {
        return sorted;
    }

    @Override
    public String toString() {
        return algorithmName + "\n"
                + "Sorted data : " + Arrays.toString(sortedData) + "\n"
                + "Comparisons : " + comparisons + "\n"
                + "Moves/Swaps : " + moves + "\n"
                + "Complexity  : " + complexity + "\n"
                + "Sorted?     : " + sorted + "\n";
    }
}
