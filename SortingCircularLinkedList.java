import java.util.Scanner;
class SortingCircularLinkedList
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
 
 void Sort()
 {
  if(head==null)
  {
   System.out.println("list is empty");
  }
  else
  {
   Node current=head;
   Node temp=null,index=null;
   do
   {
    temp=current;
    index=current.next;
    while(index!=head)
    {
     if(current.data>index.data)
     {
      int swap=temp.data; 
      temp.data=index.data; 
      index.data=swap;
     } 
     else
     {
      temp=index;
     }
     index=index.next;
    }
    current=current.next;
   }while(current!=head);
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
   Node n=head;
   System.out.println("Elements os the list are");
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
  SortingCircularLinkedList l=new SortingCircularLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the no of elements that you want to enter in list");
  int n=s.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.AddNode(data);
  }
  System.out.println("Original list");
  l.Display();
  System.out.println("Updated List");
  l.Sort();
  l.Display();
 }
}