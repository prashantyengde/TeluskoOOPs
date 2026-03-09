package CollectionAPI;

import java.util.Hashtable;

class PersonalInfo
{
	int age;
	String name;
	String city;
	public PersonalInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonalInfo(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "PersonalInfo [age=" + age + ", name=" + name + ", city=" + city + "]";
	}
	
}

public class LaunchMap
{
//	String str;//null
	
	public static void main(String[] args) 
	{
//		String str=null;
//		str.toUpperCase();//null 
//		PersonalInfo info;
		//key value pair
//		HashMap hm1=new HashMap();
//		hm1.put(4, "Shirish");
//		hm1.put("Kapil", "Sharma");
//		hm1.put(4.5, "Arun");
//		hm1.put(new PersonalInfo(), "info");
//		
//		System.out.println(hm1);
		
//		HashMap<Integer, String> hm=new HashMap<>();
//		hm.put(43, "Rohan");//key- value 
//		hm.put(44, "Rohit");
//		hm.put(null, "Rohit"); // value need not to be unique // key can be null
//		hm.put(45, "Kohli");// key must be unique
//		hm.put(46, null);//value can also null
//		System.out.println(hm);
		
//		LinkedHashMap<Integer, String> hm=new LinkedHashMap<>();
//		hm.put(43, "Rohan");//key- value 
//		hm.put(44, "Rohit");
//		hm.put(null, "Rohit"); // value need not to be unique // key can be null
//		hm.put(45, "Kohli");// key must be unique
//		hm.put(46, null);//value can also null
//		System.out.println(hm);
		
//		HashMap<Integer, PersonalInfo> info=new HashMap<>();
//		info.put(101, new PersonalInfo(16, "Rohan", "Bengaluru"));
//		info.put(102, new PersonalInfo(17, "Rohit", "Mumbai"));
//		info.put(103, new PersonalInfo(10, "Saketh", "Jaipur"));
//		
//		System.out.println(info);
		
//		TreeMap tm=new TreeMap();
//		tm.put(4, "Java");
//		tm.put(2, "AI");
//		tm.put(3, "Springboot");
//		//tm.put(null, "Springboot");//key cannot be null
//		tm.put(1, null);//value can be null
//
//		System.out.println(tm);
//	
		Hashtable tm=new Hashtable();
		tm.put(4, "Java");//Entry
		tm.put(2, "AI");
		tm.put(3, "Springboot");
		//tm.put(null, "Springboot");//key cannot be null
//		tm.put(1, null);//value cannot be null

		System.out.println(tm);
		
	}

}
