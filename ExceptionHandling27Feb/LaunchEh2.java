
package ExceptionHandling27Feb;

import java.util.Scanner;


public class LaunchEh2 
{
	public static void main(String[] args)
	{
		System.out.println("Calc app started");
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
		catch(Exception e)
		{
			System.out.println("Enter non zero denominator");
		}
		System.out.println("Calc app terminated");
		
	}

}
