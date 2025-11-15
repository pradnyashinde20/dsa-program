package com.demo.linkedlist;

import com.demo.linkedlist.SinglyLinkedList.Node;

public class SinglyLinkedlist1 {
    Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	public SinglyLinkedlist1() {
		head = null;
	}
	
	// add at the end in linked list
	public void addNodeAtEnd(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head= newNode;
		}else {
			Node temp = head;
			while(temp.next !=null) {
				temp=temp.next;
			}
			temp.next= newNode;
			
		}
	}
	//display nodes of linked list
	public void displayNode() {
		if(head ==null) {
			System.out.println("linked list is empty");
		}else{
			for(Node temp=head;temp!=null;temp=temp.next) {
				System.out.print(temp.data+"------>");
			}
		}
		System.out.println();
	}
	
	//add at the given position
	public void addByPos(int value, int pos) {
		Node newNode = new Node(value);
		if(pos ==1) {
			newNode.next = head;
			head = newNode;
		}else {
			Node temp = head;
			for(int i=0;temp!=null && i<pos-2;i++) {
				temp = temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next = newNode;
			}else {
				System.out.println("given pos is beyond the linked list");
			}
		}
	}
	
	public void addByNum(int value,int num) {
		Node newNode = new Node(value);
		Node temp = head;
		while(temp!=null && temp.data!=num) {
			temp=temp.next;
		}
	     if(temp!=null) {
		   newNode.next = temp.next;
		   temp.next = newNode;
	   }else {
		   System.out.println(num+" data not found");
	   }
	}
			
	public void deleteByValue(int val) {
		Node temp = head;
		if(head == null) {
			System.out.println("list is empty");
		}
		if(head.data == val) {
			head=temp.next;
			temp.next =null;
		}else {
			Node prev=null;
			while(temp!=null&& temp.data!=val) {
				 prev= temp;
				temp=temp.next;
			}
			if(temp!=null) {
				prev.next = temp.next;
				temp.next = null;
			}else {
				System.out.println("data not found");
			}
		}
			
	}
  
	public void deleteByPos(int pos) {
		Node temp = head;
		if(pos==1) {
			head = temp.next;
			temp.next =null;
		}else {
			Node prev=null;
			for(int i=0;temp !=null&&i<pos-1;i++) {
			  prev=temp;
			  temp=temp.next;
			}
			if(temp!=null) {
				prev.next = temp.next;
				temp.next =null;
			}else {
				System.out.println("pos is beyond limit");
			}
		}
	}
		
	}
	


