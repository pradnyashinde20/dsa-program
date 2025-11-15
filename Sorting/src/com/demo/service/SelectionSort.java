package com.demo.service;

import java.util.Arrays;

public class SelectionSort {
	private static int findNthMin(int[]arr, int start) {
		int minpos = start;
		int min = arr[start];
		for(int i=start;i<arr.length;i++) {
			if(min>arr[i]) {
				minpos =i;
				min=arr[i];
			}
		}
		return minpos;
	}
public static void selectionSortAscending(int[]arr) {
	for(int i=0;i<arr.length;i++) {
		int minpos = findNthMin(arr,i);
		int temp = arr[i];
		arr[i]= arr[minpos];
		arr[minpos]=temp;
			
		System.out.println(Arrays.toString(arr));
		
	}
}

}
