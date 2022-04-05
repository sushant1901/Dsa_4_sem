package Tree;
// Java program to make an extended binary tree
class tree09
{

    // A Tree node
    static class Node
    {
        int key;
        Node left, right;
    };

    // Utility function to create a new node
    static Node newNode(int key)
    {
        Node temp = new Node();
        temp.key = key;
        temp.left = temp.right = null;
        return (temp);
    }

    // Function for inorder traversal
    static void traverse(Node root)
    {
        if (root != null)
        {
            traverse(root.left);
            System.out.print(root.key + " ");
            traverse(root.right);
        }
        else
        {

            // Making external nodes
            root = newNode(-1);
            System.out.print(root.key + " ");
        }
    }

    // Driver code
    public static void main(String args[])
    {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(5);
        root.right.right = newNode(4);

        traverse(root);
    }
}


