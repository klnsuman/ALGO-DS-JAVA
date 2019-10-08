package BasicThinking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
public class RemoveDuplicates {

	/*
	 * Remove Duplicates 1 is Adhoc Strategy
	 */
	static int duplicates;
	public static int[] removeDuplicates1(int[] in){
		
		int[] out={0};
		
		for(int i=0;i<in.length;i++){
			for(int j=0;j<in.length;j++){
				if(in[i] == in[j]){
					in[j] = Integer.MIN_VALUE;
					duplicates++;
				}
			}
		}
		int i=0;
		for(int k=0;k<in.length;k++){
			if(in[k] != Integer.MIN_VALUE)
			{
				out[i] = in[k];
				i++;
			}
		}
		return out;
	}
	public static int[] removeDuplicates2(int[] in){
		
		int[] out={0};
		
		Arrays.sort(in);
		for(int i=0,j=0;i<in.length;i=j)
		{
			j = j+1;
			while(in[j] == in[i] && j<in.length){
				
				in[j] = Integer.MIN_VALUE;
				j++;
				duplicates++;
			}
		}
		int i= 0;
		for(int k=0;k<in.length;k++)
		{
			if(in[k]!=Integer.MIN_VALUE)
			{
				out[i] = in[k];
			}
			i++;
			
		}
		return out;
	}
	public static  int[] removeDuplicates3(int[] in){
		
		int[] out={0}; 
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int i=0;i<in.length;i++)
		{
			if(!hset.contains(in[i])){
				hset.add(in[i]);
				duplicates++;
			}
		}
		int i=0;
		for(int k=0;k<in.length;k++){
			out[k] = in[k];
		}
		
		return out;
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] in = new int[n];
		Random r = new Random();
		
		for(int i=0;i<n;i++)
		{
			in[i] = r.nextInt();
			System.out.println(in[i]);
		}
		
		int out[] = removeDuplicates1(in);

	}

}
