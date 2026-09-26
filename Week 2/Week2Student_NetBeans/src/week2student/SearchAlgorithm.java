package week2student;

/**
 * Interface for any search algorithm that searches by student id.
 */
public interface SearchAlgorithm {
    SearchResult search(StudentRecord[] records, int targetId);
}
