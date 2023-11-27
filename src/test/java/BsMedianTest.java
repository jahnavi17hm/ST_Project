package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BsMedianTest
{
    @Test
    public void Median() {
        BsMedian med = new BsMedian();

        // Test 1
        int[] arr1 = {2, 4, 6};
        int[] arr2 = {1, 3, 5};
        assertEquals(3.5, med.median(arr1, arr2), 0.001); // Use a delta value

        // Test 2
        int[] arr3 = {1, 2, 2};
        int[] arr4 = {2, 4, 4};
        assertEquals(2.0, med.median(arr3, arr4), 0.001); // Use a delta value

        // Test 3
        int[] arr5 = {1, 4, 8, 10, 10, 13, 13};
        int[] arr6 = {3, 4, 9, 9, 11, 13, 15, 16};
        assertEquals(10.0, med.median(arr5, arr6), 0.001);

        // Test 4 - Arrays with a single element
        int[] arr7 = {7};
        int[] arr8 = {5};
        assertEquals(6.0, med.median(arr7, arr8), 0.001);

        // Test 5 - Arrays with all elements equal
        int[] arr9 = {3, 3, 3};
        int[] arr10 = {3, 3, 3, 3};
        assertEquals(3.0, med.median(arr9, arr10), 0.001);

        // Test 6 - Arrays with no common elements
        int[] arr11 = {1, 2, 3};
        int[] arr12 = {4, 5, 6};
        assertEquals(3.5, med.median(arr11, arr12), 0.001);
    }
}
