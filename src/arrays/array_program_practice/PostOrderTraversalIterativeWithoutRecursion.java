package arrays.array_program_practice;
/*28. Performing post-order traversal without recursion
Program to perform post-order traversal of a tree, employing an iterative solution.*/
import java.util.Stack;

class Node7
{
    int data;
    Node7 left, right;
    Node7(int item)
    {
        data = item;
        left = right = null;
    }
}
public class PostOrderTraversalIterativeWithoutRecursion
{
    public static void postOrderTraversal(Node7 root)
    {
        if(root==null)
        {
            return;
        }
        Stack<Node7> stack1 = new Stack<Node7>();
        Stack<Node7> stack2 = new Stack<Node7>();
        stack1.push(root);
        while(!stack1.isEmpty())
        {
            Node7 current = stack1.pop();
            stack2.push(current);
            if(current.left!=null)
            {
                stack1.push(current.left);
            }
            if(current.right!=null)
            {
                stack1.push(current.right);
            }
        }
        while(!stack2.isEmpty())
        {
            System.out.print(stack2.pop().data+" ");
        }


    }
    public static void main(String[] args) {
        Node7 root = new Node7(1);
        root.left = new Node7(2);
        root.right = new Node7(3);
        root.left.left = new Node7(4);
        root.left.right = new Node7(5);
        root.right.left = new Node7(6);
        root.right.right = new Node7(7);
        System.out.println("post order traversal Without recursion");
        postOrderTraversal(root);
    }
}
