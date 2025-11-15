package com.demo.test;

import com.demo.linkedlist.SinglyLinkedlist1;

public class TestLinkdedList {

	public static void main(String[] args) {
		SinglyLinkedlist1 list1 = new SinglyLinkedlist1();
		list1.addNodeAtEnd(20);
		list1.addNodeAtEnd(34);
		list1.addNodeAtEnd(45);
		list1.addNodeAtEnd(78);
		list1.displayNode();
		list1.addByPos(67, 2);
		list1.displayNode();
		list1.addByNum(54, 45);
		list1.displayNode();
		list1.addByPos(100, 8);
		list1.addByNum(23, 23);
		list1.deleteByPos(2);
		list1.displayNode();
		list1.deleteByValue(78);
		list1.displayNode();
		
	}

}
