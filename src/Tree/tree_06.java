/*package Tree;

public class tree_06 {
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
    public static int countOfNodes(Node root){
        if(root == null) return 0;
        int leftNode =countOfNodes(root.left);
        int rightNode= countOfNodes(root.right);
        return leftNode+rightNode+1;
    }
    public static void main(String[] args) {
        int[] nodes= {1,2,4,-1,-1,5,-1,-1,3,-16,-1,-1};
        Binarytree tree= new Binarytree();
        Node root=tree.buildTree(nodes);


    }
}
*/

