package week2student;

/**
 * TODO 9: Complete recursive binary search.
 */
public class RecursiveBinarySearch implements SearchAlgorithm {
    @Override
    public SearchResult search(StudentRecord[] records, int targetId) {
        return searchRecursive(records, targetId, 0, records.length - 1, 0);
    }

    private SearchResult searchRecursive(StudentRecord[] records, int targetId,
            int left, int right, int comparisons) {

        if (left > right) {
            return new SearchResult("Binary search recursive", targetId, -1, comparisons);
        }

        int mid = left + (right - left) / 2;
        comparisons++;

        if (records[mid].getId() == targetId) {
            return new SearchResult("Binary search recursive", targetId, mid, comparisons);
        }

        if (targetId > records[mid].getId()) {
            return searchRecursive(records, targetId, mid + 1, right, comparisons);
        } else {
            return searchRecursive(records, targetId, left, mid - 1, comparisons);
        }
    }
}