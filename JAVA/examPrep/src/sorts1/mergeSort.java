package sorts1;

import java.util.Random;

public class mergeSort {
	
	public void merge(int[] in,int[] aux,int  low,int mid,int high) {
		int ls = low,rs = mid+1;
		int k = 0;
		
		while(ls <= mid && rs <= high) {
			if(in[ls]<=in[rs]) {
				aux[k++] = in[ls++];
			}
			else
			{
				aux[k++] = in[rs++];
			}
			
		}
		
		while(ls<=mid) {
			aux[k++] = in[ls++];
		}
		
		while(rs<=high) {
			aux[k++] = in[rs++];
		}
		
		int i = 0 ;
		
		while(i<k) {
			in[low+i] = aux[i];
			i++;
		}
	}
	public void auxMSort(int[] in,int[] aux,int low,int high ) {
		
		if(low<high) {
			int mid = (low+high)/2;
			
			auxMSort(in,aux,low,mid);
			auxMSort(in,aux,mid+1,high);
			
			merge(in,aux,low,mid,high);
		}
	}
	public void mSort(int[] in) {
		int n = in.length;
		int[] aux = new int[n];
		auxMSort(in,aux,0,n-1);
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
