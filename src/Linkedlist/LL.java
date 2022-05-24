/*package Linkedlist;

public class LL {
    linkedList1.Node head;
     private static int size;
     LL(){
         this.size=0;
     }

    static class Node{
        int data;
        linkedList1.Node next;
        Node(int data){
            this.data=data;
            this.next= null;
            size++;
        }
    }
    public void addFirst(int data){
        linkedList1.Node newNode =new linkedList1.Node(data);
        if(head== null){
            head=newNode;
            return;
        }
        newNode=head;
        head=newNode;
    }

    public void printList(){
        linkedList1.Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data+" -> ");
            currNode= currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedList1 list= new linkedList1();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.printList();

        list.addlast(0);
        list.printList();
        list.deleteFirst();
        list.deleteLast();
        list.printList();


        System.out.println(list.getSize());


    }

    void addlast(int data) {
        linkedList1.Node newNode= new linkedList1.Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        linkedList1.Node currNode= head;
        while(currNode !=null){
            currNode= currNode.next;
        }
        currNode.next= newNode;
    }

    public void deleteFirst() {
        if(head== null){
            System.out.println("the list id empty");
            return;
        }
        size--;
        head =head.next;
    }

    public void deleteLast() {
        if(head== null){// corner cases
            System.out.println("the list id empty");
            return;
        }
        size--;
        if(head.next==null){// corner cases
            head= null;
            return;
        }
        linkedList1.Node secondLast =head;
        linkedList1.Node lastNode= head.next;
        while(lastNode.next !=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
    }

    public int getSize(){
         return size;
    }
}
*/
