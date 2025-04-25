package org.example.linkedlist;

public class LinkedListUtils {

    public static Node convertArrayToLL(int[] arr)
    {
        int size = arr.length;
        if (size == 0) return null;
        Node head = new Node(arr[0]);
        Node current = head;

        for(int i=1;i<arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = temp;
        }
        return head;
    }

    public static void printLL(Node head){
        Node current = head;
        while (current!=null)
        {
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static int lengthLL(Node head){
        Node current = head;
        int length = 0;
        while (current!=null)
        {
            length++;
            current = current.next;
        }
        return length;
    }

    public static boolean searchElementLL(Node head, int searchElement) {
        Node current = head;
        while (current!=null)
        {
            if (current.data == searchElement)
                return true;
            current = current.next;
        }
        return false;
    }
}
