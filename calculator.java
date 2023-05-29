import java.util.*;

public class calculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int ch = 0;
		int num1=-999, num2= -999;
		boolean flag = false;
		
		while(ch !=6)
	{
		System.out.println("\n##MENU##");
		System.out.println("1. Input Numbers");
		System.out.println("2. Addition");
		System.out.println("3. Substraction");
		System.out.println("4. Multiplication");
		System.out.println("5. Division");
		System.out.println("6. Exit");
		System.out.println("---------------");
		System.out.println("Enter your choice: ");
		ch = in.nextInt();
		
		switch(ch)
		{
		case 1:
		{
			try
			{
				System.out.print("Enter Number 1: ");
				num1 = in.nextInt();
				
				System.out.print("Enter Number 2: ");
				num2 = in.nextInt();
				
				flag = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input."
						+"Input again using Menu");
			}
			in.nextLine();
			break;
			
		}
			
		case 2:
		{
			if(flag)
				add(num1, num2);
			else 
				System.out.println("No number have entered");
			
			break;
			
		}
		case 3:
		{
			if(flag)
				sub(num1, num2);
			else 
				System.out.println("No number have entered");
			
			break;
		}
		case 4:
		{
			if(flag)
				mul(num1, num2);
			else 
				System.out.println("No number have entered");
			
			break;
		}
		
		case 5:
		{
			if(flag)
				div(num1, num2);
			else 
				System.out.println("No number have entered");
			
			break;
		}
		
		case 6:
		  System.out.println("Goodbye, have a nice day!");
		  break;
		  
	default:
		System.out.println("Wrong input.");
		
		}
	  }
  }
	
	public static void add(int x, int y)
	{
		System.out.println("\nResult: " + x +" + " + y +" = " +(x+y));
	}
	
	public static void sub(int x, int y)
	{
		System.out.println("\nResult: " + x +" + " + y +" = " +(x-y));
	}
	
	public static void mul(int x, int y)
	{
		System.out.println("\nResult: " + x +" + " + y +" = " +(x*y));
	}
	public static void div(int x, int y)
	{
		int result;
		
		try
		{
			result = x / y;
			System.out.println("\nResult: " + x +" / " + y +" = " +result);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Denominator cannot be Zero.");
		}
	}
}
	
	
	
	
	
	
