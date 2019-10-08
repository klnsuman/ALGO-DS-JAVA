package tree;
import java.util.Random;

public class treeTest {

	public static void main(String[] args)
	{
		buildTree bt = new buildTree(5);
		
		Random r = new Random();
		
		for(int i=0;i<10;i++)
		{
			bt.add(r.nextInt());
		}
			
		bt.print(bt.getRoot());
	}
}
