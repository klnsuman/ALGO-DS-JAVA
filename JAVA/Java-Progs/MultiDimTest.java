public class MultiDimTest
{
	public static void main(String[] args)
	{
		int[][] values = {
					{1,2,12,4},
					{3,4,34},
					{5,6,56,7,8}
		};
		
		System.out.println("Values "+values[1][1]);
		System.out.println("====================");
		System.out.println("Number of Rows "+values.length);
		System.out.println("Number of Columns "+values[0].length);
		System.out.println("Number of Columns "+values[1].length);
		System.out.println("Number of Columns "+values[2].length);
		System.out.println("====================");
		
		for (int row=0;row<values.length;row++)
		{
			for (int col=0;col<values[row].length;col++)
			{
				System.out.println("Values["+row+"]["+col+"]=>"+values[row][col]);
			}
			System.out.println("====================");
		}
		
		//  Rows Test
		int[][] tst = new int[2][];
		tst[0][1] = 01;
		tst[1][1] = 01;
		// tst[2][1] = 01;   --> This Assignment produces error
		
		//  Col Test
		int[][] tst = new int[][1];
		tst[0][1] = 01;
		tst[1][1] = 01;
		tst[2][1] = 01;
	}
}