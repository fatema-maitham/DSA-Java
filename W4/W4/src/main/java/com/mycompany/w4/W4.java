package com.mycompany.w4;

public class W4 {

    static class Node<E> { // one item in a linked list
        E element; // data/value
        Node<E> next; // stores a reference to the next node

        Node(E e) {
            element = e;
        }
    }

    static Node<Integer> head;
    static int size = 0;

    public static void main(String[] args) {

        // Create the original linked list
        // head -> 10 -> 20 -> 30 -> 40 -> null
        head = new Node<>(10);
        head.next = new Node<>(20);
        head.next.next = new Node<>(30);
        head.next.next.next = new Node<>(40);

        size = 4;

        // Add at the beginning
        insertFirst(5);

        // Add at the end
        insertLast(50);

        // Add at a specific index
        insertAt(2, 15);

        // Print all elements
        System.out.print("List: ");
        printAll();

        // Search for an element
        System.out.println("\nIndex of 30: " + search(30));

        // Calculate sum
        System.out.println("Sum: " + sum());

        // Delete the first element
        System.out.println("Deleted first: " + deleteFirst());

        // Delete the last element
        System.out.println("Deleted last: " + deleteLast());

        // Delete element at index 2
        System.out.println("Deleted at index 2: " + deleteAt(2));

        // Print final list
        System.out.print("Final list: ");
        printAll();

        System.out.println("\nSize: " + size);
    }

    // INSERT FIRST
    public static void insertFirst(Integer e) {

        Node<Integer> newNode = new Node<>(e);

        newNode.next = head;

        head = newNode;

        size++;
    }

    // INSERT LAST
    public static void insertLast(Integer e) {

        Node<Integer> newNode = new Node<>(e);

        if (head == null) {
            head = newNode; // list was empty
        } else {

            Node<Integer> current = head;

            while (current.next != null) {
                current = current.next; // walk to the last node
            }

            current.next = newNode;
        }

        size++;
    }

    // INSERT AT SPECIFIC INDEX
    public static void insertAt(int index, Integer e) {

        if (index == 0) {
            insertFirst(e);
            return;
        }

        Node<Integer> previous = head;

        for (int i = 0; i < index - 1; i++) {
            previous = previous.next; // stop just before index
        }

        Node<Integer> newNode = new Node<>(e);

        newNode.next = previous.next; // save the old successor

        previous.next = newNode;

        size++;
    }

    // DELETE FIRST
    public static Integer deleteFirst() {

        if (head == null) {
            return null;
        }

        Integer removed = head.element;

        head = head.next;

        size--;

        return removed;
    }

    // DELETE LAST
    public static Integer deleteLast() {

        if (head == null) {
            return null;
        }

        // One node only
        if (head.next == null) {

            Integer e = head.element;

            head = null;

            size--;

            return e;
        }

        Node<Integer> current = head;

        // Stop at the second-last node
        while (current.next.next != null) {
            current = current.next;
        }

        Integer removed = current.next.element;

        current.next = null;

        size--;

        return removed;
    }

    // DELETE AT SPECIFIC INDEX
    public static Integer deleteAt(int index) {

        if (index == 0) {
            return deleteFirst();
        }

        Node<Integer> previous = head;

        for (int i = 0; i < index - 1; i++) {
            previous = previous.next;
        }

        Node<Integer> target = previous.next;

        previous.next = target.next; // bypass target

        size--;

        return target.element;
    }

    // PRINT ALL ELEMENTS
    public static void printAll() {

        Node<Integer> current = head;

        while (current != null) {

            System.out.print(current.element + " ");

            current = current.next;
        }
    }

    // SUM ALL ELEMENTS
    public static int sum() {

        int total = 0;

        Node<Integer> current = head;

        while (current != null) {

            total += current.element;

            current = current.next;
        }

        return total;
    }

    // SEARCH FOR AN ELEMENT
    public static int search(Integer target) {

        Node<Integer> current = head;

        int index = 0;

        while (current != null) {

            if (current.element.equals(target)) {
                return index; // found it
            }

            current = current.next;

            index++;
        }

        return -1; // not found
    }
}