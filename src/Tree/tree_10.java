package Tree;

import org.w3c.dom.Node;

public class tree_10 {
    public Node search(Node root, int key){
        if(root ==null || root.key==key) return root;
        if(root.key<key) return search(root.right,key);
        return search(root.right,key);

    }
}
