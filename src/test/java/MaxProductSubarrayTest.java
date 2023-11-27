package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxProductSubarrayTest {
    @Test
    public void Test_prod() {
        MaxProductSubarray prod = new MaxProductSubarray();

        // Test 1
        int []arr1={1,-2,3,-4};
        assertEquals(24, prod.maxProduct(arr1));

        int []arr2={6};
        assertEquals(6, prod.maxProduct(arr2));

        int []arr3={-1,3,0,-4,3};
        assertEquals(3, prod.maxProduct(arr3));

    }
}
