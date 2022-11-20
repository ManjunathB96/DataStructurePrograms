package com.stack;

import java.util.Stack;

public class StackUC2 {

        static  class Node{
            int data;
            com.stack.StackUC1.Node next;

            public Node(int data) {
                this.data = data;
                next = null;
            }
        }

        static class  stack{
            public  static com.stack.StackUC1.Node head;

            public static boolean isEmpty(){
                return head == null;

            }

            public static  void  push(int data){
                com.stack.StackUC1.Node newNode = new com.stack.StackUC1.Node(data);

                if(isEmpty()){
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head= newNode;
            }

            public static int pop(){
                if (isEmpty()){
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return  top;
            }

            public static  int peek(){
                if (isEmpty()){
                    return -1;
                }
                return head.data;
            }

            public static void main(String[] args) {
                Stack sList = new Stack();
                sList.push(56);
                sList.push(30);
                sList.push(70);

                System.out.println(sList+" ");

                System.out.println("pop till stack is empty : [Empty] ");
                while (!isEmpty()){
                    System.out.println(sList.peek());

                    System.out.println(sList.pop());
                }
            }
        }
    }

