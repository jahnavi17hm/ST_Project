package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FractionalTest {

    @Test
    public void testFractionalKnapsack() {
        // Test case 1
        Item[] items1 = { new Item(60, 10), new Item(100, 20), new Item(120, 30) };
        int capacity1 = 50;
        assertEquals(240.0, Fractional.fractionalKnapsack(capacity1, items1, items1.length), 0.001);

        // Test case 2
        Item[] items2 = { new Item(40, 5), new Item(100, 10), new Item(50, 20) };
        int capacity2 = 15;
        assertEquals(140.0, Fractional.fractionalKnapsack(capacity2, items2, items2.length), 0.001);

        // Test case 3
        Item[] items3 = { new Item(10, 2), new Item(5, 3), new Item(15, 5) };
        int capacity3 = 8;
        assertEquals(26.666666666666668, Fractional.fractionalKnapsack(capacity3, items3, items3.length), 0.001);

        // Add more test cases as needed
    }
    @Test
    public void testFractionalKnapsackWithEmptyItems() {
        // Test case with an empty array of items
        Item[] items1 = {};
        int capacity1 = 50;
        assertEquals(0.0, Fractional.fractionalKnapsack(capacity1, items1, items1.length), 0.001);
    }

    @Test
    public void testFractionalKnapsackWithZeroCapacity() {
        // Test case with zero knapsack capacity
        Item[] items2 = { new Item(60, 10), new Item(100, 20), new Item(120, 30) };
        int capacity2 = 0;
        assertEquals(0.0, Fractional.fractionalKnapsack(capacity2, items2, items2.length), 0.001);
    }

    @Test
    public void testFractionalKnapsackWithNegativeItemValues() {
        // Test case with negative item values
        Item[] items3 = { new Item(-10, 2), new Item(-5, 3), new Item(-15, 5) };
        int capacity3 = 8;
        assertEquals(-20.0, Fractional.fractionalKnapsack(capacity3, items3, items3.length), 0.001);
    }

    @Test
    public void testFractionalKnapsackWithItemWeightsExceedingCapacity() {
        // Test case where the total weight of items exceeds the knapsack capacity
        Item[] items4 = { new Item(60, 100), new Item(100, 100), new Item(120, 100) };
        int capacity4 = 50;
        assertEquals(60.0, Fractional.fractionalKnapsack(capacity4, items4, items4.length), 0.001);
    }
    @Test
    public void testFractionalKnapsackWithEqualValuesPerUnitWeight() {
        // Test case with equal values per unit weight
        Item[] items = { new Item(20, 5), new Item(40, 10), new Item(60, 15) };
        int capacity = 10;
        assertEquals(40.0, Fractional.fractionalKnapsack(capacity, items, items.length), 0.001);
    }

    @Test
    public void testFractionalKnapsackWithLargeCapacity() {
        // Test case with a large knapsack capacity
        Item[] items = { new Item(10, 2), new Item(5, 3), new Item(15, 5) };
        int capacity = 100;
        assertEquals(30.0, Fractional.fractionalKnapsack(capacity, items, items.length), 0.001);
    }

    @Test
    public void testFractionalKnapsackWithSmallCapacity() {
        // Test case with a small knapsack capacity
        Item[] items = { new Item(10, 2), new Item(5, 3), new Item(15, 5) };
        int capacity = 1;
        assertEquals(5.0, Fractional.fractionalKnapsack(capacity, items, items.length), 0.001);
    }

}
