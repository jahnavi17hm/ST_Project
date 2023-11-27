package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class SortingTest {

    @Test
    public void testBubbleSort() {
        Sorting sorting = new Sorting();

        // Test 1
        List<Integer> arr1 = Arrays.asList(5, 2, 9, 1, 5);
        List<Integer> sortedArr1 = sorting.bubbleSort(arr1);
        assertEquals(Arrays.asList(1, 2, 5, 5, 9), sortedArr1);

        // Test 2
        List<Integer> arr2 = Arrays.asList(3, 8, 1, 0, 4);
        List<Integer> sortedArr2 = sorting.bubbleSort(arr2);
        assertEquals(Arrays.asList(0, 1, 3, 4, 8), sortedArr2);

        // Add more test cases as needed
    }

    @Test
    public void testInsertionSort() {
        Sorting sorting = new Sorting();

        // Test 1
        List<Integer> arr1 = Arrays.asList(5, 2, 9, 1, 5);
        List<Integer> sortedArr1 = sorting.insertionSort(arr1);
        assertEquals(Arrays.asList(1, 2, 5, 5, 9), sortedArr1);

        // Test 2
        List<Integer> arr2 = Arrays.asList(3, 8, 1, 0, 4);
        List<Integer> sortedArr2 = sorting.insertionSort(arr2);
        assertEquals(Arrays.asList(0, 1, 3, 4, 8), sortedArr2);

        // Add more test cases as needed
    }

    @Test
    public void testSelectionSort() {
        Sorting sorting = new Sorting();

        // Test 1
        List<Integer> arr1 = Arrays.asList(5, 2, 9, 1, 5);
        List<Integer> sortedArr1 = sorting.selectionSort(arr1);
        assertEquals(Arrays.asList(1, 2, 5, 5, 9), sortedArr1);

        // Test 2
        List<Integer> arr2 = Arrays.asList(3, 8, 1, 0, 4);
        List<Integer> sortedArr2 = sorting.selectionSort(arr2);
        assertEquals(Arrays.asList(0, 1, 3, 4, 8), sortedArr2);

        // Add more test cases as needed
    }

    @Test
    public void testRadixSort() {
        Sorting sorting = new Sorting();

        // Test 1
        List<Integer> arr1 = Arrays.asList(170, 45, 75, 90, 802, 24, 2, 66);
        List<Integer> sortedArr1 = sorting.radixSort(arr1);
        assertEquals(Arrays.asList(2, 24, 45, 66, 75, 90, 170, 802), sortedArr1);

        // Test 2
        List<Integer> arr2 = Arrays.asList(321, 432, 12, 111, 999, 555);
        List<Integer> sortedArr2 = sorting.radixSort(arr2);
        assertEquals(Arrays.asList(12, 111, 321, 432, 555, 999), sortedArr2);

        // Add more test cases as needed
    }

    @Test
    public void testHeapSort() {
        Sorting sorting = new Sorting();

        // Test 1
        List<Integer> arr1 = Arrays.asList(12, 11, 13, 5, 6, 7);
        List<Integer> sortedArr1 = sorting.heapSort(arr1);
        assertEquals(Arrays.asList(5, 6, 7, 11, 12, 13), sortedArr1);

        // Test 2
        List<Integer> arr2 = Arrays.asList(64, 34, 25, 12, 22, 11, 90);
        List<Integer> sortedArr2 = sorting.heapSort(arr2);
        assertEquals(Arrays.asList(11, 12, 22, 25, 34, 64, 90), sortedArr2);

        // Add more test cases as needed
    }
}
