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

    public static Node removesHead(Node head) {
        if(head == null) return head;
        head = head.next;
        return head;
    }

    public static Node removesTail(Node head) {
        if(head == null || head.next==null) return null;
        Node temp = head;
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deleteKthElementOfLL(Node head, int index) {
        if(head == null) return null;
        if(index==1) {
            head=head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        int ctr=0;
        while (temp !=null) {
            ctr++;
            if(ctr == index) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
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
