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

        // TODO 9:
        // Base case: if left > right, target is not found.
        // Recursive case:
        // - calculate mid
        // - increase comparisons
        // - return found result if id matches
        // - if target is greater than middle id, search right half
        // - otherwise, search left half

        return new SearchResult("Binary search recursive", targetId, -1, comparisons);
    }
}
