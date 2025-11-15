package com.demo.service;

import java.util.Arrays;

public class MergeSort {
	public static void mergeSortAlgo(int arr[],int start,int mid,int end)
	{
		int n1=mid-start+1;
		int n2=end-mid;
		int[] leftarray=new int[n1];
		int[] rigtharray=new int[n2];
		for(int i=0;i<n1;i++)
		{
			leftarray[i]=arr[start+i];
			
		}
		for(int i=0;i<n2;i++)
		{
			rigtharray[i]=arr[mid+1+i];         
			
		}
		int i=0;
		int j=0;
		int k=start;
		while(i<n1 && j<n2)
		{
			if(leftarray[i]<rigtharray[j])
			{
				arr[k]=leftarray[i];
				i++;
				k++;
				
			}
			else {
				arr[k]=rigtharray[j];
				j++;
				k++;
			}
				
		}
		while(i<n1)
		{
			arr[k]=leftarray[i];
			i++;
			k++;
			
		}
		while(j<n2)
		{
			arr[k]=rigtharray[j];
			j++;
			k++;
		}
		System.out.println(start+" "+mid+" "+end);
		System.out.println(Arrays.toString(leftarray));
		System.out.println(Arrays.toString(rigtharray));
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort(int arr[],int start,int end)
	{
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			mergeSortAlgo(arr,start,mid,end);
			
		}
	}

}
