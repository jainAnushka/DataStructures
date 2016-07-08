package com.linkedQueue;

import java.util.*;
public class LinkedQueue {

	Node link = new Node();
	
	Node front=link;
	Node rear= link;
	
	public void insert(int n)
	{
			Node tempLink = new Node();
			tempLink.n = n;
			tempLink.next = null;
			rear.next =tempLink;
			rear = tempLink;
		
	}
	
	public void delete()
	{
		System.out.println("How many elements you want to delete?");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		if(front == null){
			front = link;
		}
		for(int i =0; i< value ; i++){
			front = front.next;
		}
		
	}
	
	public void display()
	{
		System.out.println("Elements of LinkedQueue are:" );
		while(front!=null){
			System.out.println(front.n);
			front= front.next;
		}
	}
	
}
