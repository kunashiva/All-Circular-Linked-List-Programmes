import java.util.Scanner;
class DeleteMiddleElementOfCircularLinkedList
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
 
 void delete()
 {
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  else if(count==1)
  {
   head=tail=null;
  }
  else if(head!=tail)
  {
   Node previousToMid=null;
   Node Mid=head;
   int size=(count%2==0)?(count/2):((count+1)/2);
   for(int i=1;i<size;i++)
   {
    previousToMid=Mid;
    Mid=Mid.next;
   }
   if(previousToMid!=null)
   {
    previousToMid.next=Mid.next;
    Mid=null;
   }
   else 
   {
    head=tail=Mid.next;
    tail.next=head;
   }
  }
  count--;
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
  DeleteMiddleElementOfCircularLinkedList d=new DeleteMiddleElementOfCircularLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter how many elements you want to enter");
  int n=s.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   d.AddNode(data);
  }
  System.out.println("Original List:");
  d.Display();
  while(d.head!=null)
  {
   System.out.println("Updated List:");
   d.delete();
   d.Display();
  }
 }
}