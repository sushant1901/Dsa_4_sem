public static rPrint(Node head)
{
  if(head== null)
    return;
  System.out.println(head.data + " ");
  rPrint(head.next);
}
  
