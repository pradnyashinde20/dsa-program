package com.demo.test;

import com.demo.linkedlist.CircularsinglyLinkedList;

public class TestSinglyCircularLinkedList {

	public static void main(String[] args) {
//		SinglyCircularLinkedList clist = new SinglyCircularLinkedList();
//		
//		clist.addNodeAtEnd(22);
//		clist.addNodeAtEnd(45);
//		clist.addNodeAtEnd(34);
//		clist.addNodeAtEnd(11);
//		clist.displayData();
//		clist.addByPos(67, 3);
//		clist.displayData();
//		clist.addByValue(12, 45);
//		clist.displayData();
// 
		CircularsinglyLinkedList li=new CircularsinglyLinkedList();
		li.addNewNode(12);
		li.addNewNode(23);
		li.display();
		System.out.println("---------------------");
		li.addByPosition(1,40);
		li.display();
		System.out.println("---------------------");
		li.addByValue(45,23);
		li.display();
		System.out.println("---------------------");
		li.deleteByPosition(2);
		li.display();
		System.out.println("---------------------");
		li.deleteByPosition(3);
		li.display();
	}

}
