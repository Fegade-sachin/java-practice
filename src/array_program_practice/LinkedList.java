package array_program_practice;
/*
44. Finding the nth element from the tail of a linked list
Program to find the nth element from the end of a given linked list,
where n is a variable value provided by the user. You may be required
to find a solution that does not involve multiple iterations
*/
public class LinkedList
{
    Node head;
   static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }
    public int findNthFromEnd(int n)
    {
        Node first = head;
        Node last=head;
       for(int i=0;i<n;i++)
       {
           if(first==null)
           {
               throw new IllegalArgumentException("List has fewer than " + n + " nodes");
           }
           first=first.next;
       }
       while (first!=null)
       {
           first=first.next;
           last=last.next;
       }
       return last.data;
    }
    public void append(int newdata)
    {
        Node newNode = new Node(newdata);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;

        }
        temp.next=newNode;
    }

    public static void main(String[] args) {
         LinkedList list=new LinkedList();
         list.append(10);
         list.append(20);
         list.append(30);
         list.append(40);
         list.append(50);
        System.out.println("2nd element from end: " + list.findNthFromEnd(2));

    }
}
