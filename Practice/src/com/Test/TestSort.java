package com.Test;

import com.sort.BubbleSort;
import com.sort.InsertionSort;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {23,78,2,6,4,89};
BubbleSort b=new BubbleSort();
b. bubbleSort(arr);
System.out.println("=============================");
InsertionSort i=new InsertionSort();
System.out.println("insertion sort");
i.insertionSort(arr);

	}

}
