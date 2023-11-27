package org.example;
import java.util.LinkedList;

public class Queue {

    // Queue implementation using array
    static class QueueUsingArray {
        private int maxSize;
        private int[] queueArray;
        private int front, rear, size;

        public QueueUsingArray(int size) {
            this.maxSize = size;
            this.queueArray = new int[maxSize];
            this.front = this.rear = this.size = 0;
        }

        public void enqueue(int value) {
            if (size < maxSize) {
                queueArray[rear] = value;
                rear = (rear + 1) % maxSize;
                size++;
            } else {
                System.out.println("Queue is full!");
            }
        }
        public int dequeue() {
            if (size > 0) {
                int value = queueArray[front];
                front = (front + 1) % maxSize;
                size--;
                return value;
            } else {
                System.out.println("Queue is empty!");
                return -1;
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    // Stack implementation using array
    static class StackUsingArray {
        private int maxSize;
        private int[] stackArray;
        private int top;

        public StackUsingArray(int size) {
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1;
        }
        public void push(int value) {
            if (top < maxSize - 1) {
                stackArray[++top] = value;
            } else {
                System.out.println("Stack overflow!");
            }
        }

        public int pop() {
            if (top >= 0) {
                return stackArray[top--];
            } else {
                System.out.println("Stack underflow!");
                return -1;
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    // Linked List implementation
    static class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Queue implementation using LinkedList
    static class QueueUsingLinkedList {
        private LinkedList<Integer> list = new LinkedList<>();

        public void enqueue(int value) {
            list.addLast(value);
        }

        public int dequeue() {
            if (!isEmpty()) {
                return list.removeFirst();
            } else {
                System.out.println("Queue is empty!");
                return -1;
            }
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }
    }
    // Stack implementation using linked list
    static class StackUsingLinkedList {
        private LinkedListNode top;

        public void push(int value) {
            LinkedListNode newNode = new LinkedListNode(value);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (!isEmpty()) {
                int value = top.data;
                top = top.next;
                return value;
            } else {
                System.out.println("Stack underflow!");
                return -1;
            }
        }
        public boolean isEmpty() {
            return top == null;
        }
    }
}

