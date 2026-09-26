package week2student;

/**
 * TODO 7: Complete linear search.
 */
public class LinearSearch implements SearchAlgorithm {
    @Override
    public SearchResult search(StudentRecord[] records, int targetId) {
        int comparisons = 0;

        // TODO 7:
        // 1. Loop through all records from index 0 to records.length - 1.
        // 2. Increase comparisons once for every record checked.
        // 3. If the id matches targetId, return a SearchResult with that index.
        // 4. If not found, return index -1.
        for (int i = 0; i < records.length; i++) {
            comparisons++;

            if (records[i].getId() == targetId) {
                return new SearchResult("Linear search", targetId, i, comparisons);
            }
        }
        
        return new SearchResult("Linear search", targetId, -1, comparisons);
    }
}
