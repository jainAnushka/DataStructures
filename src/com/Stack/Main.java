package com.Stack;

public class Main {
	public static void main(String args[])
	{
		Stack s = new Stack();
		s.insert(5);
		s.insert(3);
		s.insert(7);
		s.insert(6);
		s.display();
		s.delete();
		s.delete();
		s.insert(1);
		s.delete();
		s.delete();
		s.delete();
		s.delete();
		s.display();
	}
}
