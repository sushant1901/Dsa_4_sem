// to delete the kTH node in circular linked list.

void  deleteK(int k){
  if(head== null) System.out.println("List is empty");
  
  if(k==1) deleteFirst( )// go to delete head function.
  Node temp=head;
  for(int i=0;i< k-2;i++)
    temp=temp.next;
  temp.next=temp.next.next;
}
