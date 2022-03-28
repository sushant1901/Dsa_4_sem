package Linkedlist;
import org.w3c.dom.Node;

import java.util.*;
public class linkedList3{
    Node head;


    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    public void deleteFirst(){
        if(head== null){
            System.out.println("the list id empty");
            return;
        }
        head =head.next;
    }

    public void deleteLast(){
        if(head== null){// corner cases
            System.out.println("the list id empty");
            return;
        }
        if(head.next==null){// corner cases
            head= null;
            return;
        }
        Node secondLast =head;
        Node lastNode= head.next;
        while(lastNode.next !=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
    }



    public static void main(String[] args) {
        linkedList1 list= new linkedList1();
        list.deleteFirst();
        list.deleteLast();

    }


}
