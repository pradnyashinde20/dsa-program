package com.stack.test;

import com.stack.service.MyStackArray;

public class TestMyStackArray {

	public static void main(String[] args) {
		 MyStackArray ob = new  MyStackArray(3);
		 ob.push(23);
		 ob.push(12);
		 ob.push(34);
		 ob.push(11);
		 
		 ob.pop();
		 ob.pop();
		 ob.pop();
		 ob.pop();
		 
	}	 

}
