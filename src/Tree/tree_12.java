package Tree;
/*import java.util.*;
import java.io.*;

class tree_12 {
    public static void main (String[] args) {
        BST tree=new BST();
        int[] data={30,50,15,20,10,40,60};
        for(int key:data)
            tree.insert(key);

        tree.inorder();
    }
}

class Node{
    Node left;
    int val;
    Node right;
    Node(int val){
        this.val=val;
    }
}

class BST{
    Node root;

    public void insert(int key){
        Node node=new Node(key);
        if(root==null) {
            root = node;
            return;
        }
        Node prev=null;
        Node temp=root;
        while (temp!=null){
            if(temp.val>key){
                prev=temp;
                temp=temp.left;
            }
            else if (temp.val<key){
                prev=temp;
                temp=temp.right;
            }
        }
        if(prev.val>key)
            prev.left=node;
        else prev.right=node;
    }

    public void inorder(){
        Node temp=root;
        Stack<Node> stack=new Stack<>();
        while (temp!=null||!stack.isEmpty()){
            if(temp!=null){
                stack.add(temp);
                temp=temp.left;
            }
            else {
                temp=stack.pop();
                System.out.print(temp.val+" ");
                temp=temp.right;
            }
        }
    }
}

 */
