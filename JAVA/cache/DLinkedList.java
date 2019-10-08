package cache;

public class DLinkedList{
	int size;
	DListNode head;
	public DLinkedList()
	{
		head = new DListNode();
		size = 0;
	}
	
	public void removeAndAdd(DListNode current){
		
		// remove 
		current.prev.next = current.next;
		current.next.prev = current.prev;
		// add at begin
		
		current.prev 	= head.prev;
		current.next 	= head;
		
		head.prev.next 	= current;
		head.prev 		= current;		
		
	}
	public DListNode addLast(String key,Integer value)
	{
		DListNode tmp = new DListNode(key,value);
		
		tmp.prev 	= head.prev;
		tmp.next 	= head;
		
		head.prev.next 	= tmp;
		head.prev 		= tmp;
		size++;
		return tmp;
	}
	
	public int size()
	{
		return size;
	}
	public void display()
	{
		for(DListNode tmp = head.next;tmp!=null;tmp = tmp.next)
		{
			System.out.println("Key->"+tmp.key+" Value->"+tmp.value);
		}
	}
	public DListNode removeFirst()
	{
		DListNode tmp = head.next;
		tmp.next.prev = head;
		head.next = tmp.next;
				
		return head;
	}
	
}