package Tree;

public class tree_07 {
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
    public static void postOrderTraversal(Node root){
        if(root == null) return ;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);

    }
    public static void main(String[] args) {
        int[] nodes= {1,2,4,-1,-1,5,-1,-1,3,-16,-1,-1};
        Binarytree tree= new Binarytree();
        Node root=tree.buildTree(nodes);


    }
}
