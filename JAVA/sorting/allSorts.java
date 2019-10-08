package sorts;

import java.util.Random;

public class allSorts {

	/* Bubble Sort - Start */
	public static int[] bubbleSort(int[] aux)
	{
		System.out.println("Bubble Sort");
		int n = aux.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(aux[j]>aux[j+1]) {
					int temp = aux[j+1];
					aux[j+1] = aux[j];
					aux[j] = temp;
				}
			}
		}
		
		return aux;
	}
	/* Bubble Sort - End */
	
	/* Selection Sort - Start */
	public static int[] selectionSort(int[] aux) {
		System.out.println("Selection Sort");
		int n= aux.length;
		for(int i=0;i<n;i++)
		{
			int min_idx = i;
			for(int j=i+1;j<n-1;j++)
			{
				if(aux[j]< aux[min_idx]) {
					min_idx = j;
				}
			}
			aux[i] = aux[min_idx];
		}
		
		return aux;
	}
	/* Selection Sort - END */
	
	/* Insertion Sort - Start */
	public static int[] insertionSort(int[] aux)
	{
		System.out.println("Insertion Sort");
		int n = aux.length;
		
		for(int i=0;i<n-1;i++)
		{
			int j = i - 1;
			int key = aux[i];
			while(j>=0 && aux[j]>key) {
				
				aux[j+1] = aux[j];       /* 2 4 5  3 */
				j=j-1;
			}
			aux[j+1] = key;
		}
		return aux;
	}
	
	/* Insertion Sort - End */
	
	/* Merge Sort - Start */
	// 1. Sort 
	// 2. Merge
	public static void merge(int[] aux,int l,int m, int r) {
		
	}
	public static void auxMergeSort(int[] aux, int l, int r) {
		
		if(l>r) return;
		int m = (l+r)/2;
		auxMergeSort(aux,l,m);
		auxMergeSort(aux,m+1,r);
		merge(aux,l,m,r);
	}
	public static void mergeSort(int[] aux) {
		auxMergeSort(aux,0,aux.length -1);
	}
	/* Merge Sort - End */
	
	
	public static void printArray(int[] tmp) {
		int n = tmp.length;
		System.out.println();
		for(int i=0;i < 10;i++) {
			System.out.print(tmp[i]+" ");
		}
	}
	public static void main(String args[]) {
		int[] in = new int[10];
		
		Random r = new Random();
		for(int i=0;i<10;i++)
		{
			in[i] = r.nextInt(50);
		}
		
		printArray(in);
		int[] out = bubbleSort(in);
		printArray(out);
		int[] out1 = selectionSort(in);
		printArray(out1);
		
		int[] out2 = insertionSort(in);
		printArray(out2);
	}
}
