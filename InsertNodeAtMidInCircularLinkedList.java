import java.util.Scanner;
class InsertNodeAtMidInCircularLinkedList
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
   tail.next=head;
  }
  else
  {
   tail.next=newNode;
   tail=newNode;
   tail.next=head;
  }
  count++;
 }
 
 void InsertAtMid(int data)
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
   Node current=head;
   Node previousToMid=null;
   int size=count%2==0?(count/2):((count+1)/2);
   if(size==1)
   {
    head.next=newNode;
    newNode.next=tail;
   }
   else
   {
    for(int i=1;i<size;i++)
    {
     previousToMid=current;
     current=current.next;
    }
    previousToMid.next=newNode;
    newNode.next=current;
   }
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
  InsertNodeAtMidInCircularLinkedList l=new InsertNodeAtMidInCircularLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the no of elements of the list");
  int n=s.nextInt();
  System.out.println("now enter the Elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.AddNode(data);
  } 
  System.out.println("Original List is");
  l.Display();
  System.out.println("Enter the element that you want to enter at Mid in list");
  int newNode=s.nextInt();
  l.InsertAtMid(newNode);
  System.out.println("updated list");
  l.Display();
 }
}