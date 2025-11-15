package com.demo.linkedlist;
public class SinglyLinkedList {
Node head;
class Node{
	int data;
	Node next;
	public Node(int data)
	{
	this.data=data;
	next=null;
	}	
	
}
public  SinglyLinkedList () {
	head=null;
}
public void addByNum(int value,int num)
{
	Node newNode=new Node(value);
	Node temp=head;
	while(temp!=null && temp.data!=num)
	{
		temp=temp.next;
	}
	if(temp!=null)
	{
		newNode.next=temp.next;
		temp.next=newNode;
	}
	else {
		System.out.println(num+"not found");
	}
}
public void addNode(int value)
{
	Node newNode=new Node(value);
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
		temp.next=newNode;
	}
}
public void displayData() {
	// TODO Auto-generated method stub
	if(head==null)
	{
		System.out.println("list is empty");
	}
	else {
		for(Node temp=head;temp!=null;temp=temp.next)
		{
			System.out.println(temp.data+"  ");
		}
		System.out.println("null");
	}
}

//add by position
public void addByPosition(int pos,int value)
{
	Node newNode=new Node(value);
	if(pos==1)
	{
		newNode.next=head;
		head=newNode;
		
	}
	else {
		Node temp=head;
		for(int i=1;temp!=null&&i<=pos-2;i++)
		{
			temp=temp.next;
		}
		if(temp!=null)
		{
			newNode.next=temp.next;
			temp.next=newNode;
		}
		else {
			System.out.println("give postion"+pos+" beyond the length");
		}
	}
	
}

public void addByValue(int val,int pos)
{
	Node newNode=new Node(val);
	if(head!=null&& head.data==val){
	{
		
	}
}
}
}


