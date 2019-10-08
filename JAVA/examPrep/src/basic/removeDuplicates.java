package basic;

import java.util.Random;

public class removeDuplicates {
	
	public static void removeDuplicates1(int[] in) {
		
		for(int i=0;i<in.length;i++)
		{
			for(int j=0;j<in.length;j++)
			{
				if(i!=j && in[j]!= Integer.MAX_VALUE) {
					if(in[i] == in[j])
						in[j] = Integer.MAX_VALUE;
				}
					
			}
		}
		int[] out = new int[in.length];
		int k=0;
		for(int i=0;i<in.length;i++)
		{
			if(in[i]!= Integer.MAX_VALUE)
			out[k++] = in[i];
		}
		System.out.println("===========");
		for(int i=0;i<k;i++)
		{
			System.out.println(out[i]);
		}
	}
	
	public static void removeDuplicates2(int[] in) {
		
		int i=0;
		for(int j=i+1;j<in.length;j++)
		{
			if(in[i] == in[j] && in[j] != Integer.MAX_VALUE)
			{
				i = j;
				in[j] = Integer.MAX_VALUE;
			}
			
		}
		int[] out = new int[in.length];
		int k=0;
		for(int l=0;l<in.length;l++)
		{
			if(in[l]!= Integer.MAX_VALUE)
			out[k++] = in[l];
		}
		System.out.println("22222===========");
		for(int l=0;l<k;l++)
		{
			System.out.println(out[l]);
		}
	}
	
	public static void main(String[] args) {
		
		int[] in = new int[10];
		
		Random r = new Random();
		for(int i=0;i<10;i++) {
			in[i] = r.nextInt(5);
		}
		
		for(int i=0;i<10;i++)
		System.out.println(in[i]);
		removeDuplicates1(in);
		//for(int i=0;i<10;i++)
		//	System.out.println(in[i]);
		removeDuplicates2(in);
			
	}

}
