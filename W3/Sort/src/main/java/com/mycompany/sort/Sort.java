package com.mycompany.sort;

import java.util.Arrays;

public class Sort {

     // Method 1: Bubble Sort
    public static void bubbleSort(int[] a){
        for (int i = 0; i < a.length - 1; i++)
        {
            boolean swapped = false;
            for (int j = 0; j < a.length - 1 - i; j++)
            {
                if (a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    
    
    // Method 2: Selection Sort
    public static void selectionSort(int[] a){
        for (int i = 0; i < a.length - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++)
            {
                if(a[j]< a[minIndex])
                {
                    minIndex=j;
                }
            }
            
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
    
    // Method 3: Insertion Sort
    public static void insertionSort(int[] a){
        for(int i = 1; i < a.length; i++)
        {
            int key = a[i];
            int j = i - 1;
            
            while(j>=0 && a[j]> key)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
    
    // Method 4: Merge Sort
    public static void mergeSort(int[] a, int left, int right)
    {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(a, left, right);
    }
    
    public static void main(String[] args) {
        // Bubble Sort
        int[] arr1 = {4, 3, 2, 1};

        System.out.println("Before Bubble Sort: " + Arrays.toString(arr1));

        bubbleSort(arr1);

        System.out.println("After Bubble Sort: " + Arrays.toString(arr1));


        // Selection Sort
        int[] arr2 = {4, 3, 2, 1};

        System.out.println("\nBefore Selection Sort: " + Arrays.toString(arr2));

        selectionSort(arr2);

        System.out.println("After Selection Sort: " + Arrays.toString(arr2));

        // Insertion Sort
        int[] arr3 = {5, 2, 4};

        System.out.println("\nBefore Insertion Sort: " + Arrays.toString(arr3));

        insertionSort(arr3);

        System.out.println("After Insertion Sort: " + Arrays.toString(arr3));

    }
}
