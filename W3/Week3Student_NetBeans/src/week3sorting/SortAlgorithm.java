package week3sorting;

/**
 * Common interface for all sorting algorithms used in this exercise.
 */
public interface SortAlgorithm {
    String getName();
    String getRealWorldExample();
    String getTimeComplexity();
    SortResult sort(int[] data);
}
