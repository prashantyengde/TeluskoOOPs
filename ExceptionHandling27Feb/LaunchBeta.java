package ExceptionHandling27Feb;

class Add



{
	int add(int a, int b)
	{
		try
		{
			System.out.println("Adding 2 numbers");
			return a+b;
		}
		finally
		{
			System.out.println("Add done");
		}
	}
}
public class LaunchBeta 
{
	public static void main(String[] args)
	{
		Add a=new Add();
		System.out.println(a.add(4 ,4));
		
	}

}
