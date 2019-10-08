package BasicThinking;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String args[]){
		
		Queue<Integer> queue=new LinkedList<Integer>(); 
		
		queue.add(5);
		queue.add(6);
		
		int a  = queue.remove();
		
		System.out.println(a);
	}

}
