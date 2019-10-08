package recursion;

/*
 *  0 1 1 2 3 5 8
 */
public class fibonacci {
	
	public int getFib(int n) {
		
		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 1;
		
		return getFib(n-1)+getFib(n-2);
	}
	
	public static void main(String[] args) {
		
		fibonacci f = new fibonacci();
		System.out.println(f.getFib(5));
	}

}


