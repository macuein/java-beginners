package org.java.beginners;

public class FlowManagement 
{

	public FlowManagement()
	{
		
	}
	
	public void useWhileLoop()
	{
		int value = 0;
		
		while (value <= 10)
		{
			System.out.println("While Loop " + value);
			value = value + 1;	
		}	
	}
	
	public void useForLoop()
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("For loop: %d\n", i);
		}
	}
	
}
