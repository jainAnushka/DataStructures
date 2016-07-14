package queueBy2Stack;

public class Queue {
	
	int[] inbox = new int[50];
	int[] outbox = new int[50];
	int inTop=-1;
	int outTop;
	int counter;
	int temp =0;
	
	void insert(int num)
	{
		if(inTop == -1)
		{
			inbox[++inTop] = num;
			counter ++;
		}
		else
		{
			inbox[++inTop] = num;
			
			counter ++;
		}
		//System.out.println("Counter :" + counter);
	}
	
	void delete()
	{ int j =0; 
	int temp = counter;
	int y=0;
		for(int i=temp; i>0; i--, j++){
			outbox[j]=inbox[i] ;
			inTop--;
			
		}
		//System.out.println("Value :" + inTop);
		/*if(inTop == 0){
			inTop =-1; 
			temp ++;
		}*/
				
		for(int i=0; i<temp; i++, j--){
			inbox [i] = outbox[j-1]; 
			inTop++;
		}
		//System.out.println("value :" + inTop);
		counter--;
	}
	
	
	void display()
	{
		System.out.println("Queue elements are:");
		for(int i=0; i<=counter-1;i++)
		{
			System.out.print("     " + inbox[i]);
		}
		System.out.println();
	}
}
