package linkedlist;

public class linkedList implements IList {
	private int size;
	private ListNode head;
	private ListNode last;
	
	public linkedList()
	{
		ListNode tmp = new ListNode();
		head = tmp;
		last = head;		
	}
	public void add(Integer data)
	{
		ListNode current = new ListNode(data);
		
		// O(1): Complexity
		last.next = current;
		last = current;
		size++;
		
		
	}
	public void display()
	{
		for(ListNode tmp=head.next;tmp!=null;tmp=tmp.next )
		{
			System.out.println(tmp.data);
		}
	}
	public int size()
	{
		return size;
	}
}
