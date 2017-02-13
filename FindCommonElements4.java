package Algorithmica;

import java.util.Arrays;
import java.util.HashSet;


public class FindCommonElements4 {
	public int getCount(int[] a, int[] b)
	{	
		int count=0;
		int i=0,j=0;
		HashSet<Integer> hset = new HashSet<Integer>();
		//nlogn
		for( i=0;i<a.length;i++)
		{
			hset.add(a[i]);
		}
		//nlogn
		for(j=0;j<b.length;j++)
		{
			if(hset.contains(b[j]))
				count++;
		}
		return count;
	}
	

}
