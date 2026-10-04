package week3sorting;

import java.util.Arrays;

/**
 * Helper methods used by different sorting classes.
 */
public class ArrayUtils {
    public static int[] copy(int[] data) {
        return Arrays.copyOf(data, data.length);
    }

    public static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static boolean isSorted(int[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i - 1] > data[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(String label, int[] data) {
        System.out.println(label + Arrays.toString(data));
    }
}
