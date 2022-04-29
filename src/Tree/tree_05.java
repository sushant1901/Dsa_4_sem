/*package Tree;
import java.util.*;

public class tree_05 {
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
        public static Node buildTree(int[] nodes){
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

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        Node root= binaryTree.buildTree(nodes);
        levelOrederTraversal(root);

    }

    private static void levelOrederTraversal(Node root) {
        if(root == null)return;
        Queue<Node>q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.println(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }


}
*/
