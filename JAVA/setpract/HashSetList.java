package setpract;
/* 
 * Duplicates are not allowed in Set
 */
public class HashSetList {

	ListNode[] hshtbl;
	public static final int NO_OF_BUCKETS = 11;
	public static final int THRESHOLD = 11;
	int size;
	
	public HashSetList(){
		hshtbl = new ListNode[NO_OF_BUCKETS];
		for(int i=0;i<NO_OF_BUCKETS;++i)
		{
			hshtbl[i] = new ListNode();
			//System.out.println(hshtbl[i]);
		}
		size = 0;
	}
	
	public boolean add(Integer key)
	{
		int bindex = key.hashCode()%hshtbl.length;
		//System.out.println("key->"+key);
		//System.out.println("bindex->"+bindex);
		ListNode tmp = hshtbl[bindex];
		//System.out.println("hshtbl[bindex]->"+hshtbl[bindex]);
		for(;tmp.next!=null;tmp=tmp.next)
		{
			//System.out.println("tmp.next->"+tmp.next);
			if(tmp.next.key.equals(key))
			{
				//System.out.println("returning");
				return false;
			}
		}
		tmp.next = new ListNode(key);
		//System.out.println("temp.next->"+tmp.next);
		
		ListNode tmp1 = hshtbl[bindex];
		//System.out.println("temp1.next->"+tmp1.next);
		size++;
		return true;
		
	}
	public boolean contains(Integer key)
	{
		int bindex = key%NO_OF_BUCKETS;
		ListNode tmp = hshtbl[bindex];
		for(;tmp!=null;tmp=tmp.next)
		{
			if(key == tmp.key)return true;
		}
		
		return false;
	}
	public void remove(Integer key)
	{
		int bindex = key%NO_OF_BUCKETS;
		ListNode tmp = hshtbl[bindex].next;
		
		for(;tmp!=null;tmp=tmp.next)
		{
			if(key == tmp.next.key)
				tmp.next = tmp.next.next;
			
			
		}	
	
	}
	public void display(){
		for(int i=0;i<11;++i)
		{
			ListNode tmp = hshtbl[i].next;
			for(;tmp!=null;tmp=tmp.next)
			{
				System.out.print("Element->"+tmp.key);
				System.out.print(" @Address->"+tmp);
				System.out.println(" ");
			}
		}
	}
}
