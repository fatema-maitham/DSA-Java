package com.mycompany.w4;

public class W4 {

    static class Node<E> { // one item in a linked list
        E element;         // data/value
        Node<E> next;      // reference to the next node

        Node(E e) {
            element = e;
        }
    }

    static Node<Integer> head;
    static int size = 0;

    public static void main(String[] args) {

        head = new Node<>(10);
        head.next = new Node<>(20);
        head.next.next = new Node<>(30);
        head.next.next.next = new Node<>(40);

        size = 4;

        insertFirst(5);

        System.out.println("Done");
    }

    public static void insertFirst(Integer e) {
        Node<Integer> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
    }
}