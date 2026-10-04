package week3sorting;

/**
 * Quick Sort chooses a pivot and partitions values around it.
 */
public class QuickSort implements SortAlgorithm {
    private long comparisons;
    private long swaps;

    @Override
    public String getName() {
        return "Quick Sort";
    }

    @Override
    public String getRealWorldExample() {
        return "Organising books by choosing one book as a pivot, then placing smaller books before it and larger books after it.";
    }

    @Override
    public String getTimeComplexity() {
        return "Best: O(n log n), Average: O(n log n), Worst: O(n^2)";
    }

    @Override
    public SortResult sort(int[] data) {
        int[] arr = ArrayUtils.copy(data);
        comparisons = 0;
        swaps = 0;

        // TODO 7: Call quickSort(arr, 0, arr.length - 1).

        quickSort(arr, 0, arr.length - 1);

        return new SortResult(getName(), arr, comparisons, swaps,
                getTimeComplexity(), ArrayUtils.isSorted(arr));
    }

    private void quickSort(int[] arr, int low, int high) {
        // TODO 8: Implement recursive quick sort.
        // Hint:
        // - If low < high, partition the array.
        // - Recursively sort values before and after the pivot.

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // TODO 9: Implement partition using arr[high] as the pivot.
        // Hint:
        // - Move smaller values to the left side.
        // - Put the pivot in its correct final position.

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            comparisons++;

            if (arr[j] <= pivot) {
                i++;

                ArrayUtils.swap(arr, i, j);
                swaps++;
            }
        }

        ArrayUtils.swap(arr, i + 1, high);
        swaps++;

        return i + 1;
    }
}