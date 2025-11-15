package com.demo.test;

import java.util.Arrays;

import com.demo.service.BubbleSort;
import com.demo.service.HeapSort1;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {53,10,12,7,55,10,20};
		BubbleSort ob = new BubbleSort();
		
	int [] res=ob.normalBubbleSort(arr);
	System.out.println(Arrays.toString(res));
	
		 ob.improvedBubbleSortAsc(arr);
	 ob.improvedBubbleSortDesc(arr);
		
		
//		int [] arr= {5,3,8,1,4,6,2,7};
//		QuickSort.quickSort(arr, 0, arr.length-1);
		
//	//insertion sort
//		int[] arr= {21,11,13,22,25,7,10,8,1};
//		InsertionSort.insertionSortAscending(arr);
//		System.out.println("+----------------------------+");
//		InsertionSort.insertionSortDescending(arr);
		//int[] arr= {20,5,7,11,21,2,7,25,30,3};
//		int []arr= {20,5,7,11,21,2,7,25,30,3};
//		MergeSort.mergeSort(arr,0,arr.length-1);
		
		
//		int [] res=CountingSort.countingSortAscending(arr);
//		System.out.println(Arrays.toString(res));
		
		
//		InsertionSort1.insertionSortDesc(arr);
		
//		SelectionSort.selectionSortAscending(arr);
		
		//heap sort
	//	int arr[]= {3,7,5,10,9,8,4};
		
//		HeapSort.heapsortAscending(arr);
		
	 //  HeapSort1.heapSortAsce(arr);
		
		
	}

}
