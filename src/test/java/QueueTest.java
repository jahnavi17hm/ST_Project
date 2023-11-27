package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class QueueTest {

    @Test
    public void testQueueAndStack() {
        // Test Case 1: Test isEmpty method for all implementations
        Queue.QueueUsingArray emptyQueueArray = new Queue.QueueUsingArray(5);
        Queue.StackUsingArray emptyStackArray = new Queue.StackUsingArray(5);
        Queue.QueueUsingLinkedList emptyQueueLinkedList = new Queue.QueueUsingLinkedList();
        Queue.StackUsingLinkedList emptyStackLinkedList = new Queue.StackUsingLinkedList();

        assertTrue(emptyQueueArray.isEmpty());
        assertTrue(emptyStackArray.isEmpty());
        assertTrue(emptyQueueLinkedList.isEmpty());
        assertTrue(emptyStackLinkedList.isEmpty());

        // Test Case 2: Test enqueue and dequeue for all implementations
        Queue.QueueUsingArray queueArray = new Queue.QueueUsingArray(3);
        Queue.StackUsingArray stackArray = new Queue.StackUsingArray(3);
        Queue.QueueUsingLinkedList queueLinkedList = new Queue.QueueUsingLinkedList();
        Queue.StackUsingLinkedList stackLinkedList = new Queue.StackUsingLinkedList();

        queueArray.enqueue(1);
        queueArray.enqueue(2);
        queueArray.enqueue(3);

        stackArray.push(4);
        stackArray.push(5);
        stackArray.push(6);

        queueLinkedList.enqueue(7);
        queueLinkedList.enqueue(8);
        queueLinkedList.enqueue(9);

        stackLinkedList.push(10);
        stackLinkedList.push(11);
        stackLinkedList.push(12);

        assertEquals(1, queueArray.dequeue());
        assertEquals(2, queueArray.dequeue());
        assertEquals(3, queueArray.dequeue());

        assertEquals(6, stackArray.pop());
        assertEquals(5, stackArray.pop());
        assertEquals(4, stackArray.pop());

        assertEquals(7, queueLinkedList.dequeue());
        assertEquals(8, queueLinkedList.dequeue());
        assertEquals(9, queueLinkedList.dequeue());

        assertEquals(12, stackLinkedList.pop());
        assertEquals(11, stackLinkedList.pop());
        assertEquals(10, stackLinkedList.pop());

        // Test Case 3: Test underflow scenarios
        assertEquals(-1, queueArray.dequeue());
        assertEquals(-1, stackArray.pop());
        assertEquals(-1, queueLinkedList.dequeue());
        assertEquals(-1, stackLinkedList.pop());

        // Test Case 4: Test overflow scenarios
        Queue.QueueUsingArray fullQueueArray = new Queue.QueueUsingArray(2);
        fullQueueArray.enqueue(1);
        fullQueueArray.enqueue(2);
        fullQueueArray.enqueue(3); // Should print "Queue is full!"

        Queue.StackUsingArray fullStackArray = new Queue.StackUsingArray(2);
        fullStackArray.push(4);
        fullStackArray.push(5);
        fullStackArray.push(6); // Should print "Stack overflow!"
    }
}
