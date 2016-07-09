package com.Stack;

public class Stack {

	int[] Stack = new int[100];
	int top =-1;
	int counter =0;
	
	void insert(int n)
	{
		Stack[++top]=n;
		counter++;
	}
	
	void delete()
	{
		if(top == -1)
		{
			System.out.println("stack is empty");
			
		}
		else{
			top = top-1;
			counter --;
		}
		//System.out.println("After deletion");
		//display();
	}
	
	void display()
	{
		top = counter-1;
		System.out.println("Stack Elements are:");
		for(int i= top; i>=0;i--)
		{
			System.out.println(Stack[i]);
		}
	}
}
