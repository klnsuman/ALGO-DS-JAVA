package sorts;
import java.util.Random;

public class bubbleSort {
	
	public static void sort(int[] in)
	{
		int n = in.length;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				if(in[j+1] < in[j])
				{
					
					int temp = in[j+1];
					in[j+1] = in[j];
					in[j] =  temp;
					//break;
				}
			}
			
		}
	}
	
	public static void printArray(int[] in) {
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
		
		printArray(in);
		sort(in);
		System.out.println("");
		printArray(in);
	}
}
