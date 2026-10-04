package week3sorting;

/**
 * Merge Sort uses divide and conquer: split, sort, and merge.
 */
public class MergeSort implements SortAlgorithm {
    private long comparisons;
    private long moves;

    @Override
    public String getName() {
        return "Merge Sort";
    }

    @Override
    public String getRealWorldExample() {
        return "Two groups of sorted exam papers are merged into one final sorted pile.";
    }

    @Override
    public String getTimeComplexity() {
        return "Best: O(n log n), Average: O(n log n), Worst: O(n log n)";
    }

    @Override
    public SortResult sort(int[] data) {
        int[] arr = ArrayUtils.copy(data);
        comparisons = 0;
        moves = 0;

        // TODO 4: Call mergeSort(arr, 0, arr.length - 1).

        mergeSort(arr, 0, arr.length - 1);

        return new SortResult(getName(), arr, comparisons, moves,
                getTimeComplexity(), ArrayUtils.isSorted(arr));
    }

    private void mergeSort(int[] arr, int left, int right) {
        // TODO 5: Implement the recursive merge sort method.
        // Hint:
        // - If left < right, find mid.
        // - Recursively sort the left half.
        // - Recursively sort the right half.
        // - Call merge(arr, left, mid, right).

        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        // TODO 6: Merge two sorted parts:
        // left part  = arr[left ... mid]
        // right part = arr[mid + 1 ... right]
        // Hint: create temporary arrays, compare front values, and copy back.

        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftSize && j < rightSize) {
            comparisons++;

            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }

            moves++;
            k++;
        }

        while (i < leftSize) {
            arr[k] = leftArray[i];
            i++;
            k++;
            moves++;
        }

        while (j < rightSize) {
            arr[k] = rightArray[j];
            j++;
            k++;
            moves++;
        }
    }
}