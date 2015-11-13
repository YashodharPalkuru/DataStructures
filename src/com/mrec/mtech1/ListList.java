package com.mrec.mtech1;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListList {
	public static Scanner sc = new Scanner(System.in);
    
	LinkedList<Integer> res = new LinkedList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListList list = new ListList();
		Integer element = list.readElement();
		Integer index = list.readIndex();
		list.add(element);
		list.add(element+1);
		list.add(element+2);
		list.remove(index);
		int ind = list.indexOf(element);
		boolean empty = list.isEmpty();
		Integer ele = list.get(index);
		System.out.println("is empty::" +empty+ " "+"indexOf["+element+"] ::"+ind+ " "+"get("+index+")::"+ele );
		list.display();
		

	}
	
	
	private void display() {
		ListIterator<Integer> it= res.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
	}


	private Integer get(Integer index) {
		
		return res.get(index);
		
	}


	private boolean isEmpty() {
		return res.isEmpty();
		
	}


	private int indexOf(Integer element) {
		
		return res.indexOf(element);
		
	}


	private void remove(Integer index) {
		
			res.removeLast();
		
	}


	private void add(Integer element) {
		
			res.addLast(element);
			
		}

	private Integer readElement() {
		
		System.out.println("Enter element");
		Integer element = sc.nextInt();
		return element;
	}
	private Integer readIndex() {
		
		System.out.println("Enter Index");
		Integer in = sc.nextInt();
		return in;
	}


}



