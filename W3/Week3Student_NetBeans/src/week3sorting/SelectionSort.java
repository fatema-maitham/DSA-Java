package week3sorting;

/**
 * Selection Sort repeatedly selects the smallest value from the unsorted part.
 */
public class SelectionSort implements SortAlgorithm {
    @Override
    public String getName() {
        return "Selection Sort";
    }

    @Override
    public String getRealWorldExample() {
        return "Choosing the cheapest product from an unsorted shelf and placing it first.";
    }

    @Override
    public String getTimeComplexity() {
        return "Best: O(n^2), Average: O(n^2), Worst: O(n^2)";
    }

    @Override
    public SortResult sort(int[] data) {
        int[] arr = ArrayUtils.copy(data);
        long comparisons = 0;
        long swaps = 0;

        // TODO 2: Implement Selection Sort in ascending order.
        // Hint:
        // - For each position i, assume i is the index of the minimum value.
        // - Scan the unsorted part to find the real minimum index.
        // - Swap the minimum value with position i.
        // - Count comparisons and swaps.

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                ArrayUtils.swap(arr, i, minIndex);
                swaps++;
            }
        }
        return new SortResult(getName(), arr, comparisons, swaps,
                getTimeComplexity(), ArrayUtils.isSorted(arr));
    }
}
