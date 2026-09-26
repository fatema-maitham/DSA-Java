package week2student;

public class DatasetPrinter {
    public static void printDataset(StudentRecord[] records) {
        System.out.println("1) Dataset used in this exercise:");
        for (int i = 0; i < records.length; i++) {
            System.out.println("   index " + i + ": " + records[i]);
        }
        System.out.println();
    }
}
