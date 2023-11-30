package org.example;
// LinkedListTest.java
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testLinkedListOperations() {
        LinkedList list = new LinkedList();

        // Test adding nodes
        list.addNode(5);
        list.addNode(2);
        list.addNode(8);
        list.addNode(1);

        // Test searching for an element
        assertTrue(list.search(2));
        assertFalse(list.search(10));

        // Test sorting
        list.sortList();
        assertEquals("1 2 5 8", getListAsString(list));

        // Test deleting a node
        list.deleteNode(5);
        assertEquals("1 2 8", getListAsString(list));

        // Test reversing the list
        list.reverseList();
        assertEquals("8 2 1", getListAsString(list));



        //////
        LinkedList list1 = new LinkedList();

        // Test adding nodes
        list1.addNode(5);
        list1.addNode(6);
        list1.addNode(9);
        list1.addNode(4);
        list1.addNode(8);

        // Test searching for an element
        assertTrue(list1.search(5));
        assertTrue(list1.search(4));

        // Test sorting
        list1.sortList();
        assertEquals("4 5 6 8 9", getListAsString(list1));

        // Test deleting a node
        list1.deleteNode(5);
        assertEquals("4 6 8 9", getListAsString(list1));

        // Test reversing the list
        list1.reverseList();
        assertEquals("9 8 6 4", getListAsString(list1));
    }

    private String getListAsString(LinkedList list) {
        StringBuilder result = new StringBuilder();
        LinkedList.Node current = list.head;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString().trim();
    }
}
