package com.demo.test;

import com.demo.linkedlist.SinglyLinkedList;

public class SinglyLinkedlistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list1=new SinglyLinkedList();
		list1.addNode(12);
		list1.addNode(10);
		list1.addNode(15);
		list1.addNode(7);
		list1.addNode(2);
		list1.displayData();
		list1.addByNum(20,15);
		list1.displayData();
		list1.addByPosition(3, 8);
		list1.displayData();
		
	}

}
