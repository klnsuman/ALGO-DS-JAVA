package cache;
import java.util.HashMap;
public class LinkedHashMapCache {

	public DoubleLinkedList list;
	public HashMap<String , DListNode> index;
	int size;
	int capacity;
	public LinkedHashMapCache(int capacity)
	{
		list = new DoubleLinkedList();
		size = 0; 
	}
	
	
	public void add(String key,Integer value)
	{
		DListNode tmp = index.get(key);
		if(tmp == null)
		{
			if(list.isFull())
			{
				list.remove(tmp);
			}
			
			tmp = list.addLast(key,value);
			index.put(key, tmp);
		}
		else
		{
			list.removeAndAdd();
		}
		
	}
}
