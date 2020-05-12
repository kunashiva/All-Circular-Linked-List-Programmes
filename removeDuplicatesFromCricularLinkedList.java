import java.util.Scanner;
class removeDuplicatesFromCricularLinkedList
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
 
 void removeDuplicates()
 { 
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   Node current=head;
   Node temp=null;
   Node index=null;
   do
   {
     temp=current;
    index=current.next;
    while(index!=head)
    {
     if(current.data==index.data)
     {
      temp.next=index.next;
      
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
   System.out.println("list is empty");
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
  removeDuplicatesFromCricularLinkedList l=new removeDuplicatesFromCricularLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the no of elements you want  enter in the list");
  int n=s.nextInt();
  System.out.println("Enter the elments ");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.AddNode(data);
  }
  /*System.out.println("Original List");
  l.Display();*/
  System.out.println("Updated list");
  l.removeDuplicates();
  l.Display();
 }
}