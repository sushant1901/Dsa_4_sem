/*package Tree;
import java.util.*;
public class tree_03 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class binaryTree{
        static int  idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx]== -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left  = buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;

        }
    }
    public static void inorderTraversal(Node root){
        if(root == null){
            return;
        }

        inorderTraversal(root.left);
        System.out.print(" "+root.data);
        inorderTraversal(root.right);
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree= new binaryTree();
        Node root =tree.buildTree(nodes);
        inorderTraversal(root);
    }
}
*/
