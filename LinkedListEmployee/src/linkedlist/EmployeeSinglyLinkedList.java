package linkedlist;

import beans.Employee;

public class EmployeeSinglyLinkedList {
Node head;
class Node{
	Employee data;
	Node next;
	public Node(Employee data)
	{
		this.data=data;
		this.next=null;
	}
}
public EmployeeSinglyLinkedList() {
	super();
	this.head=null;
}

public void addNewEmployee(Employee ob)
{
	Node newNode=new Node(ob);
	if(head==null)
	{
		newNode=head;
		
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

public void displaydata()
{
	if(head==null)
	{
		System.out.println("list is empty");
	}else {
	Node temp=head;
	while(temp.next!=null)
	{
		System.out.println(temp.data+"");
		temp=temp.next;
	}
	}
}
}
