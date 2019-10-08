class person
{
	int age;
	String name;
	
	public person(int age,String name)
	{
		this.name = name;
		this.age = age;
	}	
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(age).append(":").append(name);
		return sb.toString();
	}
}
public class ToStringTest
{
	public static void main(String[] args)
	{
		person p1 = new person(10,"Suman");
		
		System.out.println(p1.toString());
	}
}