package com.mycompany.week3;

public class Week3 {

    // Method 1: Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // already sorted, stop early
        }
    }

    // Method 2: Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the found minimum with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Method 3: Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];       // element to be inserted into the sorted part
            int j = i - 1;
            // shift elements bigger than key one position to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // insert key into its correct spot
        }
    }

    // Method 4: Merge Sort
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        mergeSortHelper(arr, 0, arr.length - 1);
    }

    private static void mergeSortHelper(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortHelper(arr, left, mid);       // sort left half
            mergeSortHelper(arr, mid + 1, right);  // sort right half
            merge(arr, left, mid, right);          // merge the two sorted halves
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) { arr[k] = leftArr[i]; i++; k++; }
        while (j < n2) { arr[k] = rightArr[j]; j++; k++; }
    }

    // Method 5: Quick Sort
    public static void quickSort(int[] arr) {
        if (arr.length < 2) return;
        quickSortHelper(arr, 0, arr.length - 1);
    }

    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSortHelper(arr, low, pivotIndex - 1);  // sort left of pivot
            quickSortHelper(arr, pivotIndex + 1, high); // sort right of pivot
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1;       // boundary of elements smaller than pivot

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // place pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        // ---- Bubble Sort ----
        int[] arr1 = {5, 3, 1, 2, 4};
        System.out.println("Before Bubble Sort: " + java.util.Arrays.toString(arr1));
        bubbleSort(arr1);
        System.out.println("After Bubble Sort:  " + java.util.Arrays.toString(arr1));

        // ---- Selection Sort ----
        int[] arr2 = {5, 3, 1, 2, 4};
        System.out.println("\nBefore Selection Sort: " + java.util.Arrays.toString(arr2));
        selectionSort(arr2);
        System.out.println("After Selection Sort:  " + java.util.Arrays.toString(arr2));

        // ---- Insertion Sort ----
        int[] arr3 = {5, 3, 1, 2, 4};
        System.out.println("\nBefore Insertion Sort: " + java.util.Arrays.toString(arr3));
        insertionSort(arr3);
        System.out.println("After Insertion Sort:  " + java.util.Arrays.toString(arr3));

        // ---- Merge Sort ----
        int[] arr4 = {5, 3, 1, 2, 4};
        System.out.println("\nBefore Merge Sort: " + java.util.Arrays.toString(arr4));
        mergeSort(arr4);
        System.out.println("After Merge Sort:  " + java.util.Arrays.toString(arr4));

        // ---- Quick Sort ----
        int[] arr5 = {5, 3, 1, 2, 4};
        System.out.println("\nBefore Quick Sort: " + java.util.Arrays.toString(arr5));
        quickSort(arr5);
        System.out.println("After Quick Sort:  " + java.util.Arrays.toString(arr5));
    }
}