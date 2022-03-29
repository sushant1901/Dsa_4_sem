package Linkedlist;
import org.w3c.dom.Node;

import java.util.*;
public class linkedList2 {
    Node head;


    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next= null;
        }
    }
   /* public void addFirst(int data){
        Node newNode =new Node(data);
        if(head== null){
            head=newNode;
            return;
        }
        newNode=head;
        head=newNode;
    }*/

    public void printList(){
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data+" -> ");
            currNode= currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedList1 list= new linkedList1();
       // list.addFirst(1);
       // list.printList();

        list.addlast(2);
    }

    public void addlast(int data) {
        Node newNode= new Node(data);
        if(head == null){// corner case
            head = newNode;
            return;
        }
        Node currNode= head;
        while(currNode !=null){
            currNode= currNode.next;
        }
        currNode.next= newNode;
    }

}