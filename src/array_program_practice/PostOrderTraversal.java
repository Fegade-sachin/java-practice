package array_program_practice;
/*27. Performing post-order traversal
Program to perform post-order traversal of a hierarchical data structure.
*/
class Node6
{
	int data;
    Node6 left, right   ;
    Node6(int data)
    {
        this.data = data;
      left=right=null;
    }
}
public class PostOrderTraversal
{
    public static void postOrder(Node6 root)
    {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }
    public static void main(String[] args) {
        Node6 root = new Node6(10);
        root.left = new Node6(20);
        root.right = new Node6(30);
        root.left.left = new Node6(40);
        root.left.right = new Node6(50);
        root.right.left = new Node6(60);
        root.right.right = new Node6(70);
        System.out.println("Postorder traversal of Binary Tree");
        postOrder(root);
    }
}
