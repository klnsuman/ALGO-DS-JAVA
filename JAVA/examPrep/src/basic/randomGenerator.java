package basic;

public class randomGenerator {
	
	private long seed;
	private final long  A = 5;
	private final long  B = 7;
	private final long  M = 1024;
	
	public randomGenerator() {
		this.seed = System.nanoTime();
	}
	
	public randomGenerator(int n) {
		this.seed = n;
	}
	public void getRandom(int n) {
		
		long tmp = (A*seed+B)%M;
		seed = tmp;
		System.out.println(tmp%n);
	}
	
	public static void main(String[] args) {
		
		randomGenerator rg = new randomGenerator(11);
		for(int i=0;i<=12;i++)
			rg.getRandom(10);
				
	}
	
}
