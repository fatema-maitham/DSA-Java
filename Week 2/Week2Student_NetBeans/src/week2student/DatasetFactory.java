package week2student;

/**
 * Creates the dataset used in this exercise.
 * The records are sorted by id, so binary search can be used.
 */
public class DatasetFactory {
    public static StudentRecord[] createSortedStudentRecords() {
        return new StudentRecord[] {
            new StudentRecord(1001, "Ali", 72.5),
            new StudentRecord(1003, "Sara", 89.0),
            new StudentRecord(1007, "Noor", 91.5),
            new StudentRecord(1012, "Omar", 66.0),
            new StudentRecord(1020, "Lina", 78.5),
            new StudentRecord(1025, "Zaid", 84.0),
            new StudentRecord(1030, "Huda", 95.0)
        };
    }
}
