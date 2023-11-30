package org.example;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DisjointTest {

    private Disjoint disjoint;

    @Before
    public void setUp() {
        // Initialize the Disjoint object before each test
        disjoint = new Disjoint(5);
    }

    @Test
    public void testUnionByRank() {
        // Test the unionByRank method

        // Initially, all elements are in separate sets
        assertEquals(0, disjoint.rank.get(1).intValue());
        assertEquals(0, disjoint.rank.get(2).intValue());

        disjoint.unionByRank(1, 2);

        // After union, the rank of the root of the smaller tree should increase
        assertEquals(1, disjoint.rank.get(1).intValue());
        assertEquals(0, disjoint.rank.get(2).intValue());
    }

    @Test
    public void testUnionBySize() {
        // Test the unionBySize method

        // Initially, all sets have size 1
        assertEquals(1, disjoint.size.get(1).intValue());
        assertEquals(1, disjoint.size.get(2).intValue());

        disjoint.unionBySize(1, 2);

        // After union, the size of the set with the larger size should increase
        assertEquals(2, disjoint.size.get(1).intValue());
        assertEquals(1, disjoint.size.get(2).intValue());
    }

    @Test
    public void testFindUPar() {
        // Test the findUPar method

        // Initially, all elements are their own parents
        assertEquals(1, disjoint.findUPar(1));
        assertEquals(2, disjoint.findUPar(2));

        disjoint.unionByRank(1, 2);

        // After union, both elements should have the same root/parent
        assertEquals(disjoint.findUPar(1), disjoint.findUPar(2));
    }

    @Test
    public void testUnionByRankAndSize() {
        // Test a combination of unionByRank and unionBySize

        disjoint.unionByRank(1, 2);
        disjoint.unionBySize(3, 4);

        // Add your assertions based on the expected behavior of the combined operations
    }
    @Test
    public void testUnionByRankWithDifferentRanks() {
        // Test the unionByRank method with sets of different ranks

        disjoint.unionByRank(1, 2);
        disjoint.unionByRank(3, 4);

        // Union by rank should increase the rank of the root of the smaller tree with rank 0
        disjoint.unionByRank(1, 3);

        assertEquals(2, disjoint.rank.get(1).intValue());
        assertEquals(0, disjoint.rank.get(2).intValue());
        assertEquals(1, disjoint.rank.get(3).intValue());
        assertEquals(0, disjoint.rank.get(4).intValue());
    }

    @Test
    public void testUnionBySizeWithDifferentSizes() {
        // Test the unionBySize method with sets of different sizes

        disjoint.unionBySize(1, 2);
        disjoint.unionBySize(3, 4);
        disjoint.unionBySize(5, 1);

        // Union by size should increase the size of the set with the larger size
        disjoint.unionBySize(2, 3);

        assertEquals(5, disjoint.size.get(1).intValue());
        assertEquals(1, disjoint.size.get(2).intValue());
        assertEquals(2, disjoint.size.get(3).intValue());
        assertEquals(1, disjoint.size.get(4).intValue());
    }

    @Test
    public void testFindUParWithComplexUnionOperations() {
        // Test the findUPar method with a combination of union operations

        disjoint.unionByRank(1, 2);
        disjoint.unionBySize(3, 4);
        disjoint.unionByRank(1, 3);
        disjoint.unionBySize(2, 4);

        // Ensure that findUPar correctly identifies the root/parent of each element
        assertEquals(disjoint.findUPar(1), disjoint.findUPar(2));
        assertEquals(disjoint.findUPar(3), disjoint.findUPar(4));
    }
}

