package collaction;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CustomLinkedList
{
    Node head ;
    void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;

    }
    void remove(int data)
    {
        if(head == null)
        {
            return;
        }
        if(head.data == data)
        {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if(current.next != null) {
            current.next = current.next.next;
        }
    }
    void printLinkedList()
    {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println();
    }
    public static void main(String[] args)
    {
        CustomLinkedList list=new CustomLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println();
        list.remove(3);
        list.printLinkedList();
    }
}
