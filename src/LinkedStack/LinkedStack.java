package LinkedStack;

public class LinkedStack {
	Node link = new Node();
	Node top =null;
	
	
	void insert(int n)
	{
		Node temp = new Node();
		temp.value = n;
		temp.next = top;
		top = temp;
	}
	
	void delete()
	{
		if (top == null)
		{
			System.out.println("Stack is empty");
		}
		else{
			Node tempLink = top;
			top = tempLink.next ; 
		}
	}
	
	void display()
	{
		Node l = top;
		System.out.println("Elements of stack are:");
		while(l != null)
		{
			
			System.out.println(l.value);
			l = l.next;
		}
	}
}
