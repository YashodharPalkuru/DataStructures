package com.mrec.mtech1;

import java.util.Scanner;

public class BinarySearch {
	
   static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearch search = new BinarySearch();
		Integer arr[] = search.readElements();
		Integer element = search.readSearchElement();
		arr = search.sortElements(arr);
		int i = search.binarySearch(arr,element) ;
		if(i == -1){
			System.out.println("not found");
		} else{
			System.out.println("Found at "+ (i+1));
		}
		
	}

	private Integer[] sortElements(Integer[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++){
			
			for(int j=i; j<arr.length; j++){
				if(arr[i] > arr[j])
				{
					swapElements(arr,i,j);
				}
			}
			
		}
		return arr;
	}
	
	private void swapElements(Integer[] arr, int a, int b){
		Integer temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}

	private int binarySearch(Integer[] arr, Integer element) {
		int l = 0;
		int h = arr.length-1;
		int m ;
		while(l<h){
			m = (l+h)/2;
			if(arr[m] == element)
			{
				return m;
			}
			else if(element < arr[m]){
				h= m-1;
			}
			else if(element > arr[m]){
				l= m+1;
			}
		}
		return -1;
	}

	private Integer readSearchElement() {
		// TODO Auto-generated method stub
		System.out.println("Enter search element");
		Integer element = sc.nextInt();
		return element;
	}

	private Integer[] readElements() {
		// TODO Auto-generated method stub
		System.out.println("Enter no of elements");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		Integer arr[] = new Integer[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();	
		}
		return arr;
	}
	

}
