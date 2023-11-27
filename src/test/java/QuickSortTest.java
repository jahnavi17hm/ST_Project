package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class QuickSortTest
{
    @Test
    public void Sort1() {
        QuickSort s1 = new QuickSort();

        // Test 1
        List<Integer> arr1 = Arrays.asList(1, 4, 7, 8, 10);

        List<Integer> sortedArr1 = s1.quickSort(arr1);

        // Assuming you want to check if the array is sorted
        assertEquals(Arrays.asList(1, 4, 7, 8, 10), sortedArr1);

        // Test 2
        List<Integer> arr2 = Arrays.asList(1, 5, 7, 2, 11);

        List<Integer> sortedArr2 = s1.quickSort(arr2);

        // Assuming you want to check if the array is sorted
        assertEquals(Arrays.asList(1, 2, 5, 7, 11), sortedArr2);

        // Test 2
        List<Integer> arr3 = Arrays.asList(4,3,8,4,6,5);

        List<Integer> sortedArr3 = s1.quickSort(arr3);

        // Assuming you want to check if the array is sorted
        assertEquals(Arrays.asList(3,4,4,5,6,8), sortedArr3);
    }
}
