package linkedlistprobs;

public class TestLinkedList {

	public static void addFirst(ListNode head,Integer data)
	{
		ListNode tmp = new ListNode(data);
		
		
		tmp.next = head.next;
		head.next = tmp;
	}
	public static void display(ListNode head)
	{
		ListNode tmp;
		int i=0;
		for(tmp=head.next;tmp!=null;tmp=tmp.next)
		{
			System.out.println("Current->"+i+" "+tmp.data+" "+tmp);
			i++;
		}
	}
	public static ListNode getLastNode(ListNode head)
	{
		ListNode last;
		int i=0;
		for(last=head.next;last.next!=null;last=last.next)
		{
			System.out.println("Current-> "+i +" "+last.data);
		}
		return last;
	}
}
