package com.linkedlist;

public class LinkedListUC2 {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    //add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("sorry Subject List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");

    }
    public static void main(String[] args) {
      LinkedListUC2 list = new LinkedListUC2();

        list.addFirst(30);
        list.addFirst(56);         //UC 2 :Ability to create Linked List by adding 30 and 56 to 70
        list.printList();
        System.out.println();                               //   - LinkedList Sequence: 56->30->70
        list.addLast(70);
        list.printList();

    }
}
