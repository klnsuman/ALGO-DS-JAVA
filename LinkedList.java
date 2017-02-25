package LinkedListTest;

public class LinkedList implements IList{
	
	ListNode head;
	int size;
	
	LinkedList()
	{
		ListNode tmp = new ListNode();
		
		head = tmp;
		head.next = null;	
		size++;
	}
	LinkedList(int data)
	{
		ListNode tmp = new ListNode(data);
		
		head = tmp;
		head.next = null;
		size++;
	}
	@Override
	public void insertAtBegin(int data) {
		
		if(head == null){
			ListNode tmp = new ListNode(data);
			head = tmp;
			System.out.println("Head Node ->"+head);
			System.out.println("Data in Head Node ->"+head.data);
			
			size++;
		}
		else{
			
			ListNode tmp = head;
			
			ListNode tmp1 = new ListNode(data);
			
			tmp1.next = head;
			head = tmp1;
			
			System.out.println("New Head Node ->"+head);
			System.out.println("New Data in Head Node ->"+head.data);
			size++;	
		}
	}
	@Override
	public void insertAtEnd(int data) {
		if(head == null)
		{
			ListNode tmp = new ListNode(data);
			head = tmp;
			System.out.println("Head Node ->"+head);
			System.out.println("Data in Head Node ->"+head.data);
			
			size++;
	
		}
		else
		{
			ListNode tmp = new ListNode(data);
			ListNode last = null;
			for (ListNode current = head;current!=null;current = current.next)
			{
				last = current;
			}
			System.out.println("Last node address->"+last);
			last.next = tmp;
			tmp.next = null;
			
			size++;
		}
	}
	
	public void insertAtPos(int data, int position) {
		
		System.out.println("Insert at Position ->"+position);
		if(position < 0)
		{
			position = 0;
			insertAtBegin(data);
		}
		else if (position > size)
		{
			position = size;
			System.out.println("Inserting at end");
			insertAtEnd(data);					
		}
		else
		{
			System.out.println("Else at Position ->"+position);
			ListNode tmp = new ListNode(data);
			System.out.println("New Node ->"+tmp);
			ListNode current = head;
			for(int i=1;i<=position;i++)
			{
				current = current.next;
			}
			System.out.println("head ->"+head);
			System.out.println("current ->"+current);
			ListNode tmp1 = null;
			
			tmp1 = current.next;
			current.next = tmp;
			tmp.next = tmp1;
			size++;
		}
		
	}
	@Override
	public void display() {
	
		if (head == null){
			System.out.println("No Elements in list");
		}
		else
		{
			for(ListNode current = head;current!=null;current=current.next){
				System.out.println("Node Address ->"+current+" Data->"+current.data);
			}
		}
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
	@Override
	public void removeFromBegin() {
		if(head == null){
			System.out.println("No elements in List");
		}
		else
		{
			ListNode tmp = head;
			tmp = head.next;
			head = tmp;
			size--;
			
		}
		
		
	}
	@Override
	public void removeFromEnd() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeFromPosition() {
		// TODO Auto-generated method stub
		
	}
	
	
}
