package com.mrec.bst;

import java.util.Scanner;

public class BinarySearchTree {
	private static Node root;
	private static Scanner sc;

	public BinarySearchTree() {
		root = null;
		sc = new Scanner(System.in);
	}
	
	private int[] readElements() {
		System.out.println("Enter size of elements:");
		int size = sc.nextInt();
		System.out.println("Enter elements:");
		int elements[] = new int[size];
		for(int i=0; i<size;i++){
			elements[i] = sc.nextInt();
		}
		return elements;
	}
	
	private void addElements(int[] elements) {
		
		for(int i: elements){
			Node temp = new Node();
			temp.data = i;
			
			if(root != null){
				Node current = root;
				while(current != null){
					if(i < current.data){
						if(current.left != null){
							current = current.left;
						} else {
							current.left = temp;
							break;
						}
					}else if(i > current.data){
						if(current.right != null){
							current = current.right;
						} else {
							current.right = temp;
							break;
						}
						
					} else {
						System.out.println("Duplicate entry");
						break;
					}
				}
			} else {
				root = temp;
			}
		}
		
	}
	
    public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int elements[] = bst.readElements();
		bst.addElements(elements); 
		int searchKey = bst.readSearchKey();
		if(bst.findElement(searchKey)) {
			System.out.println("Found element ");
		} else {
			System.out.println("Element Not Found");
		}
		int delKey = bst.readDeleteElement();
		bst.deleteElement(delKey);
	}

	private void deleteElement(int delKey) {
		// TODO Auto-generated method stub
		Node pre = null;
		Node del;
		Node rslow;
		Node prerslow;
		
		del = root;
		while(del != null){
			if(del.data == delKey){
				System.out.println("delkey found");
				break;
			} else if(delKey < del.data){
				pre = del;
				del = del.left;
			} else if(delKey > del.data){
				pre = del;
				del = del.right;
			} 
		}
		if(del == null){
			System.out.println("delete key not found");
		}
		if((del.left != null) && (del.right != null)){
			
		}
		if((del.left != null) && (del.right == null)){
			if(pre.right == del){
				pre.right = del.left;
			} else {
				pre.left = del.left;
			}
		}
		if((del.left == null) && (del.right != null)){
			if(pre.right == del){
				pre.right = del.right;
			} else {
				pre.left = del.right;
			}
		}
		if((del.left == null) && (del.right == null)){
			if(pre.right == del){
				pre.right = null;
			} else {
				pre.right = null;
			}
		}
		
	}

	private int readDeleteElement() {
		// TODO Auto-generated method stub
		System.out.println("Enter the element to be deleted:");
		return sc.nextInt();
	}

	private Boolean findElement(int searchKey) {
		Node current = root;
		while(current != null){
			if(searchKey == current.data) {
				return true;
			} else if(searchKey < current.data){
				if(current.left != null){
					current = current.left;
				} else {
					break;
				}
			}else {
				if(current.right != null){
					current = current.right;
				} else {
					break;
				}
			}
		}
		return false;
	}

	private int readSearchKey() {
		System.out.println("Enter search key:");
		return sc.nextInt();
	}

	

	


}
