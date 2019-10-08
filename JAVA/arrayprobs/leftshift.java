package arrayprobs;
import java.util.Random;

public class leftshift {

	public  int[] leftshiftarray(int[] a,int shift)
	{
		int newarray[] =  new int[a.length];
		int newarray1[] =  new int[a.length];
		int newarray2[] =  new int[a.length];
		int N = a.length; 
		for(int i=0;i<a.length;i++)
		{
			newarray[i] = a[(i+N-shift)%N];
			newarray1[i] = a[N-i-1];
			newarray2[i] = a[(N-i+shift)%N];
		}
		
		System.out.println("New Array 1 ");
		System.out.println("======");
		for(int i=0;i<N;i++)
			
		{
			
			System.out.print(newarray1[i]+" ");
		}
		System.out.println("");
		System.out.println("New Array 2 ");
		System.out.println("======");
		for(int i=0;i<N;i++)			
		{
			
			System.out.print(newarray2[i]+" ");
		}
		System.out.println("");
		return newarray;
	}
	
	public static void main(String[] args)
	{
		int n = 4;
		int shift = 2;
		Random r = new Random();
		int in[] = new int[n];
		for(int i=0;i<n;i++)
		{
			in[i] = r.nextInt()+1;
			System.out.print(in[i] +" ");
		}
		leftshift ls = new leftshift();
		System.out.println("");
		int[] newarray = ls.leftshiftarray(in,shift);
		
		System.out.println(in);
		System.out.println(newarray);
		for(int i=0;i<n;i++)
		{
			System.out.print(in[i]+" ");
			
			
			
		}
		System.out.println(" ");
		System.out.println("======");
		for(int i=0;i<n;i++)
		{
			
			System.out.print(newarray[i]+" ");
		}
		
		
		// a[ 2 5 7 6]
		// a[ 7 6 2 5]
		
		// a[308418915   -1746290965   -1891390506   544675253]
		// a[   -1891390506   544675253 308418915   -1746290965]

	}
}
