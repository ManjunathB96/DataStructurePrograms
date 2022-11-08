package com.bridgelabz.linkedlist_simple;

import java.util.*;

public class LinkedListUCWithCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(30);
        list.addFirst(56);
        System.out.println(list);

        list.addLast(70);              // list.add(70);
        System.out.println(list);


        System.out.println();
        System.out.println("Size of the list is");
        System.out.println(list.size());


        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "-->");
        }
        System.out.print("NULL");



     /*   System.out.println();
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);   */


        System.out.println();
        System.out.println("Using index data value 30 is removed");
        list.remove(1);
        System.out.println(list);

    }
}
