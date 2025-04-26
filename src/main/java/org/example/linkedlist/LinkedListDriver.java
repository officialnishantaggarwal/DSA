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
        // removed head
//        head = LinkedListUtils.removesHead(head);
//        System.out.println("Printing the LL after removing Head:");
//        LinkedListUtils.printLL(head);

        // removes tail
//        head = LinkedListUtils.removesTail(head);
//        System.out.println("Printing the LL after removing tail:");
//        LinkedListUtils.printLL(head);

        // removes index
//        int removeIndex = 3;
//        head = LinkedListUtils.deleteKthElementOfLL(head,removeIndex);
//        System.out.println("Printing the LL after removing from position "+removeIndex+":");
//        LinkedListUtils.printLL(head);

        // remove Element
//        int removeElement = 3;
//        head = LinkedListUtils.deleteElementOfLL(head,removeElement);
//        System.out.println("Printing the LL after removing Element "+removeElement+":");
//        LinkedListUtils.printLL(head);

        // insert head, tail
        int addElement = 10;
        head = LinkedListUtils.insertTail(head,addElement);
        System.out.println("Printing the LL after adding head "+addElement+":");
        LinkedListUtils.printLL(head);

    }
}
