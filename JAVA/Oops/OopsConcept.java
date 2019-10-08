package Oops;

public class OopsConcept {

	int a;
	int b;
	int c;
	
	public OopsConcept(int a, int b, int c)
	{
		this.a =a;
		this.b =b;
		this.c =c;
	}
	public int add()
	{
		return a+b+c;
	}
	
	public int multi()
	{
						
		return a*b*c;
	}
	
	public static void main(String[] args)
	{
		OopsConcept o1 = new OopsConcept(10,20,30);
		OopsConcept o2 = new OopsConcept(10,20,30);
		OopsConcept o3 = new OopsConcept(10,20,30);
		System.out.println(o1.add());
		System.out.println(o2.add());
		System.out.println(o3.add());
		System.out.println(o1.multi());
		System.out.println(o2.multi());
		System.out.println(o3.multi());
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
	}
}
