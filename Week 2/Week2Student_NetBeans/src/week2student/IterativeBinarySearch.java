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

        while (left <= right) {
            int mid = left + (right - left) / 2;
            comparisons++;

            if (records[mid].getId() == targetId) {
                return new SearchResult("Binary search iterative", targetId, mid, comparisons);
            } else if (records[mid].getId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new SearchResult("Binary search iterative", targetId, -1, comparisons);
    }
}