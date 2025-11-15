package com.demo.linkedlist;

public class DoublyLinkedList2 {
Node head;
class Node{
	int data;
	Node prev;
	Node next;
	public Node(int data)
	{
		this.data=data;
		prev=null;
		next=null;
	}
}
public void addNewNode(int val)
{
Node newNode=new Node(val);
{
	if(head==null)
	{
		head=newNode;
		
	}
	else {
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		newNode.prev=temp;
		temp.next=newNode;
		}
	
	
}
}
public void addByPos(int val,int pos)
{
	Node newNode=new Node(val);
	if(pos==1)
	{
		newNode.next=head;
		if(head!=null)
		{
		head.prev=newNode;
		head=newNode;
		}
	}
	else {
		Node temp=head;
		for(int i=0;temp!=null&&i<pos-2;i++)
		{
			temp=temp.next;
		}
		if(temp!=null)
		{
		newNode.next=temp.next;
		newNode.prev=temp;
		temp.next=newNode;
		if(newNode.next!=null)
		{
			newNode.next.prev=newNode;
		}
		}
		else {
			System.out.println(pos+"beyond the limit");
		}
		
		
	}
	
}
public void addByValue(int val,int num) {
	Node newNode=new Node(val);
	Node temp=head;
	while(temp!=null&&temp.data==val)
	{
		temp=temp.next;
	}
	if(temp!=null)
	{
		newNode.prev=temp;
		newNode.next=temp.next;
		
		temp.prev=newNode;
	}
	else {
		System.out.println("not found");
	}
}

public void display()
{
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ---->");
		temp=temp.next;
	}
	
}
}
