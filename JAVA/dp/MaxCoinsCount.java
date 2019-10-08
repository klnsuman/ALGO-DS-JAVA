package dp;

import java.util.Arrays;
import java.util.Random;

public class MaxCoinsCount {
	
	public static int maxSum = 0;
	
	public static int getMaxCoinsCount1(int in[][])
	{
		auxMaxCoinsCount1(0,0,0,in);
		return maxSum;
	}
	public static void auxMaxCoinsCount1(int i,int j,int psum,int[][] in){
		if(i>=in.length || j>=in.length) return;
		
		if(i==in.length-1 || j==in.length-1){
			maxSum = Math.max(psum+in[i][j],maxSum);
		}
		auxMaxCoinsCount1(i+1,j,psum+in[i][j],in);
		auxMaxCoinsCount1(i,j+1,psum+in[i][j],in);
	}

	public static int getMaxCoinsCount2(int[][] in){
		maxSum = auxMaxCoinsCount2(in.length-1,in.length-1,in); 
		return maxSum;
	}
	public static int auxMaxCoinsCount2(int i , int j,int[][] in){
		if(i<0||j<0) return 0;
		int top  = auxMaxCoinsCount2(i-1,j,in);
		int left = auxMaxCoinsCount2(i,j-1,in); 
		return Math.max(top,left)+ in[i][j];
	}
	
	public static int getMaxCoinsCount3(int[][] in){
		int[][] mem=new int[in.length][in.length];
		maxSum = auxMaxCoinsCount3(in.length-1,in.length-1,in,mem); 
		return maxSum;
	}
	public static int auxMaxCoinsCount3(int i , int j,int[][] in,int[][] mem){
		if(i<0||j<0) return 0;
		
		if(mem[i][j]!=0) return mem[i][j];
		int top  = auxMaxCoinsCount2(i-1,j,in);
		int left = auxMaxCoinsCount2(i,j-1,in); 
		return mem[i][j] = Math.max(top,left)+ in[i][j];
	}
	
	public static int getMaxCoinsCount4(int[][] in){
		
		int n=in.length;
		int[][] mem = new int[n][n];
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				//System.out.println("i->"+i);
				mem[i][j] = Math.max(i-1<0?0:mem[i-1][j],j-1<0?0:mem[i][j-1]) + in[i][j];
				System.out.print("("+i+","+j+")" + "mem[i][j]->"+mem[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		
		return mem[in.length-1][in.length-1];
	}
	
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		Random r = new Random();
		int[][] in =  new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				in[i][j] = r.nextInt(10);				
			}
		}
		System.out.println("<--Array is --");
		for(int i = 0; i < in.length; ++i) {
			for(int j = 0; j < in.length; ++j) {
				System.out.print(in[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--Array is -->");
		System.out.println(getMaxCoinsCount1(in));
		System.out.println(getMaxCoinsCount2(in));		
		System.out.println(getMaxCoinsCount3(in));
		System.out.println("");
		System.out.println("");
		System.out.println(getMaxCoinsCount4(in));
	}
}
