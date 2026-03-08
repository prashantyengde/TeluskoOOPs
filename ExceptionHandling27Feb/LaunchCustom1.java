package ExceptionHandling27Feb;

import java.util.Scanner;
class InvalidCustomerException extends Exception 
{
	public InvalidCustomerException(String msg)
	{
		super(msg);
	}
}
class ATM
{
	private int acc_num=1111;
	private int passwd=2222;
	private int an;
	private int pw;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly, Enter acc num");
		an=sc.nextInt();
		System.out.println("Kindly, Enter password");
		pw=sc.nextInt();
	}
	public void verify() throws InvalidCustomerException
	{
		if(an==acc_num && pw==passwd)
		{
			System.out.println("Collect your cash");
		}
		else
		{
//			InvalidCustomerException ice=new InvalidCustomerException();
//			throw ice;
			throw new InvalidCustomerException("Invalid credentials, Try AGAIN");
			
		}
	}	
}
class Bank
{
	public void initiate()
	{
		ATM atm=new ATM();
		try
		{
			atm.input();
			atm.verify();
		}
		catch(InvalidCustomerException ice)
		{
			System.out.println(ice.getMessage());
			try
			{
				atm.input();
				atm.verify();
			}
			catch(InvalidCustomerException ie)
			{
				System.out.println(ie.getMessage());
				try
				{
					atm.input();
					atm.verify();
				}
				catch(InvalidCustomerException i)
				{
					System.out.println(i.getMessage());
					System.out.println("OYE!!! Seems Legend? Should I Call POLICE?");
				}
			}
		}
	}
}
public class LaunchCustom1 
{
	public static void main(String[] args)
	{
		System.out.println("Bank app started");
		Bank b=new Bank();
		b.initiate();
		System.out.println("Bank app terminated");
	}

}
