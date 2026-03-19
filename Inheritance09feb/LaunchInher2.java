package Inheritance09feb;

class Parent
{
	void sleep()
	{
		System.out.println("Sleeps lot");
	}
	
	void dressingStyle()
	{
		System.out.println("dresses based on their time");
	}
	
}
class Child extends Parent
{
	//overriding  //overriden
	void dressingStyle()
	{
		System.out.println("dresses based on our modern time");
	}
	void habit()
	{
		System.out.println("child swims well");
	}
	
}
public class LaunchInher2
{
	public static void main(String[] args)
	{
		
		Parent ref=new Child();   //Polymorphism
		ref.sleep(); //inherited
		ref.dressingStyle(); //overridden
		((Child) ref).habit();//downcasting --> specialized
	}

}
