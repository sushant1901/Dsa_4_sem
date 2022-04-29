/*package Tree;
import java.util.*;

public class QuestionTree02 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binarytree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
    }
    public static int sumOfNodes(Node root){
        if(root == null) return 0;
        int leftSum =sumOfNodes(root.left);
        int rightSum= sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }

    public static void main(String[] args) {
        int[] nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree= new Binarytree();
        Node root=tree.buildTree(nodes);
        System.out.println(sumOfNodes(root));
    }
}

 */
