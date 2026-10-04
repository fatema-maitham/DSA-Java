package week3sorting;

/**
 * Bubble Sort compares adjacent elements and swaps them when needed.
 */
public class BubbleSort implements SortAlgorithm {
    @Override
    public String getName() {
        return "Bubble Sort";
    }

    @Override
    public String getRealWorldExample() {
        return "Arranging students by mark by repeatedly comparing two neighbouring students.";
    }

    @Override
    public String getTimeComplexity() {
        return "Best: O(n), Average: O(n^2), Worst: O(n^2)";
    }

    @Override
    public SortResult sort(int[] data) {
        int[] arr = ArrayUtils.copy(data);
        long comparisons = 0;
        long swaps = 0;

        // TODO 1: Implement Bubble Sort in ascending order.
        // Hint:
        // - Use nested loops.
        // - Compare arr[j] with arr[j + 1].
        // - Swap if the left value is greater than the right value.
        // - Count each comparison and each swap.
        // - Optional: stop early if a pass has no swaps.

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                comparisons++;

                if (arr[j] > arr[j + 1]) {
                    ArrayUtils.swap(arr, j, j + 1);
                    swaps++;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        return new SortResult(getName(), arr, comparisons, swaps,
                getTimeComplexity(), ArrayUtils.isSorted(arr));
    }
}
