/*Q1. Write a generic sort method for implementing selection sort algorithm with given comparator
Object as parameter. Below is reference code for selection sort do the respective changes to make it
generic using comparator
static void selectionSort(Integer [] arr) {
for(int i=0; i<arr.length-1; i++)
for(int j=i+1; j<arr.length; j++)
if(arr[i] > arr[j]) {
Integer temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}*/

package com.sunbeam.p1;

import java.util.Comparator;

public class SelectionSort {
	public static <T> void selectionSort(T[] arr,Comparator c) {
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++) 
			{
				if(c.compare(arr[i],arr[j])>0) 
				{
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

		
public static void main(String []args){

Integer arr[] = {10,29,1,56,43,11};
	

SelectionSort.<Integer>selectionSort(arr,Comparator.naturalOrder());
for(Integer ele:arr)
System.out.println(ele);
}
}