package week3sorting;

/**
 * Insertion Sort grows a sorted part from left to right.
 */
public class InsertionSort implements SortAlgorithm {
    @Override
    public String getName() {
        return "Insertion Sort";
    }

    @Override
    public String getRealWorldExample() {
        return "Sorting playing cards in your hand by inserting each new card into the correct position.";
    }

    @Override
    public String getTimeComplexity() {
        return "Best: O(n), Average: O(n^2), Worst: O(n^2)";
    }

    @Override
    public SortResult sort(int[] data) {
        int[] arr = ArrayUtils.copy(data);
        long comparisons = 0;
        long moves = 0;

        // TODO 3: Implement Insertion Sort in ascending order.
        // Hint:
        // - Start from index 1.
        // - Store arr[i] in a variable called key.
        // - Shift larger values to the right.
        // - Insert key in its correct position.
        // - Count comparisons and moves/shifts.

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;

                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    moves++;
                    j--;
                } else {
                    break;
                }
            }

            arr[j + 1] = key;
        }

        return new SortResult(getName(), arr, comparisons, moves,
                getTimeComplexity(), ArrayUtils.isSorted(arr));
    }
}