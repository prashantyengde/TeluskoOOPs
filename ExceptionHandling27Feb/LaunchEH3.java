package ExceptionHandling27Feb;

import java.util.Scanner;

public class LaunchEH3
{
	public static void main(String[] args) 
	{
		System.out.println("app started");
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Kindly! Enter numerator to divide");
			int n=sc.nextInt();
			System.out.println("Kindly! Enter denominator");
			int d=sc.nextInt();
			int res=n/d;//0 ArithmeticException
			System.out.println("Result is "+ res);
			System.out.println("Enter size of an array");
			int size=sc.nextInt();
			
			int ar[]=new int[size];//NegativeArraySizeException
			
			System.out.println("Enter data to be inserted in an array");
			int data=sc.nextInt();
			System.out.println("Enter the position at which data has to be inserted");
			int index=sc.nextInt();
			ar[index]=data;//ArrayIndexOutZOfBoundsException
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Kindly enter non zero denominator");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Stay positive");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Be within your limits! Don't cross boundaries");
		}
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
	
		System.out.println("app terminated");
		
	}

}
