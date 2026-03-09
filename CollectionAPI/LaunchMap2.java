package CollectionAPI;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

interface Alpha2
{
	interface Gamma
	{
		static void gamma()
		{
			System.out.println("static method of gamma");
		}
	}
}

public class LaunchMap2
{
	public static void main(String[] args)
	{
		//Alpha2.Gamma.gamma();
		
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Java");
		map.put(2, "SpringBoot");
		map.put(3, "DevOps");
		System.out.println(map);
		System.out.println("*****************************");
		Set<Integer> set=map.keySet();
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("*************************");
		Collection<String> col=map.values();
		Iterator<String> itr2 = col.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println("***************************");
		Set entry=map.entrySet();
		Iterator itr3=entry.iterator();
		while(itr3.hasNext())
		{
			Map.Entry pair = (Entry) itr3.next();
			System.out.println("Key : "+ pair.getKey() + " | Value : "+pair.getValue());
		}
		
	}

}
