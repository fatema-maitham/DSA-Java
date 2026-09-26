package week2student;

public class SortedChecker {
    public static boolean isSortedById(StudentRecord[] records) {
        for (int i = 1; i < records.length; i++) {
            if (records[i - 1].getId() > records[i].getId()) {
                return false;
            }
        }
        return true;
    }
}
