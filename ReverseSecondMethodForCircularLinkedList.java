import java.util.Scanner;
class ReverseSecondMethodForCircularLinkedList
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
 
 void Reverse()
 {
  Node current=head;
  Node next=null;
  Node previous=null;
  Node Circular=head;//this is the first Node If the list is Not reversed So it is the Last Node if the Linked List is Reversed.
  do
  {
   next=current.next;
   current.next=previous;
   previous=current;
   current=next;
  }while(current!=head);
  head=previous;//if we reverse the Linked List last node will be the head So here Last node is Pervious So make Previous as Head Node;
  Circular.next=head;//For circular linked list the next value of last Node is head So we are making Next value of last Node points to head so that it will becomme Circular linked List;
  Display();
 }
 
 void Display()
 {
  Node current=head;
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   System.out.println("Elements of the list are");
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
  ReverseSecondMethodForCircularLinkedList r=new ReverseSecondMethodForCircularLinkedList();
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter");
  int n=scan.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=scan.nextInt();
   r.AddNode(data);
  }
  System.out.println("Original Linked List");
  r.Display();
  System.out.println("Reversed Linked List");
  r.Reverse();
  
 }
}