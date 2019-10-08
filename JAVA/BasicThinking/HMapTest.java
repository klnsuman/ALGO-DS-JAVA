package BasicThinking;

import java.util.HashMap;
import java.util.HashSet;

public class HMapTest {

	public static void main(String[] args){
		HashMap<String,Integer> hs = new HashMap<String,Integer>();
		hs.put("Roll No",123 );
		System.out.println(hs.toString());
		
		hs.put("Roll No",124 );
		System.out.println(hs.toString());

		hs.put("Roll No",124 );
		System.out.println(hs.toString());
		
		System.out.println("Final-"+hs.toString());

		hs.put("Roll No",125 );
		System.out.println("Final-"+hs.toString());
		
		HashSet<String> hset = new HashSet<String>();
		hset.add("Suman");
		System.out.println(hset.toString());
		
		HashMap hmap = new HashMap();
		hmap.put("S", 1);
		hmap.put("S", 1);
		hmap.put("S", 1);
		System.out.println(hmap.toString());
			}
}
