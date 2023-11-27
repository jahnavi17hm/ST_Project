package org.example;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.util.Arrays;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        MergeSort mergeSort = new MergeSort();

        // Test 1
        int[] arr1 = {3, 5, 1, 6, 4};
        int[] sortedArr1 = mergeSort.performMergeSort(Arrays.copyOf(arr1, arr1.length));
        int[] expectedArr1 = {1, 3, 4, 5, 6};
        assertArrayEquals(expectedArr1, sortedArr1);

        // Test 2
        int[] arr2 = {8, 2, 7, 1, 9};
        int[] sortedArr2 = mergeSort.performMergeSort(Arrays.copyOf(arr2, arr2.length));
        int[] expectedArr2 = {1, 2, 7, 8, 9};
        assertArrayEquals(expectedArr2, sortedArr2);
    }

}
