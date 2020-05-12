import java.util.Scanner;
class DeleteBeginningNodeOfCircularLinkedList
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
  
 void addNode(int data)
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
 
 void Delete()
 {
  if(head==null)
  {
   System.out.println("List is empty we cannot delete");
  }
  else if(head!=tail)
  {
   head=head.next;
   tail.next=head;
  }
  else
  {
   head=tail=null;
  }
 }
 
 void Display()
 {
  Node current=head;
  if(head==null)
  {
   System.out.println("list is empty");
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
  DeleteBeginningNodeOfCircularLinkedList l=new DeleteBeginningNodeOfCircularLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter");
  int n=s.nextInt();
  System.out.println("now Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.addNode(data);
  }
  System.out.println("Original Linked List");
  l.Display();
  while(l.head!=null)
  {
   l.Delete();
   System.out.println("Updated list");
   l.Display();
  }
 }
}