package com.linkedlist;

public class LinkedListUC6 {
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

        System.out.println();
        System.out.println();

    }

    //delete first

    public void deleteFirst() {
        if (head == null) {                                        //this is a corner case
            System.out.println("sorry Subject List is empty");
            return;
        }

        head = head.next;
    }


    //delete last
    public void deleteLast() {
        if(head == null){
            System.out.println("sorry Subject List is empty");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast= secondLast.next;

        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        LinkedListSize list = new LinkedListSize();

        list.addFirst(30);
        list.addFirst(56);
        list.addLast(70);
        list.printList();


        list.deleteFirst();
        System.out.println("first data value  is removed from list");
        list.printList();

        //UC 6: Ability to delete the last element in the LinkedList of sequence 56->30->70
        list.deleteLast();
        System.out.println("last data value is  removed from list");
        list.printList();

    }
}
