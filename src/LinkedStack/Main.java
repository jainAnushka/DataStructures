package LinkedStack;

public class Main {
	
	public static void main(String args[])
	{
		LinkedStack ls = new LinkedStack();
		ls.insert(4);
		ls.insert(8);
		ls.insert(9);
		ls.display();
		ls.delete();
		ls.insert(21);
		ls.insert(27);
		ls.display();
		ls.insert(98);
		ls.display();
		
		
	}
}
