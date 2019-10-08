

public class ArrayTest{
	public static void main(String[] args){
		System.out.println("\n---------Start of Test Arrays-----------");
		int marks[];				// Array Declaration
		marks = new int[3];			// Assign Memory to Hold Items
		marks[0] = 1;
		marks[1] = 2;
		marks[2] = 3;
		System.out.println("\n---------End Of Test Arrays-----------");
		for (int i=0;i<3;i++)
		{
			System.out.println("\nElement "+i+" is => "+marks[i]);
		}
		
		int percentage[] = new int[3];
		percentage[0] = 10;
		percentage[1] = 20;
		percentage[2] = 30;
		
		for (int i=0;i<3;i++)
		{
			System.out.println("\nElement "+i+" is => "+percentage[i]);
		}
	}

}