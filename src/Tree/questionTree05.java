/*package Tree;
import java.util.*;
public class questionTree05 {
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


    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null) {
            return new TreeInfo(0,0);
        }
        TreeInfo left= diameter2(root.left);
        TreeInfo right =diameter2(root.right);
        int myheight= Math.max(left.ht,right.ht)+1;

        int d1=left.diam;
        int d2=right.diam;
        int d3=left.ht + right.ht + 1;

        int myDiam=Math.max(Math.max(d1,d2),d3);

        TreeInfo myInfo= new TreeInfo(myheight,myDiam);
        return myInfo;
    }


    public static void main(String[] args) {
        int[] nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree= new Binarytree();
        Node root=tree.buildTree(nodes);
        //System.out.println(heightOfTree(root));
        System.out.println(diameter2(root).diam);
    }
}

 */

