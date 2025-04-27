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

    public static void deleteGivenNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;

        if(front==null) {
            prev.next=null;
            temp.back=null;
            return;
        }

        prev.next=front;
        front.back=prev;
        temp.next=temp.back=null;
    }

    public static Node insertBeforeHead(Node head, int val){
        Node newHead = new Node(val,head,null);
        head.back=newHead;
        return newHead;
    }

    public static Node insertBeforeTail(Node head, int val){

        if(head.next==null) {
            return insertBeforeHead(head,val);
        }

        Node tail = head;
        Node prev;
        while (tail.next!=null){
            tail=tail.next;
        }

        prev = tail.back;

        Node newNode = new Node(val,tail,prev);
        tail.back=newNode;
        prev.next=newNode;

        return head;
    }

    public static Node insertBeforeKthElement(Node head, int val, int k){
        if(k==1) {
            return insertBeforeHead(head,val);
        }
        Node temp = head;
        int ctr=0;
        while (temp!=null) {
            ctr++;
            if(ctr==k) break;
            temp = temp.next;
        }

        Node prev = temp.back;
        Node newNode = new Node(val,temp,prev);
        prev.next=newNode;
        temp.back=newNode;
        return head;
    }

    public static void insertBeforeNode(Node node, int val){
        Node prev = node.back;
        Node newNode = new Node(val,node,prev);
        prev.next=newNode;
        node.back=newNode;
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
