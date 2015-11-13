package com.mrec.mtech1;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class StackList {
	public static Scanner sc =  new Scanner(System.in);
	LinkedList<Integer> list = new LinkedList<Integer>();
	//Integer arr[] = new Integer[10];

	public static void main(String[] args) {
    	StackList stack = new StackList();
    	Integer element = stack.readElement();
		stack.push(element);
		stack.push(element+1);
		stack.push(element+2);
		stack.push(element+3);
		stack.display();
    	stack.pop();
    	stack.pop();
    	stack.display();
    	//stack.peek();
    	Integer ser = stack.search(element+1);
    	if(ser != -1){
    		System.out.println("element found at:: "+(ser+1));
    	}
    	else{
    		System.out.println("search not found");
    	}
    	stack.empty();
    	stack.display();
    	
   }

	private void display() {
		ListIterator<Integer> it= list.listIterator();
		if(!it.hasNext()){
			System.out.println("stack is empty");
		}
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}

	private void empty() {
		list.removeAll(list);
		
	}

	private Integer search(Integer element) {
		
		ListIterator<Integer> it= list.listIterator();
		while(it.hasNext()){
		    if(it.next() == element){
		    	return list.indexOf(element);
		    }
		}
		return -1;


		
	}

	/*private void peek() {
		// TODO Auto-generated method stub
		
	}*/

	private void pop() {
		list.removeLast();
		
	}

	private void push(Integer element) {
		
		list.addLast(element);
		
	}
	
private Integer readElement() {
		
		System.out.println("Enter element");
		Integer element = sc.nextInt();
		return element;
	}
}
