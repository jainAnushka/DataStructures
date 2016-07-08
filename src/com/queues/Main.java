package com.queues;

public class Main {
	public static void main(String args[])
	{
		Queue q = new Queue();
		
		q.insert(2);
		q.insert(4);
		q.insert(5);
		q.insert(26);
		q.delete();
		q.delete();
		q.insert(75);
		q.insert(76);
		q.insert(77);
		q.insert(78);
		q.insert(79);
		q.insert(80);
		q.delete();
		q.display();
		
	}
}
