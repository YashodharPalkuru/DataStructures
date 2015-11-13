package com.mrec.mtech1;

import java.util.Scanner;

public class StackArray {
	public static Scanner sc =  new Scanner(System.in);
	Integer arr[] = new Integer[10];

	public static void main(String[] args) {
    	StackArray stack = new StackArray();
    	Integer element = stack.readElement();
		stack.push(element);
		stack.push(element+1);
		stack.push(element+2);
		stack.push(element+3);
    	stack.pop();
    	//stack.pop();
    	stack.display();
    	//stack.peek();
    	Integer ser = stack.search(element+2);
    	if(ser != -1){
    		System.out.println("element found at:: "+(ser+1));
    	}
    	else{
    		System.out.println("search not found");
    	}
    	//stack.empty();
    	
   }

	private void display() {
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	private void empty() {
		for(int i=0; i<arr.length; i++){
			arr[i] = null;
		}
		
	}

	private Integer search(Integer element) {
		
		for(int i=0; i<arr.length; i++){
		    if(arr[i] == element){
		    	return i;
		    }
		}
		return -1;


		
	}

	/*private void peek() {
		// TODO Auto-generated method stub
		
	}*/

	private void pop() {
		int flag = 0;
		for(int i=arr.length-1; i>=0; i--){
			if(arr[i]!=null){
				flag = 1;
				arr[i] = null;
				break;
				
			}
		}
		if(flag == 0){
			System.out.println("Stackto is empty");
			
		}
		
		
	}

	private void push(Integer element) {
		int flag = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==null){
				flag = 1;
				arr[i] = element;
				break;
				
			}
		}
		if(flag == 0){
			System.out.println("stack is full");
			
		}
		
		
		
	}
	
private Integer readElement() {
		
		System.out.println("Enter element");
		Integer element = sc.nextInt();
		return element;
	}
}
