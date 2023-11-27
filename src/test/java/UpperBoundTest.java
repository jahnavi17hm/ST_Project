package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UpperBoundTest {

    @Test
    public void testUpper() {
        bs2 ub = new bs2();

        // Test 1
        int n1 = 5;
        int[] arr1 = {1, 4, 7, 8, 10};
        int x1 = 7;
        assertEquals(3, ub.upperBound(arr1, x1, n1));

        // Test 2
        int n2 = 12;
        int[] arr2 = {9, 9, 12, 12, 14, 19, 19, 28, 36, 38, 41, 45};
        int x2 = 28;
        assertEquals(8, ub.upperBound(arr2, x2, n2));

        // Test 3 - Element not present in the array
        int n3 = 8;
        int[] arr3 = {2, 5, 8, 12, 18, 21, 27, 30};
        int x3 = 15;
        assertEquals(4, ub.upperBound(arr3, x3, n3));

        // Test 4 - Element greater than all elements in the array
        int n4 = 6;
        int[] arr4 = {1, 3, 5, 7, 9, 11};
        int x4 = 15;
        assertEquals(n4, ub.upperBound(arr4, x4, n4));

        // Test 5 - Element smaller than all elements in the array
        int n5 = 7;
        int[] arr5 = {10, 20, 30, 40, 50, 60, 70};
        int x5 = 5;
        assertEquals(0, ub.upperBound(arr5, x5, n5));

        // Test 6 - Empty array
        int n6 = 0;
        int[] arr6 = {};
        int x6 = 8;
        assertEquals(0, ub.upperBound(arr6, x6, n6));
    }
}

