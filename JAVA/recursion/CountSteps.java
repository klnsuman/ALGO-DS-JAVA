package recursion;

public class CountSteps {

	public static int countSteps1(int n){
		
		if(n==1) return 1;
		if(n==2) return 2;
		if(n==3) return 4;
		
		int prev1 = countSteps1(n-1);
		int prev2 = countSteps1(n-2);
		int prev3 = countSteps1(n-3);
		
		return prev1 + prev2 + prev3;	
	}
	public static int countSteps2(int n){
		
		int[] mem = new int[n+1];
		if(n==1) return 1;
		if(n==2) return 2;
		if(n==3) return 4;
		if(mem[n]!=0) return mem[n];
		int prev1 = countSteps1(n-1);
		int prev2 = countSteps1(n-2);
		int prev3 = countSteps1(n-3);
		
		return mem[n]=prev1 + prev2 + prev3;	
	}
	public static int countSteps3(int n){
		
		int[] mem = new int[n+1];
		mem[1] = 1;
		mem[2] = 2;
		mem[3] = 4;
		if(mem[n]!=0) return mem[n];
		for(int i=4;i<=n;++i){
			mem[i] = mem[i-1]+mem[i-2]+mem[i-3];
		}
		return mem[n];			
	}
	
	public static void main(String[] args){
		
		int csteps = countSteps1(4);
		System.out.println("csteps->"+csteps);
		
		int csteps1 = countSteps2(4);
		System.out.println("csteps->"+csteps1);
		
		
		int csteps2 = countSteps3(4);
		System.out.println("csteps->"+csteps2);
	}
}
