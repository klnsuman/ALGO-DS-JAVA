package sorts1;

import java.util.Random;

/*
 *   10 60 40 30 50
 *   i = 0
 * */
 
public class quickSort {
	
	public int partition(int[] in,int low,int high) {
		
		int pivot = in[high];
		int j=0 , i=j-1;
		
		while(j < high) {
			if(in[j]<=pivot)
			{
				i++;
				int temp = in[i];
				in[i] = in[j];
				in[j] = in[i];
			}
			j++;
		}
		
		int temp = in[i+1];
		in[i+1] = in[high];
		in[high] = temp;
		return pivot;
	}
	
	public void auxSort(int[] in,int low,int high) {
		
		if(low<high) {
			int pi = partition(in,low,high);
			auxSort(in, low,pi-1);
			auxSort(in, pi+1,high);
		}
	}
	
	public void qSort(int[] in) {
		int n = in.length;
		auxSort(in,0,n-1);
	}
	public void printArray(int[] in) {
		for(int i=0;i<10;i++){
			System.out.print(" "+in[i]);
		}
	}
	public static void main(String[] args) {
		
		int[] in = new int[10];
		
		Random r = new Random();
		for(int i=0;i<10;i++) {
			in[i] = r.nextInt(100);
		}
		mergeSort ms = new mergeSort();
		
		ms.printArray(in);
		ms.mSort(in);
		System.out.println("");
		ms.printArray(in);
	}

}
