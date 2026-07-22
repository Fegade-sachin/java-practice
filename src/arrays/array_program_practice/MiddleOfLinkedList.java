package arrays.array_program_practice;
/*22. Finding the middle element of a linked list
Program to print the middle element of a linked list.
You may be required to execute this with a single-pass algorithm,
meaning the program would read the input only once before running iterations.*/
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
public class MiddleOfLinkedList
{
    public static Node FindMiddle(Node head)
    {
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
            public static void main(String[] args)
    {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
    Node Middle=FindMiddle(head);
System.out.println("Middle element:"+Middle.data);
    }


}
