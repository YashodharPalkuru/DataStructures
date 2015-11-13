package com.mrec.mtech1;

import java.util.Scanner;

public class LinearSearch {
	
   static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinearSearch search = new LinearSearch();
		Integer arr[] = search.readElements();
		Integer element = search.readSearchElement();
		search.linearSearch(arr,element);
		
	}

	private void linearSearch(Integer[] arr, Integer element) {
		int flag = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == element){
				flag = 1;
				System.out.println("search element found at index :: "+ i);
			}
			
		}
		if(flag == 0){
			System.out.println("searching element not found");
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
