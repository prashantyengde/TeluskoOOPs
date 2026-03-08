package ExceptionHandling27Feb;

import java.util.Scanner;

class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		super(msg);
	}
}
class OverAgeException extends Exception
{
	public OverAgeException(String msg)
	{
		super(msg);
	}
}
class Applicant
{
	private int age;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		age=sc.nextInt();
//		sc.close();
	}
	public void verify() throws UnderAgeException, OverAgeException
	{
		if(age>=18 && age<=70)
		{
			System.out.println("Proceed further with your application");
		}
		else if(age<18)
		{
			throw new UnderAgeException("Kiddo! Liitle more patience please ");
		}
		else
		{
			throw new OverAgeException("SIR! Your time is near, Please be carefull ");

		}
	}
}
class RTO
{
	public void initiate()
	{
			Applicant ap=new Applicant();
			try
			{
				ap.input();
				ap.verify();
			}
			catch(UnderAgeException | OverAgeException ex)
			{
				System.out.println(ex.getMessage());
				try
				{
					ap.input();
					ap.verify();
				}
				catch(UnderAgeException | OverAgeException x)
				{
					System.out.println(x.getMessage());
					try
					{
						ap.input();
						ap.verify();
					}
					catch(UnderAgeException | OverAgeException e)
					{
						System.out.println(e.getMessage());
						System.out.println("BLOCKED FROM GOVT");
					}
				}
			}
	}
}
public class LaunchCustom2
{
	public static void main(String[] args)
	{
		System.out.println("DRIVING LICENSE APP");
		RTO rto=new RTO();
		rto.initiate();
		System.out.println("DRIVING LICENSE APP Logged out");

	}
}
