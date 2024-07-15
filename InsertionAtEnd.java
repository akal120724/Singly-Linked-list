import java.util.*;
public class InsertionAtEnd{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int val){
      data= val;
      next= null;
    }
  }
  InsertionAtEnd(){
    head=null;
  }
  public void insertend(int val){
    Node newnode= new Node(val);
    if(head==null){
      head=newnode;
    }else{
      Node temp=head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=newnode;
    }
  }
  public void display(){
    Node temp=head;
    while( temp.next!=null){
      System.out.println("temp.data+"->");
      temp=temp.next;
    }
     System.out.println("null");
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    InsertionAtEnd list=new InsertionAtEnd();
    int n=sc.nextInt();
    for(int i=0;i<n;i++);{
      int val=sc.nextInt();
    list.insertend(val);
  }
  list.display();
}
}
    
