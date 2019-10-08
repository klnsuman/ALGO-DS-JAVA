package linkedlistprobs;
import java.util.Random;
public class RandomNodeGenerator {

	public static ListNode randomGenerator1(ListNode head)
	{
		ListNode tmp = new ListNode();
		int size=0;
		for(tmp=head.next;tmp!=null;tmp=tmp.next)
		{
			size++;
		}
		Random r = new Random();
		ListNode tmp1 = head;
		int rindex = r.nextInt(size);
		System.out.println("rindex "+rindex);
		for(int i=0;i<=rindex;i++)
		{
			tmp1=tmp1.next;
		}
		System.out.println("data->"+tmp1.data);
		System.out.println("tmp1->"+tmp1);
		return tmp1;
	}
	//---------------------------
	// Coin Toss Experiment
	//---------------------------
	public static ListNode randomGenerator2(ListNode head)
	{
		ListNode tmp = new ListNode();
		int size=0;
		tmp = head.next;
		
		Random r = new Random();
		int rindex = r.nextInt(2);
		System.out.println("rindex "+rindex);
		ListNode tmp1 = head.next;
		for(tmp=head.next;tmp!=null;tmp=tmp.next)
		{
			if(rindex == 0)
				tmp1=tmp;
		}
		System.out.println("tmp1.data->"+tmp1.data);
		System.out.println("tmp1->"+tmp1);
		return tmp1;
	}
	
		/*****
		// To Do Below
		 */ 
		 
		//---------------------------
		// Coin Toss Experiment
		//---------------------------
		/*public static ListNode randomGenerator3(ListNode hea)
		{
			ListNode tmp = new ListNode();
			int size=0;
			Random r = new Random();
			int rindex = r.nextInt(2);
			for(tmp=head.next;tmp!=null;tmp=tmp.next)
			{
				size++;
				if(ri)
			}
			
			
			System.out.println("rindex "+rindex);
			System.out.println("tmp1.data->"+tmp1.data);
			System.out.println("tmp1->"+tmp1);
			return tmp1;
		}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		ListNode head = new ListNode();
		for(int i=0;i<=100;i++)
		{			
			TestLinkedList.addFirst(head,i);
		}
		TestLinkedList.display(head);
		System.out.println("random node 1->"+RandomNodeGenerator.randomGenerator1(head));
		System.out.println("random node 2->"+RandomNodeGenerator.randomGenerator2(head));
		

	}

}
