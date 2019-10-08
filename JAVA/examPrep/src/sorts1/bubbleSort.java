package sorts1;

import java.util.Random;

public class bubbleSort {
	
	public void bSort(int[] in) {
		
		int n = in.length;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				
				if(in[j] > in[j+1]) {
					int temp = in[j];
					in[j] = in[j+1];
					in[j+1] = temp;
				}
				
			}
			
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
		bubbleSort bs = new bubbleSort();
		
		bs.printArray(in);
		bs.bSort(in);
		System.out.println("");
		bs.printArray(in);
	}

}
