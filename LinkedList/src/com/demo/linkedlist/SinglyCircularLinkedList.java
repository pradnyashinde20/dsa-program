package com.demo.linkedlist;

public class SinglyCircularLinkedList {
  Node head ;
  class Node{
	  int data;
	  Node next;
	public Node(int data) {
		this.data = data;
		next=null;
	}	  
	  
  }
  
  public void addNodeAtEnd(int val) {
	  Node newNode = new Node(val);
	  
	  if(head ==null) {
		  head = newNode;
		  newNode.next = head;
	  }else {
		  Node temp = head;
		  while(temp.next !=head) {
			  temp= temp.next;
		  }
		  temp.next = newNode;
		  newNode.next = head;
		  
	  }
  }
  
  public void displayData() {
	  if(head == null) {
		  System.out.println("list is empty");
	  }else {
		  Node temp = head;
		  do{
			System.out.print(temp.data+"---->");  
			temp=temp.next;
		  }while(temp!=head);
		  System.out.println();
	  }
  }
  
  public void addByPos(int val,int pos) {
	  if(head == null) {
		  System.out.println("list is empty");
	  }else {
		  Node newNode = new Node(val);
		  if(pos==1) {
			  Node temp=head;
			  while(temp.next!=head) {
				  temp=temp.next;
			  }
			  newNode.next = head;
			  head = newNode;
			  temp.next = head;
		  }else {
			  Node temp=head;
			  int i=1;
			  for( ;temp.next!=head && i<=pos-2;i++ ) {
				  temp=temp.next;
			  }
			  if(i>pos-2) {
				  newNode.next = temp.next;
				  temp.next = newNode;
			  }else {
				  System.out.println("given position"+pos+"beyond limit");
			  }
		  }
		
	  }
  }
  
  public void addByValue(int val, int num) {
	  Node newNode = new Node(val);   
	  if(head.data==num) {
		  newNode.next = head.next;
		  head.next = newNode;
	  }else {
		  Node temp = head;
		  do {
			  temp=temp.next;
		  }while(temp!=head && temp.data!=num);
		  if(temp!=head) {
			  newNode.next = temp.next;
			  temp.next = newNode;
		  }else {
			  System.out.println(num+"not found");
		  }
	  }
  }
  
}
