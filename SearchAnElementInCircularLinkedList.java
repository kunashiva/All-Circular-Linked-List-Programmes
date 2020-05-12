import java.util.Scanner;
class SearchAnElementInCircularLinkedList
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
 void addNode(int  data)
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
  
 void SearchElement(int data)
 {
  int node=1;
  boolean flag=false;
  Node current=head;
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   while(current!=null)
   {
    if(current.data==data);
    {
     flag=true;
     break;
    }
    
    current=current.next;
    node++;
   }
   if(flag)
   {
    System.out.println(data+" found at "+node+" node");
   }
   else
   {
    System.out.println("List is empty");
   }
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
   System.out.println("Elements of the list are");
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
  SearchAnElementInCircularLinkedList l=new SearchAnElementInCircularLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter into list");
  int  n=s.nextInt();
  System.out.println("Now enter the elements ");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.addNode(data);
  }
  System.out.println("Original List");
  l.Display();
  System.out.println("Enter the element that you want to search");
  int data=s.nextInt();
  l.SearchElement(data);
 }
}