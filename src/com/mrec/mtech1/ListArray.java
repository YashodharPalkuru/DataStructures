package com.mrec.mtech1;

import java.util.Scanner;

public class ListArray {
	
	static Scanner sc = new Scanner(System.in);
	Integer arr[] = new Integer[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListArray list = new ListArray();
		Integer element = list.readElement();
		Integer index = list.readIndex();
		list.add(element);
		list.add(element+1);
		list.add(element+2);
		list.remove(index);
		boolean empty = list.isEmpty();
		int ind = list.indexOf(element);
		Integer ele = list.get(index);
		System.out.println("is empty::" +empty+ " "+"indexOf["+element+"] ::"+ind+ " "+"get("+index+")::"+ele );
		list.display();
		/*ArrayList a  = new ArrayList<String>();
		a.add("2");
		a.add(null);
		a.add("3");
		a.add("4");
		System.out.println(a.indexOf("7"));
		for(Object s : a){
			System.out.println(" "+ s);
		}
		*/
		

	}
	
	private void display() {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		
	}

	private Integer get(Integer index) {
		// TODO Auto-generated method stub
		
			return arr[index];
			
		
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

	private Integer readElement() {
		// TODO Auto-generated method stub
		System.out.println("Enter element");
		Integer element = sc.nextInt();
		return element;
	}
	private Integer readIndex() {
		// TODO Auto-generated method stub
		System.out.println("Enter Index");
		Integer in = sc.nextInt();
		return in;
	}


}
