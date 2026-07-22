package arrays.array_program_practice;
/*29. Printing all leaves of a binary tree
Program to print the values of all leaves in a binary tree.
Additionally, you may be asked to print the values in a certain order or hierarchy.*/
class Node8
{
    int data;
    Node8 left,right;
    Node8(int data)
    {
        this.data=data;
        left=right=null;
    }
}

public class PrintLeavesBinaryTree
{
    public static void printLeaf(Node8 root)
    {
        if(root==null) {
            return;
        }
        if (root.left==null && root.right==null)
            {
            System.out.println(root.data);
            }
        printLeaf(root.left);
        printLeaf(root.right);

    }

    public static void main(String[] args) {
        Node8 root =new Node8(10);
        root.left=new Node8(8);
        root.right=new Node8(9);
        root.left.left=new Node8(7);
        root.left.right=new Node8(6);
        root.right.left=new Node8(5);
        root.right.right=new Node8(4);
        System.out.println("Leaf nodes of the binary tree:");
        printLeaf(root);
    }
}
