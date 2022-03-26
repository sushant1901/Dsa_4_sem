package Linkedlist;
import org.w3c.dom.Node;

import java.util.*;
public class linkedList {
    Node head;// head of the linked list
    class Node{
        int data;
        Node next;
        //next is by default initialized as Null.
        Node(int d){// constructor use to define the list.

            data=d;
        }
    }
}
