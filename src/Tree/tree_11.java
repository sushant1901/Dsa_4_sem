package Tree;

public class tree_11 {
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;
        }
    }
    Node root;// root of BST.
    tree_11(){
        root =null;
    }
    tree_11(int value){
        root = new Node(value);
    }
    // this method mainly call insertRec()
    void insert(int data){

        root=insertRec(root,data);
    }
    Node insertRec(Node root, int data){
        // A recursive function to insert a new key in BST.

        // If tree is empty return new node
        if(root== null){
            root= new Node(data);
            return root;
        }
        //otherwise recur down the tree.
        if(data<root.data){
            root.left= insertRec(root.left,data);
        }
        else if(data>root.data) root.right= insertRec(root.right,data);
        // return the (unchanged ) node pointer.
        return root;
    }
    // htis method mainly calls inorderRec();
    void inorder(){inorderRec(root);}
    void inorderRec(Node root){
        if (root!=null){
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }


    public static void main(String[] args) {
        tree_11 tree= new tree_11();
        int[] data ={50,30,20,70,40,60,80};
        Node root= null;
        for(int key: data){
            tree.insert(key);
        }
        tree.inorder();

    }
}
