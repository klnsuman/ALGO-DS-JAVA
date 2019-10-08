package sorts;

import java.util.Random;
public class selectionSort {
	
	public static void selSort(int[] in) {
		int n = in.length;
		
		for(int i=0;i<n-1;i++) {
			int min_idx = i;
			for(int j=i+1;j<n;j++)
			{
				if(in[j] < in[min_idx]) {
					min_idx = j;
				}
			}
			
			int temp = in[i];
			in[i] = in[min_idx];
			in[min_idx] = temp;
		}
	}
	
	public static void printArray(int[] in) {
		for(int i=0;i<in.length;i++) {
			System.out.print(in[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int[] in = new int[10];
		
		Random r = new Random();
		for(int i=0;i<10; i++)
		{
			in[i] = r.nextInt(100);
		}
		printArray(in);
		selSort(in);
		System.out.println("\n============");
		printArray(in);
	}

}
