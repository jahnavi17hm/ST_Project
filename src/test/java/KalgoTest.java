package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class KalgoTest {

    @Test
    public void testKosaraju() {
        KalgoMain obj = new KalgoMain();
        // Test Case 1: Simple graph with 3 nodes forming one strongly connected component
        int n1 = 3;
        int[][] edges1 = {{0, 1}, {1, 2}, {2, 0}};
        ArrayList<ArrayList<Integer>> adj1 = createAdjacencyList(n1, edges1);
        int ans1 = obj.kosaraju(n1, adj1);
        assertEquals(1, ans1);
//
//        int n2 = 3;
//        int[][] edges2 = {{1, 0}, {0, 2}, {2, 1},{0,3},{3,4}};
//        ArrayList<ArrayList<Integer>> adj2 = createAdjacencyList(n1, edges1);
//        int ans2 = obj.kosaraju(n2, adj2);
//        assertEquals(3, ans2);
    }

    private ArrayList<ArrayList<Integer>> createAdjacencyList(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        return adj;
    }
}
