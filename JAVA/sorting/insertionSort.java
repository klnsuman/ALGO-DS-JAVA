package sorts1;

import java.util.Random;

public class insertionSort {

	
	public void insSort(int[] in) {
		
		int n = in.length;
		
		for(int i=1;i<n;i++) {
			
			int j = i-1;
			int min = in[i];
			
			while(j>=0 && in[j]>=min) {
				in[j+1] = in[j];
				j--;
			}
			in[j+1] = min;
		}
		
		
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
		insertionSort is = new insertionSort();
		
		is.printArray(in);
		is.insSort(in);
		System.out.println("");
		is.printArray(in);
	}
}
