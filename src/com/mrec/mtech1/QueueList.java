package com.mrec.mtech1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

import com.mrec.mtech1.Node;

public class QueueList {
	public static Scanner sc =  new Scanner(System.in);
	LinkedList<Integer> list = new LinkedList<Integer>();
	Node front = null;
	Node rear = null;
	Node root = new Node();
	

	public static void main(String[] args) {
    	QueueList queue = new QueueList();
    	Integer element = queue.readElement();
    	queue.add(element);
    	queue.add(element+1);
    	queue.add(element+2);
    	queue.add(element+3);
    	queue.display();
    	queue.remove();
    	queue.remove();
    	queue.display();
    	LinkedList li = new LinkedList();
    	//li.
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
		ListIterator<Integer> it= list.listIterator();
		if(!it.hasNext()){
			System.out.println("queue is empty");
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

	private void add(Integer element) {
		Node n = new Node();
		if(front < rear){
		n.element = element;
		n.link = 
		}
		else if(front == rear){
			root.element = element;
			root.link = null;
			rear = root ;
		}
		
	}

	private void remove() {
		list.removeFirst();
		
		
		
	}
	
private Integer readElement() {
		
		System.out.println("Enter element");
		Integer element = sc.nextInt();
		return element;
	}
}
