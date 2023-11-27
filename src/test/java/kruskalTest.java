package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class kruskalTest {

    @Test
    public void testSpanningTree() {
        kruskal k = new kruskal();
        kruskal.Solution solution = k.new Solution();

        // Test 1
        int v1 = 6;
        ArrayList<ArrayList<ArrayList<Integer>>> adj1 = new ArrayList<>();
        // Populate adj1 with the given graph data
        adj1.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 6)))));
        adj1.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 3, 5)))));
        adj1.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(3, 4, 4)))));
        adj1.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 4, 1)))));
        adj1.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 3, 2)))));
        adj1.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(3, 5, 3)))));

        int result1 = solution.spanningTree(v1, adj1);
        assertEquals(17, result1); // The expected result may vary based on the specific graph.

        // Add more test cases as needed
        // Test 2
        int v2 = 7;
        ArrayList<ArrayList<ArrayList<Integer>>> adj2 = new ArrayList<>();
        adj2.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 4)))));
        adj2.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 3, 1)))));
        adj2.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 4, 2)))));
        adj2.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(3, 1, 1)))));
        adj2.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(5, 4, 3)))));
        adj2.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(5, 6, 1)))));
        adj2.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(6, 4, 5)))));

        int result2 = solution.spanningTree(v2, adj2);
        assertEquals(9, result2);

        int v3 = 4;
        ArrayList<ArrayList<ArrayList<Integer>>> adj3 = new ArrayList<>();
        // Populate adj3 with the given graph data
        adj3.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 1, 2)))));
        adj3.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 4)))));
        adj3.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 3, 1)))));
        adj3.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 3, 5)))));

        int result3 = solution.spanningTree(v3, adj3);
        assertEquals(3, result3);

        // Test 4
        int v4 = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> adj4 = new ArrayList<>();
        adj4.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 1, 2)))));
        adj4.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 3)))));
        adj4.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 3, 1)))));
        adj4.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(3, 4, 4)))));
        adj4.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(4, 0, 5)))));

        int result4 = solution.spanningTree(v4, adj4);
        assertEquals(0, result4);

        // Test 5
        int v5 = 3;
        ArrayList<ArrayList<ArrayList<Integer>>> adj5 = new ArrayList<>();
        adj5.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 1, 1)))));
        adj5.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 2)))));
        adj5.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 0, 3)))));

        int result5 = solution.spanningTree(v5, adj5);
        assertEquals(0, result5);

        // Test 6
        int v6 = 8;
        ArrayList<ArrayList<ArrayList<Integer>>> adj6 = new ArrayList<>();
        adj6.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 1, 3)))));
        adj6.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 2, 2)))));
        adj6.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 1)))));
        adj6.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 3, 4)))));
        adj6.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 3, 5)))));
        adj6.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(3, 4, 2)))));
        adj6.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(4, 5, 3)))));
        adj6.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(5, 6, 1)))));
        adj6.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(6, 7, 2)))));

        int result6 = solution.spanningTree(v6, adj6);
        assertEquals(25, result6);

        int v7 = 4;
        ArrayList<ArrayList<ArrayList<Integer>>> adj7 = new ArrayList<>();
        adj7.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 1, 2)))));
        adj7.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 1)))));
        adj7.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 3, 3)))));
        adj7.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(3, 0, 4)))));

        int result7 = solution.spanningTree(v7, adj7);
        assertEquals(0, result7);

        // Test 8
        int v8 = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> adj8 = new ArrayList<>();
        adj8.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 1, 3)))));
        adj8.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 2)))));
        adj8.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 3, 1)))));
        adj8.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(3, 4, 4)))));
        adj8.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(4, 0, 5)))));

        int result8 = solution.spanningTree(v8, adj8);
        assertEquals(0, result8);


        // Test 9
        int v9 = 6;
        ArrayList<ArrayList<ArrayList<Integer>>> adj9 = new ArrayList<>();
        adj9.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 1, 2)))));
        adj9.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 2, 4)))));
        adj9.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 3, 3)))));
        adj9.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 3, 1)))));
        adj9.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 4, 5)))));
        adj9.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(3, 5, 2)))));
        adj9.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(4, 5, 3)))));

        int result9 = solution.spanningTree(v9, adj9);
        assertEquals(17, result9);
    }
}
