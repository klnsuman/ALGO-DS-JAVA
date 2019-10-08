package setpract;

public class LinkedHashTest {
	public static void main(String[] args)
	{
		HashSetList hset = new HashSetList();
		for (int i=0;i<12;++i)
		{
			//System.out.println("i->"+i*2);
			hset.add(i*2);		
		}	
		//System.out.println("Display");
		hset.display();
	}

}
