package com.sarthak.practices.linkedlist;

public class LinkedListDemo {
	static Node head;
	public static int findLenth(Node head) {
		int length=0;
		Node current=head;
		while(current !=null) {
			length++;
			current=current.getNext();
		}
		return length;
		
	}
public static void main(String[] args) {
	LinkedListDemo ll=new LinkedListDemo();
	Node first=new Node(15);
	Node second=new Node(25);
	Node third=new Node(20);
	Node fourth=new Node(30);
	ll.head=first;
	first.setNext(second);
	second.setNext(third);
	third.setNext(fourth);
	fourth.setNext(null);
	
	System.out.println(findLenth(head));
	
}
}
