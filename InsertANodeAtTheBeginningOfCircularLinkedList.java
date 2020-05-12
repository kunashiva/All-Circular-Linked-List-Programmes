import java.util.Scanner;
class InsertANodeAtTheBeginningOfCircularLinkedList
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
   tail.next=head;
  }
  else
  {  
   tail.next=newNode; 
   tail=newNode;
   tail.next=head;
  }
 }
  
 void InsertAtBeginning(int data)
 {
  Node newNode=new Node(data);
  if(head==null)
  {
   head=newNode;
   tail=newNode;
   tail.next=head;
  }
  else
  {
   newNode.next=head;
   head=newNode;
   tail.next=head;
  }
 }
 
 void Display()
 {
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   Node current=head;
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
  InsertANodeAtTheBeginningOfCircularLinkedList l=new InsertANodeAtTheBeginningOfCircularLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the no of elements of the list");
  int n=s.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.AddNode(data);
  }
  System.out.println("Original List ");
  l.Display();
  System.out.println("Enter the element you want to enter at the beginning of the list");
  int newNode=s.nextInt();
  System.out.println("Updated list"); 
  l.InsertAtBeginning(newNode);
  l.Display();
 }
}