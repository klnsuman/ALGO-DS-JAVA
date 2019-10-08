
public class ArrayTest1
{
	public static void main(String[] args){
		int nums[];					// declaration
		nums = new int[3];			// assigning memory
		
		int acctnum[] = new int[3];
		
		System.out.println("----------Begin Printing-------------");
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		for(int i=0;i<3;i++)
		{
			System.out.println("nums["+i+"] => "+nums[i]);
		}
		System.out.println("----------End Printing-------------");
	}
}