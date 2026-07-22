package arrays.array_program_practice;

import java.util.Stack;

class Node3
{
    int data;
    Node3 left;
    Node3 right;
    public Node3(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class PreOrderTraversalWithoutRecursion
{
    static void preorder(Node3 root) {
        if (root == null)
        {
            return;
        }
        Stack<Node3> stack=new Stack<Node3>();
        stack.push(root);

        while (!stack.isEmpty())
        {
            Node3 current=stack.pop();
            System.out.print(current.data+" ");
            if(current.right!=null)
            {
                stack.push(current.right);
            }
            if(current.left!=null)
            {
                stack.push(current.left);
            }
        }

    }
    public static void main(String[] args)
    {
        Node3 root=new Node3(1);
        root.left=new Node3(2);
        root.right= new Node3(3);
        root.left.left=new Node3(4);
        root.left.right=new Node3(5);
        System.out.println("preorder Traversal Without  Recursion");
        preorder(root);


    }
}
