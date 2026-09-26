package week2student;

/**
 * Stores the search output and the number of comparisons.
 */
public class SearchResult {
    private String algorithmName;
    private int targetId;
    private int index;
    private int comparisons;

    public SearchResult(String algorithmName, int targetId, int index, int comparisons) {
        this.algorithmName = algorithmName;
        this.targetId = targetId;
        this.index = index;
        this.comparisons = comparisons;
    }

    @Override
    public String toString() {
        String foundText = index >= 0 ? "Found at index " + index : "Not found";
        return algorithmName + " | target=" + targetId + " | " + foundText
                + " | comparisons=" + comparisons;
    }
}
