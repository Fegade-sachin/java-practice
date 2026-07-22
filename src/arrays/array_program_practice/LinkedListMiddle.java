package arrays.array_program_practice;
/*43. Finding the middle element of a linked list
Program to determine and print the middle element(s) of a linked list.*/
public class LinkedListMiddle
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public void printMiddle(Node head)
    {

        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        Node slow = head;
        Node fast = head;
        Node prevSlow = null;
        while(fast != null && fast.next != null)
        {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

    if(fast == null)
        {
            System.out.println("Middle elements: " + prevSlow.data + " and " + slow.data);
        }
    else
        {
            System.out.println("Middle elements: " + prevSlow.data + " and " + slow.data);
        }

    }
    public static void main(String[] args)
    {
    LinkedListMiddle list = new LinkedListMiddle();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(3);
        list.head.next.next.next=new Node(4);
        list.head.next.next.next.next=new Node(5);
        list.head.next.next.next.next.next=new Node(6);
        list.printMiddle(list.head);
    }
}
