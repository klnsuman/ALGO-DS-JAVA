package Algorithmica;

class ListNode
{
	Integer data;
	ListNode next;
	
	ListNode()
	{
		ListNode head = new ListNode();
		head.data = null;
		next = null;
		System.out.println("In ListNode Constructor");
	}
}

public class LinkedList implements IList {

	Integer data;
	ListNode current;
	public LinkedList()
	{
		data = null;
		current = new ListNode();
		current.next = null;
		System.out.println("In LinkedList Constructor");
	}
	
	public void add(Integer e) {
		current = new ListNode();
		
		
	}

	@Override
	public void display(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
