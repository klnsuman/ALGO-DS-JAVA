package set;

public class HashSetTest {

	ListNode[] hstbl;
	int size;
	public static final int NO_OF_BUCKETS = 11;
	public static final int THRESHOLD = 10;
	
	public HashSetTest(){
		hstbl = new ListNode[NO_OF_BUCKETS];
		for(int i=0;i<NO_OF_BUCKETS;i++)
		{
			hstbl[i] = new ListNode();  
		}
		size = 0;
	}
	
	public boolean add(Integer key)
	{
		ListNode tmp = new ListNode(key);
		int bindex = tmp.data % NO_OF_BUCKETS;
		ListNode tmp1 = hstbl[bindex];
		for(;tmp1.next!=null;tmp1= tmp1.next)
		{
			if(tmp1.next.data.equals(key))
				return false;
		}
		tmp1.next = tmp;
		++size;
		return true;
	}
	public boolean contains(Integer key)
	{
		int bindex = key%NO_OF_BUCKETS;
		ListNode tmp = hstbl[bindex].next;
		for(;tmp!=null;tmp=tmp.next)
		{
			if(tmp.next.data==key)
				return true;		
			
		}		
		return false;
	}
	
}
