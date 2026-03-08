package Inheritance12feb;

class Animal1
{
	static int age;
	
	static final float pi=3.14f;
	
	static void disp()
	{
		System.out.println("Parent class static method");
	}
}
class Deer extends Animal1
{
	
//	static void disp()
//	{
//		System.out.println("Parent class static method");
//	}
	static void disp()
	{
		System.out.println("Deer class static method");
	}
	
	
//	public void show()
//	{
//		age=15;
//	}
	//both static variable and static method gets inherited in child class
}
public class LaunchStaticInhe
{
	public static void main(String[] args)
	{
//		Animal1 a=new Deer();
		Deer a=new Deer();
		a.disp();
		//a.show();
	}

}
