import java.util.Scanner;
class CircularLinkedList
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
 
 void Display()
 {
  Node current=head;
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  else
  {
   System.out.println("Elements of the List");
   do
   {
    System.out.print(current.data+" ");
    current=current.next;
   }while(current!=head);
  }
 }
 
 public static void main(String ar[])
 {
  Scanner scan=new Scanner(System.in);
  CircularLinkedList c=new CircularLinkedList();
  System.out.println("Enter No of Elements you want to enter in Circular Linked List");
  int n=scan.nextInt();
  System.out.println("Enter elements");
  for(int i=0;i<n;i++)
  {
   int data=scan.nextInt();
   c.AddNode(data);
  }
  System.out.println("Original List:");
  c.Display();
 }
}