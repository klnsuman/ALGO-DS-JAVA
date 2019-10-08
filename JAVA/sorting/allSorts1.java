package sorts;
import java.util.Random;

public class allSorts1 {
	
	
	public int[] bubbleSort(int[] aux) {
		
		int n = aux.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(aux[j] > aux[j+1]) {
					int temp = aux[j+1];
					aux[j+1] = aux[j];
					aux[j] = temp;
				}
			}
		}
		
		return aux;
	}
	
	public  int[] selectionSort(int[] aux) {
		int n = aux.length;
		
		for(int i=0;i<n-1;i++) {
			int min_idx = i;
			
			for(int j=i+1;j<n;j++) {
				if(aux[min_idx] > aux[j]) {
					min_idx = j;
				}
			}
			int temp = aux[i];
			aux[i] = aux[min_idx];
			aux[min_idx] = temp;
		}
		return aux;
		
	}
	
	public int[] insertionSort(int[] aux) {
		
		int n = aux.length;
		
		for(int i=1;i<n;i++) {
			
			int j = i-1;
			int key = aux[i];
			while(j>=0 && aux[j] > key) {
				aux[j+1] = aux[j];
				j--;
			}
			aux[j+1] = key;
		}
		
		return aux;
	}
	
	public void auxMergeSort(int[] in,int[] aux,int l,int r) {
		if(l<r) {
			int m = (l+r)/2;
			auxMergeSort(in,aux,l,m);
			auxMergeSort(in,aux,m+1,r);
			merge(in,aux,l,m,r);
		}
	}
	
	public void merge(int[] in,int[] aux,int l,int m,int r) {
		
		int ls = l, rs = m+1;
		int k=0;
		
		while(ls<=m && rs<=r) {
			if(in[ls]<in[rs]) {
				aux[k++] = in[ls++];
			}
			else
			{
				aux[k++] = in[rs++];
			}
		}
		
		while(ls<=m) {
			aux[k++] = in[ls++];
		}
		while(rs<=r) {
			aux[k++] = in[rs++];
		}
		int i = 0;
		while(i<k) {
			in[l++] = aux[i++];
		}
	}
	
	public void mergeSort(int[] in) {
		int[] aux = new int[in.length];
		auxMergeSort(in,aux,0,in.length-1);
	}
	public void printArray(int[] hlp) {
		for(int i=0;i<10;i++) {
			System.out.print(hlp[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		allSorts1 alls = new allSorts1();
		int[] in = new int[10];
		Random r = new Random();
		for(int i=0;i<10;i++) {
			in[i] = r.nextInt(100);
		}
		
		int[] inp1 = in; 
		int[] inp2 = in;
		
		/* Bubble Sort - Starts */
		
		System.out.println("=== Original Array===");
		alls.printArray(in);
		System.out.println("\n=== Original Array===");
		
		int[] bs_out = alls.bubbleSort(in);
		
		System.out.println("=== After BS Array==={{");
		alls.printArray(bs_out);
		System.out.println("\n=== After BS Array===}}");
		
		/* Bubble Sort - Ends */
		
		
		/* Selection Sort - Start */
		
		for(int i=0;i<10;i++) {
			in[i] = r.nextInt(100);
		}
		
		System.out.println("\n===2 Original Array==={{");
		alls.printArray(in);
		System.out.println("\n===2 Original Array===}}");
		
		int[] sel_out = alls.selectionSort(in);
		
		System.out.println("=== After SS Array===");
		alls.printArray(sel_out);
		System.out.println("\n=== After SS Array===");
		/* Selection Sort - Ends */
		
		/* Insertion Sort - Start */
		
		for(int i=0;i<10;i++) {
			in[i] = r.nextInt(100);
		}
		
		System.out.println("\n===3 Original Array==={{");
		alls.printArray(in);
		System.out.println("\n===3 Original Array===}}");
		
		int[] ins_out = alls.insertionSort(in);
		
		System.out.println("=== After IS Array==={{");
		alls.printArray(ins_out);
		System.out.println("\n=== After IS Array===}}");
		
		/* Insertion Sort - Ends */
		
		/* ******** Merge Sort ***************
		 * 1 3 2
		 * 
		 * ---->
		 *    l = 0 , r = 2
		 *    m = 1
		 *    
		 *    mergeSort(0,1)    ==> m=0  :: mergeSort(0,0)   +   mergeSort(1,1)  ==> 1   1   3
		 *    mergeSort(2,2)    ==> m=2  :: mergeSort(2,2)	 + 	 mergeSort(3,2)	 ==> 2   2   2
		 *    merge(0,1,2)   +  merge (2,2,2)
		 * ---->   
		 * ************************************/
		
		/* Merge Sort - Start */
		
		for(int i=0;i<10;i++) {
			in[i] = r.nextInt(100);
		}
		
		System.out.println("\n===4 Original Array==={{");
		alls.printArray(in);
		System.out.println("\n===4 Original Array===}}");
		
		alls.mergeSort(in);
		
		System.out.println("=== After MergS Array==={{");
		alls.printArray(in);
		System.out.println("\n=== After MergS Array===}}");
		
		/* Merge Sort - Ends */
		
		
/* Merge Sort - Start */
		
		for(int i=0;i<10;i++) {
			in[i] = r.nextInt(100);
		}
		
		System.out.println("\n===4 Original Array==={{");
		alls.printArray(in);
		System.out.println("\n===4 Original Array===}}");
		
		alls.mergeSort(in);
		
		System.out.println("=== After MergS Array==={{");
		alls.printArray(in);
		System.out.println("\n=== After MergS Array===}}");
		
		/* Merge Sort - Ends */
		
		
	}

}
