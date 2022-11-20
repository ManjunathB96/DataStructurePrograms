package com.queue;

public class QueueUC3 {
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
    }

    public static void main(String[] args) {
        Queue queueList = new Queue();

        queueList.add(56);
        queueList.add(30);
        queueList.add(70);

        System.out.println(queueList);
    }

}


