import java.util.Scanner;
class ReverseCircularLinkedList
{
 class Node
 {
  int data;
  Node next;
  Node(int data)
  {
   this.data=data;
  }
 }
 
 Node head=null;
 Node tail=null;
 
 void AddNode(int data)
 {
  Node newNode=new Node(data);
  if(head==null)
  {
   head=newNode;
   tail=newNode;
   newNode.next=head;
  }
  else
  {
   tail.next=newNode;
   tail=newNode;
   tail.next=head;
  }
 }
 
 void Reverse(Node current)
 {
  if(current.next==head)
  {
   System.out.print(current.data+" ");
   return;
  }
  Reverse(current.next);
  System.out.print(current.data+" ");
 }
 
 void Display()
 {
  Node current=head;
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  else
  {
   System.out.println("Elements of the Linked List");
   do
   {
    System.out.print(current.data+" ");
    current=current.next;
   }while(current!=head);
   System.out.println();
  }
 }
 
 public static void main(String ar[])
 {
  ReverseCircularLinkedList r=new ReverseCircularLinkedList();
  System.out.println("Enter no of elements you want to enter");
  Scanner scan=new Scanner(System.in);
  int n=scan.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=scan.nextInt();
   r.AddNode(data);
  }
  System.out.println("Original List");
  r.Display();
  System.out.println("Reverse of Original List");
  r.Reverse(r.head);
 }
}