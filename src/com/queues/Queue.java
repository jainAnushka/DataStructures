package com.queues;

public class Queue {
	
	int queue[] = new int [100];
	int rear=-1;
	int front=-1;
	
	void insert(int item)
	{
		if(rear == -1 && front ==-1)
		{	
			System.out.println("Queue is Empty");
			front ++;
			queue[++rear] = item;
			
		}
		else
		{
			queue[++rear] = item;
			//System.out.println();
		}
	}
	
	void delete()
	{
		if(front == -1)
		{
			System.out.println("Queue is empty");
		}
		else 
		{
			if(front != rear){
				//System.out.println(queue[front] +" is removed");
				front++;	
			}
			
		}
		
	}
	
	public void display()
	{
		for (int i=front; i<=rear ;i++)
		{
			System.out.println(queue[i]);
		}
	}
	

}
