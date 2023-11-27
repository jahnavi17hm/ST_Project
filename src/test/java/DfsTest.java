package org.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DfsTest {

    @Test
    public void testGraphAlgorithms() {
        // Test Case 1
        Dfs.Graph graph1 = new Dfs.Graph();
        graph1.addEdge(0, 1);
        graph1.addEdge(1, 2);
        graph1.addEdge(2, 0);
        graph1.addEdge(3, 4);
        graph1.addEdge(4, 5);
        assertEquals(2, graph1.numberOfComponents());
        assertFalse(graph1.isBipartite());
        assertTrue(graph1.hasCycle());

        // Test Case 3 - Bipartite Graph
        Dfs.Graph graph2 = new Dfs.Graph();
        graph2.addEdge(0, 1);
        graph2.addEdge(1, 2);
        graph2.addEdge(2, 3);
        assertTrue(graph2.isBipartite());
        assertFalse(graph2.hasCycle());

        // Test Case 4 - Empty Graph
        Dfs.Graph emptyGraph = new Dfs.Graph();
        assertEquals(0, emptyGraph.numberOfComponents());
//        assertFalse(emptyGraph.isBipartite());
        assertFalse(emptyGraph.hasCycle());

        // Test Case 6 - Graph with Self Loop
        Dfs.Graph selfLoopGraph = new Dfs.Graph();
        selfLoopGraph.addEdge(0, 0);
        assertTrue(selfLoopGraph.hasCycle());
        assertFalse(selfLoopGraph.isBipartite());

        // Test Case 7 - Graph with Multiple Cycles
        Dfs.Graph multiCycleGraph = new Dfs.Graph();
        multiCycleGraph.addEdge(0, 1);
        multiCycleGraph.addEdge(1, 2);
        multiCycleGraph.addEdge(2, 0);
        multiCycleGraph.addEdge(3, 4);
        multiCycleGraph.addEdge(4, 5);
        multiCycleGraph.addEdge(5, 3);
        assertTrue(multiCycleGraph.hasCycle());
        assertFalse(multiCycleGraph.isBipartite());
    }
}
