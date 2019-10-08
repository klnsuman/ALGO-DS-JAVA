package sorts1;

import java.util.Random;

public class selectionSort {

	public void selSort(int[] in) {
		
		int n = in.length;
		
		for(int i=0;i<n;i++) {
			int min_idx=i;
			for(int j=i+1;j<n;j++) {
				if(in[min_idx] > in[j]) {
					 min_idx = j;
				}
			}
			int temp = in[i];
			in[i] = in[min_idx];
			in[min_idx] = temp; 
			
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
		selectionSort ss = new selectionSort();
		
		ss.printArray(in);
		ss.selSort(in);
		System.out.println("");
		ss.printArray(in);
	}
}
