package com.demo.linkedlist;

public class CircularsinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
		}
	}
	public void addNewNode(int value)
	{
		Node newNode=new Node(value);
		if(head==null)
		{
			head=newNode;
			newNode.next=head;
		}
		else {
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			newNode.next=head;
			temp.next=newNode;
			
		}
		
	}
	public void display()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("list is empty");
		}
		do
		{
			System.out.print(temp.data+"-----------");
			temp=temp.next;
		}while(temp!=head);
		
	}
	public void addByPosition(int pos,int val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			System.out.println("list is empty");
		}
				if(pos==1)
				{
					Node temp=head;
					while(temp.next!=head) {
						temp=temp.next;
					}
					newNode.next=head;
					head=newNode;
					temp.next=newNode;
				}
				else {
					Node temp=head;
					int i=1;
					for(i=1;temp.next!=head&&pos<=i-2;i++)
					{
						temp=temp.next;
					}
					if(i>pos-2)
					{
					temp.next=newNode.next;
					newNode.next=temp;
					}
					else {
						System.out.println(pos+"beyound the limit");
					}
					
				}
	}

	public  void addByValue(int val,int pos)
	{
		Node newNode=new Node(val);
		if(head.data==val)
		{
			Node temp=head;
			newNode.next=head;
			head=newNode;
			temp.next=newNode;			
		}
		else {
			Node temp=head;
			do {
				temp=temp.next;
			}
			while(temp.next!=head&&temp.data!=val);
			if(temp!=head)
			{
				newNode.next=temp.next;
				temp.next=newNode;
			}
			else {
				System.out.println("not found");
			}
		}
	}
	public void deleteByPosition(int pos)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else {
			Node temp=head;
			if(pos==1)
			{
				Node tail=head;
				while(tail.next!=head)
				{
					tail=tail.next;
				}
				if(tail==head)
				{
					head=null;
				}
				else {
					head=head.next;
					temp.next=null;
					tail.next=head;
				}
			}
			else {
				Node prev=null;
				int i=0;
				for(;temp.next!=head&&i<pos-1;i++)
				{
					prev=temp;
					temp=temp.next;
				}
				if(i==pos-1)
				{
					prev.next=temp.next;
					temp.next=null;
				}
				else {
					System.out.println("positon not found"+pos);
				}
			}
		}
	}
}
