/*==============================
Illustrates the 
	i. use of constructors
   ii. constructors with parameters
  iii. setters  
   iv. Static 
    v. Final
=============================*/
class Person
{
	int age;
	String name;
	
	public static String gender;
	
	int nonstcounter;
	public static int stcounter;
	
	int getAge()
	{
		return age;
	}
	
	String getName()
	{
		return name;
	}
	// Below is the constructor
	// Constructor does not have a return type.
	// constructor gets called by default when instantiated.
	
	public Person()
	{
		System.out.println("Calling constructor");
	}
	// Below is the constructor with
	public Person(int newAge,String newName)
	{
		this();
		System.out.println("Calling 2 parameter constructor");
		name = newName;
		age = newAge;
	}
	// Setter Methods
	//public void setName(String newName)
	public void setName(String newName)
	{
		name = newName;
	}
		
	public void setAge(int newAge)
	{
		this.age = newAge;
	}
	// End Of Setter Methods
}
public class StaticFinalTest
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		
		p1.setName("Suman");
		p1.setAge(21);
		
		System.out.println("getter Name:"+p1.getName());
		System.out.println("getter Age:"+p1.getAge());
		
		Person p2 = new Person();
		
		p2.setName("KLN");
		p2.setAge(22);
		
		System.out.println("getter Name:"+p2.getName());
		System.out.println("getter Age:"+p2.getAge());
		
		
		Person p3 = new Person(10,"Suman");
		
		System.out.println("P3 getter Name:"+p3.getName());
		System.out.println("P3 getter Age:"+p3.getAge());
		
		Person p4 = new Person(10,"KLN");
		
		
		// Test static variables
		System.out.println("Gender:"+Person.gender);
		Person.gender = "Male";
		System.out.println("After Assigning Gender:"+Person.gender);
		
		// Test Static Variable Assignment to Instance Variables
		Person p5 = new Person();
		p5.gender = "Male";
		System.out.println("Instance Gender:"+p5.gender);
		
		
		// Increment Non Static counter & Check
		p1.nonstcounter++;
		System.out.println(p1.nonstcounter);
		
		p2.nonstcounter++;
		System.out.println(p2.nonstcounter);
		
		// Increment Static counter & Check
		
		p1.stcounter++;
		System.out.println(p1.stcounter);
		
		p2.stcounter++;
		System.out.println(p2.stcounter);
		
		p3.stcounter++;
		System.out.println(p3.stcounter);
		System.out.println("person class counter"+Person.stcounter);
		
		Person.stcounter++;
		System.out.println("person class counter After:"+Person.stcounter);
	}
}