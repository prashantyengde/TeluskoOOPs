package Inheritance10feb;

class Telusko1 
{
	int age=10;
	
//	void disp()
//	{
//		//age=4;
////		System.out.println(age);
//		System.out.println("disp of parent");
//		
//	}
}
class Alien extends Telusko1
{
	int age=11;
	//int age;
	
//	void disp()
//	{
////		age=6;
////		System.out.println(age);
//		System.out.println("disp of child overriden");
//	}
	
	void show()
	{
		
		//super.disp();
		System.out.println(age);
		System.out.println(super.age);

	}
}


public class LaunchSuper
{
	static public void main(String[] args) 
	{
		Alien a=new Alien();
		a.show();
	}

}
