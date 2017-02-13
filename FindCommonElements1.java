package Algorithmica;
/*********************
 * 
 * @author klrao
 * Find Common Elements by searching and comparing each element in array 1 with array 2
 * I/p :  array1[]  : {1,2,3,4,5}
 *        array2[]  : {1,2,3,4,5}
 * O/p : Number of Common Elements = 5       
 */
public class FindCommonElements1 {
	public int getCount(int[] a, int[] b)
	{	
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i] == b[j])
				{
					count++;
				}
			}
		}
		return count;
	}

}
