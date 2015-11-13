package com.mrec.mtech1;

import java.util.Queue;
import java.util.Scanner;

public class QueueArray {
	public static Scanner sc =  new Scanner(System.in);
	Integer arr[] = new Integer[10];
	int rear = 0; int front =0;

	public static void main(String[] args) {
    	QueueArray queue = new QueueArray();
    	Integer element = queue.readElement();
    	queue.add(element);
    	queue.add(element+1);
    	queue.add(element+2);
    	queue.add(element+3);
    	queue.display();
    	queue.remove();
    	queue.remove();
    	queue.display();
    	 //queue.peek();
    	//queue.element();
    	//queue.poll();
    	Integer ser = queue.search(element+2);
    	if(ser != -1){
    		System.out.println("element found at:: "+(ser+1));
    	}
    	else{
    		System.out.println("search not found");
    	}
    	queue.empty();
    	queue.display();
    	//Queue<Integer> queue;
        
    	
   }

	private void poll() {
		// TODO Auto-generated method stub
		
	}

	private void element() {
		// TODO Auto-generated method stub
		
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

	private void add(Integer element) {
		if(rear < arr.length && arr[rear] == null){
			arr[rear] = element;
			++rear;
		}
		else {
			rear = 0;
			System.out.println("Queue is full");
		}
		
	}

	private void remove() {
		if(front < arr.length && arr[front] != null ){
			arr[front] = null;
			++front;
		}
		else {
			front = 0;
			System.out.println("Queue is full");
		}
	}
	
private Integer readElement() {
		
		System.out.println("Enter element");
		Integer element = sc.nextInt();
		return element;
	}
}
