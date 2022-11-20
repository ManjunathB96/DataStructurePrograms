package com.linkedlist;

public class LinkedListSize {
    Node head;

    private  int size;              //Size: to check size of the list
    LinkedListSize(){
        this.size= 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;                     //Size: increment the size
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
        size--;                                                       //Size: decrement the list size
        head = head.next;
    }


    //delete last
    public void deleteLast() {
        if(head == null){
            System.out.println("sorry Subject List is empty");
            return;
        }
        size--;                                           //Size: decrement the list size

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


    public  int getSize(){                  //Size: to print the list size
        return size;                        //size will not count null

        }



    public static void main(String[] args) {
        LinkedListSize list = new LinkedListSize();

        list.addFirst(30);
        list.addFirst(56);
        list.printList();
        list.addLast(70);
        list.printList();

        System.out.println("the size of the current list is :");
        System.out.println(list.getSize());

    }
}
