
package ExceptionHandling27Feb;

class Telusko implements AutoCloseable
{
	@Override
	public void close() throws Exception
	{
		System.out.println("Resource is getting close");
	}
}
public class LaunchTryResouce 
{
	public static void main(String[] args) throws Exception
	{
		
		try(Telusko t=new Telusko())
		{
			
		}
//		finally
//		{
//			t.close();
//		}
	}

}
