package Inheritance11feb;

class TeluskoMain
{
	
}

class TeluskoAI extends TeluskoMain
{
	
}
class Animal
{
	public void eat(int age)
	{
		System.out.println("Animal is eating");
	}
	
	public int age()
	{
		return 8;
	}
	
	public TeluskoMain animalLearn()
	{
		TeluskoMain t=new TeluskoMain();
		return t;
	}
}
class Tiger extends Animal
{
	
	public void eat()
	{
		System.out.println("Tiger hunts and eat");
	}
	
//	public void eat(int age)
//	{
//		System.out.println("Animal is eating");
//	}
	
	//public void age()//invalid
	public int age()
	{
		return 10;
	}
	public TeluskoAI animalLearn()
	{
		TeluskoAI t=new TeluskoAI();
		return t;
	}
	
}
public class LaunchInheritance
{
	public static void main(String[] args)
	{
		Tiger t=new Tiger();
		t.eat();
	}

}
