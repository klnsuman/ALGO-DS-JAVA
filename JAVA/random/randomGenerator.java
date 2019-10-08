package random;
import java.util.Random;
import java.util.*;
public class randomGenerator {
	private long seed;
	private static final int A = 5;
	private static final int B = 7;
	private static final int M = 1024;
	public  randomGenerator()
	{	
		this.seed = System.nanoTime();
	}
	public  randomGenerator(long seed)
	{	
		this.seed = seed;
	}
	public long radomGen1(int n)
	{
		return System.nanoTime()%n;
	}
	public int radomGen2()
	{
		int[] obj = new int[1];
		System.out.println(obj);
		return 0;
	}
	public long randomGen3(int n)
	{
		long tmp = (A*seed + B)%M;
		seed = tmp;
		return tmp%n;
	}
	public static void main(String[] args){
		
		
		randomGenerator r = new randomGenerator();
		for(int i=1;i<=10;i++)
		r.radomGen2();
		System.out.println("-----------");
		for(int i=1;i<=10;i++)
			System.out.println(r.radomGen1(10));
		System.out.println("-----------");
		int[] counts = new int[10];
		for(int i = 1; i <= 10; ++i) {
			long tmp = r.radomGen1(10);
			counts[(int)tmp]++;
			System.out.println(tmp);
		}
		System.out.println(Arrays.toString(counts));
		System.out.println("-----------");

		
		System.out.println("-----------");
		for(int i=1;i<=10;i++)
			System.out.println(r.randomGen3(10));
	}
	
}
