package com.stack.test;

import com.stack.service.MyStackList;

public class TestMyStackList {

	public static void main(String[] args) {
	
		MyStackList ob = new MyStackList();
		ob.push(3);
		ob.push(4);
		ob.pop();
		ob.pop();
		ob.pop();
	}

}
