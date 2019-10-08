package mergetwoarrays;

//import CtCILibrary.AssortedMethods;

public class mergeArrays {

	public static void mergeArrays(int[] in1 , int[] in2 , int lastIndex1 , int lastIndex2){
		
		int lIndex = lastIndex1 + lastIndex2;
		int[] target = new int[lIndex];
		int temp;
		
		while(lastIndex1>0 && lastIndex2>0)
		{
			if(in1[lastIndex1-1] < in2[lastIndex2-1])
			{
				target[lastIndex1-1] = in1[lastIndex1-1];
				lastIndex1--;
			}
			else
			{
				target[lastIndex2-1] = in2[lastIndex2-1];
				lastIndex2--;
			}
			
		}
	}
	public static void mergeArrays1(int[] a , int[] b , int lastA , int lastB){
		
	/*	int indexA = lastA - 1;
		int indexB = lastB - 1;
		int indexMerged = lastA + lastB - 1 ;
		while(indexB >= 0)
		{
			if(indexA >= 0 && a[indexA] < b[indexB])
			{
				a[indexMerged] = b[indexB];
				indexB--;
			}
			else
			{
				a[indexMerged] = a[indexA];
				indexA--;
			}
			indexMerged--;
		}*/
		int indexMerged = lastB + lastA - 1; /* Index of last location of merged array */
		int indexA = lastA - 1; /* Index of last element in array b */
		int indexB = lastB - 1; /* Index of last element in array a */
	    System.out.println("indexMerged-> "+indexMerged);
	    System.out.println("indexA-> "+indexA);
	    System.out.println("indexB-> "+indexB);
		/* Merge a and b, starting from the last element in each */
		while (indexB >= 0 && indexA >= 0) {
			System.out.println("indexMerged-> "+indexMerged);
		    System.out.println("indexA-> "+indexA);
		    System.out.println("indexB-> "+indexB);
			if (indexA >= 0 && a[indexA] < b[indexB]) { /* end of a is bigger than end of b */
				a[indexMerged] = b[indexB]; // copy element
				indexB--; 
			} else {
				a[indexMerged] = a[indexA]; // copy element
				indexA--;
			}
			indexMerged--; // move indices			
		}
	}
	public static void main(String[] args)
	{
		int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
		int[] b = {1, 4, 7, 6, 7, 7};
		mergeArrays1(a, b, 8, 6);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}
