package recursion;

public class towersofHanoi {
	
	private int counter =0;
	public void hanoi(int n, char src , char aux , char target)
	{
		if(n==0) return;
		
		hanoi(n-1,src,target,aux);
		counter++;
		
		hanoi(n-1,aux,src,target);
		System.out.println("src->"+src+" Aux->"+aux+" target->"+target);
		
	}
	
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		towersofHanoi toh = new towersofHanoi();
		toh.hanoi(n, 'A', 'B', 'C');
	    System.out.println("No. Of Moves->"+toh.counter);
	}
}
