package CollectionAPI;
import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable<Cricketer1>
{
	int age;
	String name;
	double avg;
	public Cricketer1() 
	{
	}
	public Cricketer1(int age, String name, double avg) {
		super();
		this.age = age;
		this.name = name;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
	}
	@Override
	public int compareTo(Cricketer1 c1)
	{
		if(this.avg> c1.avg)
			return 1;
		else
			
		return -1;
	}
	
}
public class LaunchComplex2 
{
	public static void main(String[] args) 
	{
		ArrayList<Cricketer1> list=new ArrayList<>();
		
		list.add(new Cricketer1(34, "SKY", 56.4));
		list.add(new Cricketer1(33, "Sanju", 65.4));
		list.add(new Cricketer1(35, "Dubey", 64.4));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
