package linkedlistprobs;
import java.util.Random;
public class testRandomToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nones=0;
		int nzeros=0;
		Random r = new Random();
		for(int i=0;i<=100;i++)
		{
			//;
			System.out.println(r.nextInt(2));
			if(r.nextInt(2)==0) nzeros++;
			else nones++;
				
		}
		System.out.println("no of ones"+nones);
		System.out.println("no of Zeros"+nzeros);
	}

}
