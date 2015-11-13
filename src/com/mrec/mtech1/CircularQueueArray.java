package com.mrec.mtech1;

import java.util.Queue;
import java.util.Scanner;

public class CircularQueueArray {
	public static Scanner sc =  new Scanner(System.in);
	Integer arr[] = new Integer[10];
	int front = 0; int rear = 0;

	public static void main(String[] args) {
    	CircularQueueArray queue = new CircularQueueArray();
    	Integer element = queue.readElement();
    	queue.add(element);
    	queue.add(element+1);
    	queue.add(element+2);
    	queue.add(element+3);
    	queue.add(element+2);
    	queue.add(element+3);
    	queue.add(element+2);
    	queue.add(element+3);
    	queue.add(element+2);
    	queue.add(element+3);
    	queue.display();
    	queue.remove();
    	queue.remove();
    	queue.display();
    	queue.add(element+2);
    	queue.add(element+3);
    	queue.display();
    	queue.remove();
    	queue.remove();
    	queue.display();
    	queue.add(element+2);
    	queue.add(element+3);
    	queue.display();
    	queue.remove();
    	queue.remove();
    	queue.remove();
    	queue.remove();
    	queue.remove();
    	queue.remove();
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
			if(rear < arr.length && arr[rear] == null){
				arr[rear] = element;
				++rear;
			}
			else{
			System.out.println("queue is full");
			}
		}
		
		//int flag = 0;
		/*for(int i=arr.length; i>=0 && i< arr.length; i--){
			if(arr[i]!=null){
				flag = 1;
				arr[i] = element;
				break;
				
			}
			else if(i == 0){
				flag = 1;
				arr[i] = element;
				break;
			}
		}
		if(flag == 0){
			int flag1 = 0;
			for(int j=0; j<arr.length; j++){
				if(arr[j] == null){
					flag1 = 1;
					arr[j] = element;
					break;
				}
			}
			if(flag1 == 0)
			System.out.println("Queue is Full");
			
		}*/
		
		
	}

	private void remove() {
		
		if(front < arr.length && arr[front] != null ){
			arr[front] = null;
			++front;
		}
		else {
			front = 0;
			if(front < arr.length && arr[front] != null ){
				arr[front] = null;
				++front;
			}
			else
			{
			System.out.println("queue is full");
			}
		}
		
		/*int flag = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]!=null){
				flag = 1;
				arr[i] = null;
				break;
				
			}
		}
		if(flag == 0){
			System.out.println("Queue is Empty");
			
		}*/
		
		
		
	}
	
private Integer readElement() {
		
		System.out.println("Enter element");
		Integer element = sc.nextInt();
		return element;
	}
}
