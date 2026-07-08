package array_program_practice;

public class LinkedListLoop
{
    static class Node
    {
        int data;
        Node next;
         Node(int data)
        {
           this.data = data;
            next = null;
        }
    }
    Node head;
    static Node detectLoopStart(Node head)
    {
        Node slow = head,fast = head;
        while (slow != null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
            {
                slow = head;
                while (slow != fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        LinkedListLoop list = new LinkedListLoop();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = list.head.next.next;
       Node loopStart= list.detectLoopStart(list.head);
       if(loopStart!=null)
           {
           System.out.println(loopStart.data);
           }
       else
       {
           System.out.println("No Loop Found");
       }

    }
//Time Complexity = O(n)
    //Space Complexity = O(1)

}
