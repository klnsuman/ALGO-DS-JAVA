package sorts;
import java.util.Random;

public class allSorts3 {
	
	public int partition(int[] ip,int l,int r) {
		int pivot = ip[r];
		int i=l-1,j=l;
		
		while(ip[j] <= pivot) {
			i++;
		}
		int temp = ip[i+1];
		//ip[i+1] = pi;
		return l;
	}
	public void quickSort(int[] ip) {
		
		auxQuickSort(ip,0,ip.length-1);
	}
	public void auxQuickSort(int[] ip,int l,int r) {
		if(l<r) {
			int pi = partition(ip,l,r);
			
		}
	}
	public void merge(int[] ip,int[] aux,int l,int m,int r) {
		int ls=l,rs = m+1,k=0;
		
		while(ls <= m && rs <= r) {
			if(ip[ls] < ip[rs]) {
				aux[k++] = ip[ls++];
			}
			else
			{
				aux[k++] = ip[rs++];
			}
			
		}
		while(ls<=m) {
			aux[k++] = ip[ls++];
		}
		while(rs<=r) {
			aux[k++] = ip[rs++];
		}
		int i=0;
		while(i<k)
		{
			ip[l+i] = aux[i];
			i++;
		}
	}
	public void auxMergeSort(int[] ip,int[] aux,int l,int r) {
		
		if(l>=r) return;
			
			int m = (l+r)/2;
			 auxMergeSort(ip,aux,l,m);
			 auxMergeSort(ip,aux,m+1,r);
			 merge(ip,aux,l,m,r);
		
	}
	public void mergeSort(int[] ip) {
		int[] aux = new int[ip.length];
		auxMergeSort(ip,aux,0,ip.length-1);
	}
	
	public void printArray(int[] aux) {
		for(int i=0;i<10;i++) {
			System.out.print(aux[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] in = new int[10];
		
		Random r = new Random();
		
		System.out.println("======Array Before=======");
		for(int i=0;i<10;i++) {
			in[i] = r.nextInt(100);
		}
		
		allSorts3 alls = new allSorts3();
		alls.printArray(in);
		System.out.println("\n======Array After=======");
		alls.mergeSort(in);
		alls.printArray(in);
		
	}

}
