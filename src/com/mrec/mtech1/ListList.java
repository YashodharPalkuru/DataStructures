package com.mrec.mtech1;

import java.util.Scanner;



public class ListList {
	public static Scanner sc = new Scanner(System.in);
	private static Node root;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListList list = new ListList();
		int element;
		int index;
		String choice;
		
		do{
		System.out.println("enter your option 1.add 2.remove(index) 3.getElement(index) 4.getIndex(element) 5.isEmpty() 6.display  ");
		int option = sc.nextInt();
		switch(option){
		
		case 1: System.out.println("enter element to insert to list");
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

	private void add(int element) {
		Node temp = new Node(element);
		if(root == null){
			root = temp;
			
		}
		else
		
		
	}
	
	



}



