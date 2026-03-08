package Inheritance11feb;

abstract class AeroPlane
{
	//abstract int age; illegal
//	public AeroPlane()
//	{
//		super();
//	}
	public abstract void takeOff();
	public abstract void fly();
	
	public void landing()
	{
		System.out.println("Aeroplane is landing");
	}
}

class CargoPlane extends AeroPlane
{
//	public abstract void takeOff();
//	public abstract void fly();
	
//	public CargoPlane()
//	{
//		super();
//	}
	public void takeOff()
	{
		System.out.println("CargoPlane requires longer runway to takeOff");
	}
	public void fly()
	{
		System.out.println("CargoPlane flies at lower height");
	}
}

class FighterPlane extends AeroPlane
{
	public void takeOff()
	{
		System.out.println("FighterPlane requires shorter runway to takeOff");
	}
	public void fly()
	{
		System.out.println("FighterPlane flies at higher height");
	}
	
}

class CommercialPlane extends AeroPlane
{
	
	public void takeOff()
	{
		
		System.out.println("CommercialPlane requires mid size runway to takeOff");
	}
	public void fly()
	{
		
		System.out.println("CommercialPlane flies at medium height");
	}
	
}
class Airport
{
	//AeroPlane aero=p
	public void permit(AeroPlane aero)
	{
		//1:M --> Polymorphsim
		aero.takeOff();
		aero.fly();
	}
}
public class LaunchPolymorphism
{
	public static void main(String[] args)
	{
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		CommercialPlane p=new CommercialPlane();
		
		Airport a=new Airport();
		a.permit(cp);
		a.permit(fp);
		a.permit(p);
		
//		AeroPlane aero;
//		aero=cp;
//		
//		aero.takeOff();
//		aero.fly();
//		
//		System.out.println("***********************");
//		
//		aero=fp;
//		
//		aero.takeOff();
//		aero.fly();
		
		//Cannot instantiate the type AeroPlane(abstract)
		//new AeroPlane();
//		
		
	}

}
