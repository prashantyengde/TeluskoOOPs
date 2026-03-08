package Inheritance11feb;

//final class Telusko
class Telusko
{
	 final float pi=3.14f;
	
	public final void courses()
	{
		//pi=45.5f; //The final field Telusko.pi cannot be assigned
		System.out.println("telusko has both live and recorded courses");
	}
}
//class TeluskoTux extends Telusko

class TeluskoTux extends Telusko
{
	//Cannot override the final method from Telusko
//	public void courses()
//	{
//		System.out.println("telusko ai is also getting launched");
//	}
}
public class LaunchFinal
{
	public static void main(String[] args)
	{
		TeluskoTux t=new TeluskoTux();
		t.courses();
	}

}
