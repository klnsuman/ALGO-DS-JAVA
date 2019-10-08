package random;
import java.util.Arrays;
public class RandomGeneratorMy {

	private long seed;
	private int A=5;
	private int B=11;
	private int M=1024;
	
	public RandomGeneratorMy()
	{
		this.seed = System.nanoTime();
	}
	public RandomGeneratorMy(long seed)
	{
		this.seed = seed;
	}
	
	public long randomGenerator1(int n)
	{		
		return seed%n;
	}
	public long randomGenerator2(int n)
	{		
		int[] obj = new int[1];
		System.out.println(obj);
		return 0;
	}
	public long randomGenerator3(int n)
	{
		long tmp = (A*seed + B)%M;
		
		seed = tmp;
		return tmp%n;
	}
	public static void main(String[] args) {
		RandomGeneratorMy r = new RandomGeneratorMy();
		int[] counts = new int[5];
		long tmp;
		int n=5;
		for(int i=1;i<=20;i++)
		{
			tmp = r.randomGenerator1(n);
			counts[(int)tmp]++;
		}
		System.out.println(Arrays.toString(counts));
		int[] counts1 = new int[5];
		for(int i=1;i<=20;i++)
		{
			tmp = r.randomGenerator3(n);
			counts1[(int)tmp]++;
		}
		System.out.println(Arrays.toString(counts1));

	}

}
