package arrays.array_program_practice;
//39. Reversing a linked list
//Program to reverse the order of contents of a singly linked list.
public class ReverseLinkedListEasy
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static void printList(Node head)
    {
        Node temp =head;
        while(temp!=null)
        {
            System.out.print(temp.data+" => ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    static Node  reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null)
        {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return   prev;
    }

    public static void main(String[] args) {

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        System.out.println("Original List");
        printList(head);
        head=reverse(head);
        System.out.println("reversed List");
        printList(head);

    }
}
