package recursion;

public class Fibonacci {
	
	public int Fib(int n)
	{
		if(n==1) return 1;
		if(n==2) return 1;
		int Fib1 = Fib(n-1);
		int Fib2 = Fib(n-2);
		return Fib1+ Fib2;
	}
	public int Fib1(int n)
	{
		int[] mem = new int[n+1];
		
		int fib = auxFib(n,mem);
		return fib;
	}
	public int auxFib(int n , int[] mem)
	{
		mem[1] = mem[2] = 1;
		
		if(mem[n]!=0) return mem[n];
		int prev1 = auxFib(n-1,mem);
		int prev2 = auxFib(n-1,mem);
		return mem[n] = prev1 + prev2;
	}
	
	public int Fib3(int n)
	{
		int[] mem = new int[n+1];
		mem[1] = mem[2] = 1;
		
		for(int i=3;i<=n;++i){
			mem[i] = mem[i-1] + mem[i-2];
		}
		return mem[n];
	}
	public static void main(String[] args)
	{
		Fibonacci f = new Fibonacci();
		
		//int fib = f.Fib(10);
		//System.out.println(fib);
		
		//Fibonacci f1 = new Fibonacci();
		
		//int fib1 = f1.Fib(10);
		//System.out.println(fib1);
		
		Fibonacci f2 = new Fibonacci();
		
		int fib2 = f2.Fib3(4);
		System.out.println(fib2);
	}

}
