package com.bridgelabz.linkedlist_simple;

public class LinkListUC {
    Node head;

    private  int size;              //Size: to check size of the list
    LinkListUC(){
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
        LinkListUC list = new LinkListUC();    //UC 1:Ability to create  simple Linked

        list.addFirst(30);
        list.addFirst(56);         //UC 2 :Ability to create Linked List by adding 30 and 56 to 70
        list.printList();                        //   - LinkedList Sequence: 56->30->70
        list.addLast(70);
        list.printList();


        //UC4 : Ability to insert  30 between 56  and 70  Final Sequence: 56->30->70*



        //UC 5: Ability to delete the first  element in the LinkedList of sequence 56->30->70
        list.deleteFirst();
        System.out.println("first data value  is removed from list");
        list.printList();

        //UC 6: Ability to delete the last element in the LinkedList of sequence 56->30->70
        list.deleteLast();
        System.out.println("last data value is  removed from list");
        list.printList();


        //Size: To find the size of the linked list
        System.out.println("the size of the current list is :");
        System.out.println(list.getSize());

        System.out.println();
        System.out.println("List available is");

        list.addLast(56);
        list.addLast(70);
        list.printList();

        System.out.println("the size of the current list is :");
        System.out.println(list.getSize());

    }
}
