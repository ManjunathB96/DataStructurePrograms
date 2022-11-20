package com.linkedlist;

public class LinkedListUC1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
                              //Size: increment the size
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

        System.out.println();
        System.out.println();

    }


    public static void main(String[] args) {
        LinkedListUC1 list = new LinkedListUC1();    //UC 1:Ability to create  simple Linked

        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);
        list.printList();


    }
}
