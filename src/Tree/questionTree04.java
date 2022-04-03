package Tree;

public class questionTree04 {
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
    public static int heightOfTree(Node root){
        if(root == null) return 0;
        int leftheight =heightOfTree(root.left);
        int rightheight= heightOfTree(root.right);
        int myHeight= Math.max(leftheight,rightheight)+1;
        return myHeight;
    }
    public static int diameter1(Node root){
        if(root == null) return 0;
        int d1= diameter1(root.left);
        int d2=diameter1(root.right);
        int d3= heightOfTree(root.left)+ heightOfTree(root.right) + 1;
        return Math.max(d3,Math.max(d1,d2));
    }

    public static void main(String[] args) {
        int[] nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree= new Binarytree();
        Node root=tree.buildTree(nodes);
        //System.out.println(heightOfTree(root));
        System.out.println(diameter1(root));
    }
}
