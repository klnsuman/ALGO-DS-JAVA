package Algorithmica;
import java.util.*;

public class FindCommonElementsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = Integer.parseInt(args[0]);
		int[] in1,in2;
		in1 = new int[n];
		in2 = new int[n];
		
		Random r = new Random();
		
		for(int i=0;i<in1.length;i++)
		{
			in1[i] = r.nextInt(n);
			in2[i] = r.nextInt(n);
			//System.out.println("in1->"+in1[i]);
			//System.out.println("in2->"+in2[i]);
		}
		
		//Scanner s = new Scanner(System.in);
		
		long start = System.currentTimeMillis();
		FindCommonElements1 fe1 = new FindCommonElements1();
		int count = fe1.getCount(in1,in2);
		long end = System.currentTimeMillis();
		
		System.out.println(count);
		System.out.println("Time taken:" + (end - start) / 1000.0 + " seconds");
		
	}

}
