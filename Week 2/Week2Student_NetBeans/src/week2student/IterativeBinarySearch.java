package week2student;

/**
 * TODO 8: Complete iterative binary search.
 */
public class IterativeBinarySearch implements SearchAlgorithm {
    @Override
    public SearchResult search(StudentRecord[] records, int targetId) {
        int left = 0;
        int right = records.length - 1;
        int comparisons = 0;

        // TODO 8:
        // 1. Use while (left <= right).
        // 2. Calculate mid safely: int mid = left + (right - left) / 2;
        // 3. Increase comparisons once for every middle record checked.
        // 4. Compare records[mid].getId() with targetId.
        // 5. Move left or right depending on the comparison.

        return new SearchResult("Binary search iterative", targetId, -1, comparisons);
    }
}
