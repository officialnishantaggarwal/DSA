package org.example.doublylinkedlist;

import org.example.linkedlist.LinkedListUtils;

public class DoublyLinkedListDriver {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node head = DoublyLinkedListUtils.convertArrayToDLL(arr);
        System.out.println("Printing the DLL:");
        DoublyLinkedListUtils.printDLL(head);
        DoublyLinkedListUtils.deleteGivenNode(head.next.next.next.next);
        System.out.println("Printing the DLL:");
        DoublyLinkedListUtils.printDLL(head);

    }
}
