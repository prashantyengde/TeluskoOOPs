package ExceptionHandling27Feb;

import java.util.Scanner;
class Alpha
{
	public void divide() throws ArithmeticException
	{
		System.out.println("Alpha app started");
		Scanner sc=new Scanner(System.in);
		try
		{
			
			System.out.println("Kindly! Enter numerator to divide");
			int n=sc.nextInt();
			System.out.println("Kindly! Enter denominator");
			int d=sc.nextInt();
			int res=n/d;
			System.out.println("Result is "+ res);	
		}
		catch(ArithmeticException e)//e =new ArithmeticException();
		{
			System.out.println("handled in  demo");
			throw e;
		}
		finally
		{
			System.out.println("Alpha app terminated");
			sc.close();
		}
//		System.err.println("hello");
	}	
}
public class LaunchEH6 
{
	public static void main(String[] args)
	{
		System.out.println("Main app started");
		try
		{
			Alpha a=new Alpha();
			a.divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled in main");
		}
		System.out.println("Main app terminated");		
	}
}

