import java.util.Scanner;
class FindMinMaxOfCircularLinkedList
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
 }
 
 void Min()
 {
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  else
  {
   Node current=head;
   int min=head.data;
   do
   {
    current=current.next;
    if(min>current.data)
    {
     min=current.data;
    }
   }while(current!=head);
   System.out.println(min);
  }
 }
 
 void Max()
 {
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  else
  {
   Node current=head;
   int max=head.data;
   do
   {
    current=current.next;
    if(max<current.data)
    {
     max=current.data;
    }
   }while(current!=head);
   System.out.println(max);
  }
 }
 
 void Display()
 {
  if(head==null)
  {
   System.out.println("list is empty");
  }
  else
  {
   Node current=head;
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
  FindMinMaxOfCircularLinkedList c=new FindMinMaxOfCircularLinkedList();
  Scanner s=new Scanner(System.in); 
  System.out.println("Enter no of elements you want to enter");
  int n=s.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   c.AddNode(data);
  }
  System.out.println("Original List");
  c.Display();
  System.out.print("Min Element of the list is: ");
  c.Min();
  System.out.print("Max Element of the List is: ");
  c.Max();
  
 }
}