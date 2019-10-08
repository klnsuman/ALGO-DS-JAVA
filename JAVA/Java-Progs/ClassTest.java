class person
{
	// class can contain data, subroutine  - data
	String name;
	int age;
	
	// Sub routine (method)
	void speak()
	{
		System.out.println("Name is "+name+" age is "+age);
	}
	
	int getAge()
	{
		return age;
	}
	
	String getName()
	{
		return name;
	}
	
	int getYearsLeft()
	{
		return 60-age;
	}
}

public class ClassTest
{
	public static void main(String[] args)
	{
		person person1 = new person();
		person1.name = "Suman";
		person1.age = 28;
		person1.speak();
		
		int age = person1.getAge();
		String Name = person1.getName();
		
		System.out.println("Person1 Age:"+age);
		System.out.println("Person1 Name:"+Name);
		
		person person2 = new person();
		person2.name = "Kln";
		person2.age = 28;
		person2.speak();
		
		age = person2.getAge();
		Name = person2.getName();
		
		System.out.println("Person2 Age:"+age);
		System.out.println("Person2 Name:"+Name);
		
		person person3 = new person();
		person3.speak();
		
		System.out.println("person1 name:"+person1.name);
		System.out.println("person2 name:"+person2.name);
		System.out.println("person3 name:"+person3.name);
	}
}