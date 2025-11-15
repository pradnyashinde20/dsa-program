package com.queue.test;

import com.queue.service.CircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		 CircularQueue clist = new  CircularQueue(3);
		 clist.enqueue(34);
		 clist.enqueue(45);
		 clist.enqueue(65);
		 clist.enqueue(65);
		 clist.dequeue();
		 clist.dequeue();
		 clist.dequeue();
		 clist.dequeue();

	}

}
