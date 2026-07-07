package array_program_practice;
/*40. Finding the length of a linked list
Program to determine the length of a singly linked list in one iteration
of the code.*/
public class LinkedListLength
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            data = data;
            next = null;
        }
    }
        public static int getLength(Node head)
        {
            int count = 0;
            Node corrent =head;
            while(corrent != null)
            {
                count++;
                corrent = corrent.next;
            }
            return count;
        }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        //find lingth
        int length = getLength(head);
        System.out.println("Length of linked List "+length);
    }
}
