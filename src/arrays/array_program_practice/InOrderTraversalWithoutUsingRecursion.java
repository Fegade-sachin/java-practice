package arrays.array_program_practice;
/*26Performing in-order traversal without recursion
Program to perform in-order traversal of a tree, employing an iterative solution.
 Iteration, an alternative to recursion, involves a loop being repeatedly executed
  till a specific condition is met
*/
import java.util.Stack;

class Node5
{
    int data;
    Node5 left,right;
    Node5(int data)
    {
        this.data = data;
        left=right=null;
    }
}
public class InOrderTraversalWithoutUsingRecursion
{
    static void inorder(Node5 root)
    {
        if(root==null)
        {
            return;
        }
        Stack<Node5> stack=new Stack<Node5>();
        Node5 current=root;
        while(current!= null||!stack.isEmpty() )
        {
            while(current!=null ) {
                stack.push(current);
                current = current.left;
            }
            current=stack.pop();
            System.out.println(current.data+" ");
            current=current.right;
        }



    }
    public static void main(String[] args) {
        Node5 root = new Node5(10);
        root.left = new Node5(20);
        root.right = new Node5(30);
        root.left.left = new Node5(40);
        root.left.right = new Node5(50);
        System.out.println("Inorder Traversal");
        inorder(root);
    }
}
