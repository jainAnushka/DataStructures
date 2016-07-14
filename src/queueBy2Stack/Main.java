package queueBy2Stack;

public class Main {

	public  static void  main(String args[]){
		
		Queue q =new Queue();
		q.insert(5);
		q.insert(9);
		q.insert(7);
		q.display();
		q.delete();
		//q.display();
		q.insert(2);
		q.insert(8);
		q.insert(1);
		//q.display();
		
		//q.delete();
		//q.delete();
		//q.delete();
		//q.delete();
		q.display();
	}
}
