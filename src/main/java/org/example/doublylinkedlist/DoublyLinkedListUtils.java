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

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) return null;

       Node tail = head;

       while (tail.next!=null)
       {
           tail = tail.next;
       }

       Node prev = tail.back;
       prev.next=null;
       tail.back=null;
       return head;
    }

    public static Node removeKthElementDLL(Node head, int k) {
        if (head == null) return null;

        int ctr=0;
        Node kthNode = head;
        while (kthNode!=null) {
            ctr++;
            if(ctr==k) break;;
            kthNode = kthNode.next;
        }

        if(ctr==k) {
            Node prev = kthNode.back;
            Node front = kthNode.next;

            if (prev == null && front == null) {
                return null;
            } else if (prev == null) {
                return deleteHead(head);
            } else if (front == null) {
                return deleteTail(head);
            }
            prev.next = front;
            front.back = prev;
            kthNode.next = null;
            kthNode.back = null;
        }
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
