package CollectionAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer
{
	int age;
	String name;
	double avg;
	public Cricketer() 
	{
	}
	public Cricketer(int age, String name, double avg) {
		super();
		this.age = age;
		this.name = name;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
	}
	
}
class Alpha1 implements Comparator<Cricketer>
{

	@Override
	public int compare(Cricketer c1, Cricketer c2)
	{
		if(c1.avg > c2.avg)
			return 1;
		else
			return -1;
	}
	
}
public class LaunchComplex1
{
	public static void main(String[] args)
	{
		ArrayList<Cricketer> list=new ArrayList<>();
	
		list.add(new Cricketer(34, "SKY", 56.4));
		list.add(new Cricketer(33, "Sanju", 65.4));
		list.add(new Cricketer(35, "Dubey", 64.4));
		
		System.out.println(list);
		
		//Comparator // Comparable
		//Comparator  ==> 1 implements , 2 anonymous inner class , 3 Lambda
		Alpha1 a=new Alpha1();
//		Collections.sort(list, a);
		
//		Comparator c=new Comparator<Cricketer>()
//		{
//
//			@Override
//			public int compare(Cricketer c1, Cricketer c2)
//			{
//				if(c1.age > c2.age)
//					return 1;
//				else
//					return -1;
//			}
//			
//		};
//		
//		Comparator<Cricketer> c=(Cricketer c1, Cricketer c2) -> 
//		{
//			if(c1.age > c2.age)
//				return 1;
//			else
//				return -1;
//		};
//		Collections.sort(list, c);
		Collections.sort(list,(Cricketer c1, Cricketer c2) -> 
		{
			if(c1.age > c2.age)
				return 1;
			else
				return -1;
		});
		System.out.println(list);
		
		
	}

}
