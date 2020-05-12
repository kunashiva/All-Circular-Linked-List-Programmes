import java.util.Scanner;
class DeleteNodeAtEndOfCircularLinkedList
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
 int count=0;
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
  count++;
 } 
 
 void Delete()
 {
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else if(count==1)
  {
   head=tail=null;
  }
  else if(head!=tail)
  {
   Node last=head;
   Node lastToPrevious=null;
   while(last.next!=head)
   {
    lastToPrevious=last;
    last=last.next;
   }
   lastToPrevious.next=head;
   last=null;
  }
  count--;
 }
 
 void Display()
 {
  Node n=head;
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   System.out.println("Elements of the list are");
   do
   {
    System.out.print(n.data+" ");
    n=n.next;
   }while(n!=head);
   System.out.println();
  }
 }
 
 public static void main(String ar[])
 {
  DeleteNodeAtEndOfCircularLinkedList d=new DeleteNodeAtEndOfCircularLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter");
  int n=s.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   d.AddNode(data);
  } 
  System.out.println("Original List is");
  d.Display();
  while(d.head!=null)
  {
   d.Delete();
   d.Display();
  }
 }
}