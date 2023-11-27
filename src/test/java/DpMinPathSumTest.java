package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DpMinPathSumTest
{
    @Test
    public void Test_MinSum() {
        DpMinPathSum min_sum = new DpMinPathSum();

        // Test 1
        int n1 = 4;
        int m1 = 3;
        int[][] arr1 = {
                {8, 1, 6},
                {4, 4, 16},
                {2, 7, 20},
                {20, 7, 20}
        };

        assertEquals(47, min_sum.minSumPath(n1, m1, arr1));
    }
}
