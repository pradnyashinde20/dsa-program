package com.demo.test;

import com.demo.linkedlist.DoublyLinkedList;
import com.demo.linkedlist.DoublyLinkedList2;

public class TestDoublyLinkedList {
	public static void main(String[]args) {
	DoublyLinkedList dlist = new DoublyLinkedList();
    dlist.addNewNode(20);
    dlist.addNewNode(56);
    dlist.addNewNode(32);
    dlist.addNewNode(45);
   
    dlist.displayData();
    dlist.addBypos(23, 3);
    dlist.displayData();
    dlist.addByValue(34, 20);
    dlist.displayData();
    dlist.deleteByPos(3);
    dlist.displayData();
    dlist.deleteByVal(45);
    dlist.displayData();
	
//		DoublyLinkedList2 li=new DoublyLinkedList2();
//		li.addNewNode(12);
//		li.addNewNode(20);
//		li.addNewNode(25);
//		li.display();
//		System.out.println("-------------------------");
//		li.addByPos(11,2);
//		li.display();
//		System.out.println("-------------------------");
//		li.addByValue(25,10);
//		li.display();
}
}