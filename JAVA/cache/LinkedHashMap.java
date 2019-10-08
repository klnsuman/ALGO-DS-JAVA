package cache;
import java.util.HashMap;

public class LinkedHashMap implements ICache{

	DLinkedList list;
	HashMap<String,DListNode> index;
	int capacity;
	public LinkedHashMap(int capacity)
	{
		index = new HashMap<String,DListNode>();
		list  = new DLinkedList();
		this.capacity = capacity;		
	}
	public boolean isFull()
	{
		return list.size() == capacity;
	}
	@Override
	public void add(String key, Integer value) {
		// TODO Auto-generated method stub
		DListNode tmp = index.get(key);
		if(tmp!=null)
		{
			// The key exists and we just need to replace the existing contents
			tmp.value = value;
			list.removeAndAdd(tmp);
		}
		else
		{

			if(!isFull())
			{
				
			}
			else
			{
				
			}	
			
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int get(String key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

}
