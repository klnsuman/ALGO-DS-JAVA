package basic;
import java.util.Arrays;
import java.util.Random;

public class twoSum {
	
	public static  boolean getTwoSum(int[] in,int srch) {
		
		for(int i=0;i<in.length;i++)
		{
			for(int j=0;j<in.length;j++)
			{
				if(i != j)
				{
					if(in[i] + in[j] == srch) return true;
				}
			}
		}
		return false;
	}
	
	public static  boolean getTwoSum1(int[] in,int srch) {
		
		int rem = srch - in[0];
		for(int i=1;i<in.length;i++)
		{
			if(Arrays.binarySearch(in, i, in.length, srch - in[i])>=0) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		int[] in = new int[10];
		
		Random r = new Random();
		
		for(int i=0;i<10;i++) {
			in[i] = r.nextInt(5);
			System.out.println(in[i]);
		}
		
		
		int srch = r.nextInt(10);
		System.out.println("srch:"+srch);
		if(getTwoSum(in,srch))
			System.out.println("Present");
		else
			System.out.println("Not Present");
		
		if(getTwoSum1(in,srch))
			System.out.println("Present");
		else
			System.out.println("Not Present");
		
	}

}
