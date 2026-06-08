package array_program_practice;
/*23. Performing pre-order traversal
Program to perform pre-order traversal of a hierarchical data structure.
Hierarchical data structures like trees can be traversed in multiple ways.
 Linear data structures like arrays,
linked lists, queues and stacks can only be traversed in one logical way.*/
class Node2
{
    int data;
    Node2 left, right ;
    Node2(int data)
    {
        this.data=data;
        left=right=null;
    }

}
public class PreOrderTraversal
{
    static void preOrder(Node2 root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args)
    {

        Node2 root =new Node2(1);
        root.left=new Node2(2);
        root.right=new Node2(3);
        root.left.left=new Node2(4);
        root.left.right=new Node2(5);
        System.out.println("preorder Traversal");
        preOrder(root);
    }
}
