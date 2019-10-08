package dynamicprog;



public class fibonacci {

	/*
	 *  0 1 1 2 3 5 8 13 21 
	 *    1 2 3 4 5 6  7  8
	 */
	public int getFib(int n,int[] aux) {
		
		return n;
	}
	public static void main(String[] args) {
		
		fibonacci f = new fibonacci();
		System.out.println("======");
		int n = 8;
		
		int aux[] = new int[n+1];
		
		for(int i=0;i<=2;i++)
		{
			aux[i] = i;
		}		
		
		for(int i=3;i<n;i++) {
			
			aux[i] = aux[i-1]+ aux[i-2];
		}
		
		System.out.println(aux[n-1]); 
	}
}
