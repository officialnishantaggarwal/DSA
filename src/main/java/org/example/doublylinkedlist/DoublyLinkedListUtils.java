package org.example.doublylinkedlist;

public class DoublyLinkedListUtils {

    public static Node convertArrayToDLL(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i],null,prev);
            prev.next = newNode;
            prev = newNode;
        }
        return head;
    }

    public static Node deleteHead(Node head) {
        if (head == null || head.next == null) return null;

        Node prev = head;
        head = head.next;
        head.back=null;
        prev.next=null;
        return head;
    }

    public static void printDLL(Node head){
        Node current = head;
        while (current!=null)
        {
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println("null");
    }


}
