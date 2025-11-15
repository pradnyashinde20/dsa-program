package com.queue.service;

public class MyQueueList {
Node front;
Node rear;
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public MyQueueList() {
	front = null;
	rear = null;
}

public boolean isEmpty() {
	return front ==null && rear ==null;
}

public void enqueue(int val) {
	Node newNode = new Node(val);
	if(isEmpty()) {
		front = newNode;
	}else {
		rear.next = newNode;
	}
	rear = newNode;
	System.out.println("added num"+val);
}

public int dequeue() {
	if(!isEmpty()) {
	Node temp = front;
	front =front.next;
	if(front ==null) {
		rear =null;
	}
	temp.next=null;
	System.out.println(temp.data);
	return temp.data;
}else {
	System.out.println("queue empty");
	return -1;
 }
}
}
