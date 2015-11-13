package com.mrec.mtech1;

import java.util.Scanner;

public class LinearSearchRecursive {
	
   static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinearSearchRecursive search = new LinearSearchRecursive();
		Integer arr[] = search.readElements();
		Integer element = search.readSearchElement();
		Integer index = 0; 
		index = search.linearSearch(arr,element,index);
		if(index != -1){
			System.out.println("search element found at index :: "+ index);
		}
		else
			System.out.println("searching element not found");

	}

	private Integer linearSearch(Integer[] arr, Integer element, Integer index) {
		if(index >= arr.length){
		return -1;
		}
		if(arr[index] == element){
			return index;
		}
		else{
			return linearSearch(arr, element, ++index);
		}
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
