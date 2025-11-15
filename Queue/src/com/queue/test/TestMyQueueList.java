package com.queue.test;

import com.queue.service.MyQueueList;

public class TestMyQueueList {

	public static void main(String[] args) {
		 MyQueueList list = new MyQueueList();
		 list.enqueue(23);
		 list.enqueue(45);
		 list.enqueue(56);
		 list.dequeue();
		 list.dequeue();
		 list.dequeue();
		 list.dequeue();
	}

}
