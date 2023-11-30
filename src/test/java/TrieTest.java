package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class TrieTest {

    @Test
    public void testTrie() {
        Solution solution = new Solution(); // Instantiate Solution class instead of Trie

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(6);
        arr1.add(8);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(7);
        arr2.add(8);
        arr2.add(2);

        int result1 = solution.maxXOR(2, 3, arr1, arr2);
        assertEquals(15, result1);

        ArrayList<Integer> arr11= new ArrayList<>();
        arr11.add(1);
        arr11.add(2);

        ArrayList<Integer> arr21 = new ArrayList<>();
        arr21.add(1);
        arr21.add(1);

        int result2 = solution.maxXOR(2, 2, arr11, arr21);
        assertEquals(3, result2);

        ArrayList<Integer> arr12 = new ArrayList<>();
        arr12.add(0);
        arr12.add(1);

        ArrayList<Integer> arr22 = new ArrayList<>();
        arr22.add(1);
        arr22.add(0);

        int result3 = solution.maxXOR(2, 2, arr12, arr22);
        assertEquals(1, result3);

        ArrayList<Integer> arr5 = new ArrayList<>();
        arr5.add(1);
        arr5.add(3);
        arr5.add(5);

        ArrayList<Integer> arr6 = new ArrayList<>();
        arr6.add(2);
        arr6.add(4);
        arr6.add(6);

        int result4 = solution.maxXOR(3, 3, arr5, arr6);
        assertEquals(7, result4);
    }
}
