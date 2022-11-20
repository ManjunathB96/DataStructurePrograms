package com.queue;

public class QueueUC4 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = head.data;

            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }


    }

    public static void main(String[] args) {
        Queue queueList = new Queue();

        queueList.add(56);
        queueList.add(30);
        queueList.add(70);

        System.out.print(queueList);


        System.out.println("Implement dequeue");
        while (!queueList.isEmpty()) {
            System.out.println(queueList.peek());
            queueList.remove();
        }
    }

}
