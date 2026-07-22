package arrays.array_program_practice;
/*25. Performing in-order traversal
Program to perform in-order traversal of a hierarchical data structure.*/
class Node4{
    int data;
    Node4 left,right;

    Node4(int data){
        this.data=data;
        left=right=null;
    }
}
public class In_Order_Traversal
{
    static void inorder(Node4 root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args)
    {
        Node4 root=new Node4(1);
        root.left=new Node4(2);
        root.right=new Node4(3);
        root.left.left=new Node4(4);
        root.left.right=new Node4(5);
        System.out.println("Inorder Traversal");
        inorder(root);
    }
}
