package com.mrec.mtech1;

class Node {
	Node(int element){
		this.element = element;
		
	}

    private int element;
	private Node link;
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}
}