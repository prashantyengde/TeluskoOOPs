package Inheritance09feb;

class Telusko //extends Object
{
	void course()
	{
		System.out.println("visit telusko.com");
	}
}
class Alpha extends Telusko
{
	int age;
	
	private String name;
	
	void disp()
	{
		System.out.println("This is Live Java SpringBoot classes");
	}
}
//Inheritance
//Beta --> Child/Derived/Sub class
class Beta extends Alpha   //--> Alpha Parent/Super/Base
{
	//int age;
      void show()
      {
    	  age=18;
    	 // name="Telusko";
    	  System.out.println(age);
      }
}
public class LaunchInheritance1 
{
	public static void main(String[] args)
	{
		Alpha beta= new Beta();
		beta.disp();
		beta.course();
		//beta.toString();
		
		
	}

}
