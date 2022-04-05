package Tree;
// JAVA implementation of tree using array
// numbering starting from 0 to n-1.

// Importing required classes
import java.io.*;
import java.lang.*;
import java.util.*;

// Class 1
// Helper class (Node class)
class Tree {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class 2 inside main() method
        Array_imp obj = new Array_imp();

        // Setting root node
        obj.Root("A");

        // obj.set_Left("B", 0);
        obj.set_Right("C", 0);
        obj.set_Left("D", 1);
        obj.set_Right("E", 1);
        obj.set_Left("F", 2);
        obj.print_Tree();
    }
}

// Class 2
// Helper class
class Array_imp {

    // Member variables of this class
    static int root = 0;
    static String[] str = new String[10];

    // Method 1
    // Creating root node
    public void Root(String key) { str[0] = key; }

    // Method 2
    // Creating left son of root
    public void set_Left(String key, int root)
    {
        int t = (root * 2) + 1;

        if (str[root] == null) {
            System.out.printf(
                    "Can't set child at %d, no parent found\n",
                    t);
        }
        else {
            str[t] = key;
        }
    }

    // Method 3
    // Creating right son of root
    public void set_Right(String key, int root)
    {
        int t = (root * 2) + 2;

        if (str[root] == null) {
            System.out.printf(
                    "Can't set child at %d, no parent found\n",
                    t);
        }
        else {
            str[t] = key;
        }
    }

    // Method 4
    // To print our tree
    public void print_Tree()
    {

        // Iterating using for loop
        for (int i = 0; i < 10; i++) {
            if (str[i] != null)
                System.out.print(str[i]);
            else
                System.out.print("-");
        }
    }
}
