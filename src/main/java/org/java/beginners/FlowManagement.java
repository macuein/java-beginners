package org.java.beginners;

import java.util.Scanner;

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
	
	public void useIf()
	{
		if(4 == 4)
		{
			System.out.println("If flow 4 == 4");
		}
	}
	
	public void useUserInput()
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text: ");
		String line = input.nextLine();
		System.out.println("You entered " + line);
		
	}

	public void useDoWhile()
	{
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		do
		{
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		while (value != 5);
			
		System.out.println("Got 5!");
		
		
	}
	
	public void useSwitch()
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Add a new command: ");
		String text = input.nextLine();
		
		switch(text)
		{
			case "start":
				System.out.println("Machine started");
				break;
				
			case "stop":
				System.out.println("Machine stopped");
				break;
				
			default:
				System.out.println("Command not recognized");		
		}
		
	}
	
}
