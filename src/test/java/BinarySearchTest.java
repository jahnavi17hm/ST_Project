package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void Test_Lower() {
        bs_1 lb = new bs_1();

        // Test 1

        int n1=5;
        int []arr1 = {1,2,4,5,6};
        int lb1 = 7;
        assertEquals(5, lb.lowerBound(arr1,n1,lb1));

        // Test 2
        int n2=5;
        int []arr2 = {1,2,4,5,6};
        int lb2 = 4;
        assertEquals(2, lb.lowerBound(arr2,n2,lb2));
    }
}
