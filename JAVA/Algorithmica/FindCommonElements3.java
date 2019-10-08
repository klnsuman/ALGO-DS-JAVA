package Algorithmica;

import java.util.Arrays;

/*********************
 * 
 * @author klrao
 * Find Common Elements by 
 * - Sorting Array 1
 * - Binary search on another Array.
 * -
 * I/p :  array1[]  : {1,2,3,4,5}
 *        array2[]  : {1,2,3,4,5}
 * O/p : Number of Common Elements = 5       
 */
public class FindCommonElements3 {
	public int getCount(int[] a, int[] b)
	{	
		int count=0;
		int i=0,j=0;
		//nlogn
		Arrays.sort(a);
		//nlogn
		for(i=0;i<b.length;i++)
		{
			if(Arrays.binarySearch(a, b[i])>=0)
				count++;
		}
		return count;
	}	
}
