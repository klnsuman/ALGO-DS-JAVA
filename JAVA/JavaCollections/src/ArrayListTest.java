import java.util.*;
public class ArrayListTest {

	public static void main(String args[])
	{
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Hi");
		al1.add("1");
		al1.add("1.4");
		
		
		Iterator itr = al1.iterator();
		/*for( itr.hasNext();;)
		{
			System.out.println(itr.next());
		}*/
		for( String obj:al1)
		{
			System.out.println(itr.next());
		}
	}
}
