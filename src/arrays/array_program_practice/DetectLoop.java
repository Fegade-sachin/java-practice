package arrays.array_program_practice;
/*41. Checking for loops in a linked list
Program to check whether a given linked list contains a loop or not.
Corrupt linked lists can sometimes have two nodes pointing to the same location,
 thereby forming a cycle or loop.Related:
*/
public class DetectLoop {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean detectLoop(Node head) {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args)
    {
        Node head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
         head.next.next.next.next = head.next;//this line show the loop
        if (detectLoop(head)) {
            System.out.println("linked list has been detected");
        }
        else {
            System.out.println("linked list has NOT been detected");
        }
    }
}
