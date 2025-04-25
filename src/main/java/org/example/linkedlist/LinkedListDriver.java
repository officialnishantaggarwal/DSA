package org.example.linkedlist;

public class LinkedListDriver {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int searchElement = 7;
        Node head = LinkedListUtils.convertArrayToLL(arr);
        System.out.println("Printing the LL:");
        LinkedListUtils.printLL(head);
        int length = LinkedListUtils.lengthLL(head);
        System.out.println("Length of LL: "+length);
        boolean elementFound = LinkedListUtils.searchElementLL(head,searchElement);
        System.out.println("Element Found "+searchElement+": "+elementFound);
    }
}
