package Algorithmica;

import java.util.Arrays;

/*********************
 * 
 * @author klrao
 * Find Common Elements by 
 * - Sorting Array 1
 * - Sorting Array 2
 * -
 * I/p :  array1[]  : {1,2,3,4,5}
 *        array2[]  : {1,2,3,4,5}
 * O/p : Number of Common Elements = 5       
 */
public class FindCommonElements2 {
	public int getCount(int[] a, int[] b)
	{	
		int count=0;
		int i=0,j=0;
		// O(nlog(n))			Time Complexity Of Sorting N Elements
		Arrays.sort(a);
		// O(nlog(n))			Time Complexity Of Sorting N Elements
		Arrays.sort(b);
		// C*n <= 2*n
		while(i<a.length && j<a.length)
		{
			if(a[i] < a[j])
			{
				++i;
			}	
			else if(a[j] < a[i])
			{
				++j;
			}	
			else
			{	
				++i;++j;count++;
			}
		}
		return count;
	}

}
