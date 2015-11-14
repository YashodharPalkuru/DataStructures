package com.mrec.mtech1;

import java.util.Scanner;

public class ListArray {
	
	static Scanner sc = new Scanner(System.in);
	Integer arr[] = new Integer[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListArray list = new ListArray();
		
		
		int element;
		int index;
		String choice;
		do{
		System.out.println("enter your option 1.add 2.remove(index) 3.getElement(index) 4.getIndex(element) 5.isEmpty() 6.display  ");
		int option = sc.nextInt();
		switch(option){
		
		case 1: System.out.println("enter element to insert to list array");
		        element = sc.nextInt();
			    list.add(element);
			    list.display();
			    break;
			    
		case 2: System.out.println("enter index to delete an element in list");
                index = sc.nextInt();
	           list.remove(index);
	           list.display();
	           break;
	           
		case 3: System.out.println("enter index to get element");
       			index = sc.nextInt();
       			element =list.getElement(index);
       			System.out.println("element at index "+index+" is :: "+element);
       			break;
       			
		case 4: System.out.println("enter element to get  at index");
        		element = sc.nextInt();
        		index = list.getIndex(element);
        		System.out.println(element+"element present at  index   :: "+index);
        		break;
        		
		case 5: boolean empty = list.isEmpty();
		        System.out.println(empty);
		        break;
		        
		case 6: list.display();
		        break;
		default: System.out.println("choose correct option");
			
		}
		System.out.println("would you like to continue(y/n)");
		choice = sc.next();
		}while(choice.equals("y"));
	

	}
	
	private void display() {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		
	}


	private int indexOf(Integer element) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++){
			if(arr[i] == element){
				return i;
			}
		}
		return -1;
		
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == null){
				index = i;
				break;
			}
		}
		if(index == 0){
			return true;
		}
		
		return false;
		
	}

	private void remove(Integer index) {
		// TODO Auto-generated method stub
		if(index < arr.length){
			for(int i=index+1; i< arr.length; i++){
				arr[i-1] = arr[i];
			}
			arr[arr.length-1] = null;
		}
		else if(arr[index] == null){
			System.out.println("nothing to delete in list");
		}
		else{
			System.out.println("index exceeds the array size");
		}
		
	}

	private void add(Integer element) {
		// TODO Auto-generated method stub
		int flag = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == null){
				flag = 1;
				arr[i] = element;
				break;
			}
		}
		if(flag == 0){
			System.out.println("cannot insert the element:: [array full]");
		}
	}

	private Integer getElement(int index) {
		// TODO Auto-generated method stub
	
		return arr[index];
	}
	private Integer getIndex(int element) {
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] == element){
				
				return i;
		}
		}
		return -1;
		
	}


}
